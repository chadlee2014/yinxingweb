package com.yinxing.common;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

@Component
public class BaseDAO<T> {
	protected static final String SUCCESS = "success";
	// ����������������������
//	 private Class<T> type;
//	
//	 protected BaseDAO(Class<T> type) {
//	 this.type = type;
//	 }

	private HibernateTemplate template;

	@Resource(name = "hibernateTemplate")
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	protected HibernateTemplate getTemplate() {
		return template;
	}

	protected void save(T o) {
		template.saveOrUpdate(o);
	}
	
	protected void saveAll(List<T> list){
		template.saveOrUpdateAll(list);
	}

	protected void clear() {
		template.flush();
		template.clear();
	}

////	protected void saveAll(List<T> list) {
////		template.saveOrUpdate(list);
////	}
//
//	// @SuppressWarnings("unchecked")
//	// protected T read(String id) {
//	// return (T) template.get(type, id);
//	// }

	protected void update(T o) {
		template.update(o);
	}

	protected void delete(T o) {
		template.delete(o);
	}

	protected void deleteAll(List<T> list) {
		template.deleteAll(list);
	}

	@SuppressWarnings( "unchecked" )
	protected List<T> createResult(final String queryString,
			final Object... params) {
		return this.getTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session) throws SQLException,
					HibernateException {
				Query query = session.createQuery(queryString);
				query.setCacheable(false);
				for (int i = 0; i < params.length; i++) {
					// Object o = params[i];
					query.setParameter(i, params[i]);
				}
				@SuppressWarnings("rawtypes")
                List list = query.list();

				session.close();

				return list;
			}

		});
	}

	@SuppressWarnings( "unchecked" )
	protected List<T> createResult(final String queryString) {
		return this.getTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session) throws SQLException,
					HibernateException {
				Query query = session.createQuery(queryString);
				query.setCacheable(false);

				@SuppressWarnings("rawtypes")
                List list = query.list();

				session.close();

				return list;
			}

		});
	}

//	@SuppressWarnings("unchecked")
//	protected T createUniqueResult(final String queryString) {
//		return (T) template.executeFind(new HibernateCallback() {
//			public Object doInHibernate(Session session) throws SQLException,
//					HibernateException {
//				Query query = session.createQuery(queryString);
//				query.setCacheable(false);
//
//				T result = (T) query.uniqueResult();
//
//				session.close();
//
//				return result;
//			}
//
//		});
//	}
//
//	@SuppressWarnings("unchecked")
//	protected T createUniqueResult(final String queryString,
//			final Object... params) {
//		return (T) template.executeFind(new HibernateCallback() {
//			public Object doInHibernate(Session session) throws SQLException,
//					HibernateException {
//				Query query = session.createQuery(queryString);
//				query.setCacheable(false);
//				for (int i = 0; i < params.length; i++) {
//					query.setParameter(i, params[i]);
//				}
//				T result = (T) query.uniqueResult();
//
//				session.close();
//
//				return result;
//			}
//
//		});
//	}

	/**
	 * @param index
	 *            ������
	 * @param pageSize
	 *            �������������� ������������������������������
	 */
	@SuppressWarnings({ "unchecked" })
	protected List<T> createResult(final Integer index, final Integer pageSize,
			final String queryString) {
		return this.getTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session) throws SQLException,
					HibernateException {
				Query query = session.createQuery(queryString);
				query.setFirstResult((index - 1) * pageSize);
				query.setMaxResults(pageSize);

				session.close();

				return query.list();
			}
		});
	}

	/**
	 * @param index
	 *            ������
	 * @param pageSize
	 *            �������������� ������������������������������
	 */
	@SuppressWarnings("unchecked")
	protected List<T> createResult(final Integer index, final Integer pageSize,
			final String queryString, final Object... params) {
		return template.executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session) throws SQLException,
					HibernateException {
				Query query = session.createQuery(queryString);
				for (int i = 0; i < params.length; i++) {
					query.setParameter(i, params[i]);
				}

				query.setFirstResult((index - 1) * pageSize);
				query.setMaxResults(pageSize);
				session.close();

				return query.list();
			}
		});
	}

	/**
	 * ����������������������
	 * 
	 * @param startIndex
	 *            ����������
	 * @param Size
	 *            ��������������
	 * @param queryString
	 *            ��������
	 * @return
	 */
	@SuppressWarnings("unchecked")
	protected List<T> createResultForStartIndex(final Integer startIndex,
			final Integer Size, final String queryString) {
		return template.executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session) throws SQLException,
					HibernateException {
				Query query = session.createQuery(queryString);
				query.setFirstResult(startIndex - 1);
				query.setMaxResults(Size);

				session.close();

				return query.list();
			}
		});
	}
	

	@SuppressWarnings("rawtypes")
	public List executeQuerySQL(final String queryString) {
//		List list = null;
//		Session session = template.getSessionFactory().getCurrentSession();
//		Transaction   t   =   session.beginTransaction();
//        try{         	
//        	list = session.createSQLQuery(queryString).list();
////           t.commit();
//        }catch(Exception exp){ 
//        	System.out.println(exp.getMessage());
//                t.rollback();
//        }finally{
//                session.close();
//        }
//        return list;
		
		return template.executeFind(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException,
                    SQLException {
				SQLQuery query = session.createSQLQuery(queryString);
				session.close();
				return query.list();
			}
		});
	}
	
	
	@SuppressWarnings("unchecked")
	protected int createCount(String queryString) {
		List<Long> result = template.find(queryString);
		return result.get(0).intValue();
	}
	
	protected int createCount(String queryString,final Object... params){
		List<T> list = createResult(queryString,params);
		return list.size();
	}
}
