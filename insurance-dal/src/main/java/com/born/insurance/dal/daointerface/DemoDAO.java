/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.daointerface;

// auto generated imports
import com.born.insurance.dal.dataobject.DemoDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>demo</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/demo.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface DemoDAO {
	/**
	 *  Insert one <tt>DemoDO</tt> object to DB table <tt>demo</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into demo(id,form_id,user_id,real_name,amount) values (?, ?, ?, ?, ?)</tt>
	 *
	 *	@param demo
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(DemoDO demo) throws DataAccessException;

	/**
	 *  Update DB table <tt>demo</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update demo set form_id=?, user_id=?, real_name=?, amount=? where (id = ?)</tt>
	 *
	 *	@param demo
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(DemoDO demo) throws DataAccessException;

	/**
	 *  Query DB table <tt>demo</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from demo where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return DemoDO
	 *	@throws DataAccessException
	 */	 
    public DemoDO findByFormId(long formId) throws DataAccessException;

	/**
	 *  Query DB table <tt>demo</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from demo where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return DemoDO
	 *	@throws DataAccessException
	 */	 
    public DemoDO findById(long id) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>demo</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from demo where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>demo</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from demo where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFormId(long formId) throws DataAccessException;

	/**
	 *  Query DB table <tt>demo</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from demo where (1 = 1)</tt>
	 *
	 *	@param demo
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<DemoDO>
	 *	@throws DataAccessException
	 */	 
    public List<DemoDO> findByCondition(DemoDO demo, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>demo</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from demo where (1 = 1)</tt>
	 *
	 *	@param demo
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(DemoDO demo) throws DataAccessException;

}