/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.daointerface;

// auto generated imports
import com.born.insurance.dal.dataobject.FormTemplateTabDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>form_template_tab</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/form_template_tab.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface FormTemplateTabDAO {
	/**
	 *  Insert one <tt>FormTemplateTabDO</tt> object to DB table <tt>form_template_tab</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into form_template_tab(id,template_id,name,code,raw_add_time) values (?, ?, ?, ?, ?)</tt>
	 *
	 *	@param formTemplateTab
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FormTemplateTabDO formTemplateTab) throws DataAccessException;

	/**
	 *  Update DB table <tt>form_template_tab</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update form_template_tab set template_id=?, name=?, code=? where (id = ?)</tt>
	 *
	 *	@param formTemplateTab
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FormTemplateTabDO formTemplateTab) throws DataAccessException;

	/**
	 *  Query DB table <tt>form_template_tab</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, template_id, name, code, raw_add_time, raw_update_time from form_template_tab where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return FormTemplateTabDO
	 *	@throws DataAccessException
	 */	 
    public FormTemplateTabDO findById(long id) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>form_template_tab</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from form_template_tab where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>form_template_tab</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, template_id, name, code, raw_add_time, raw_update_time from form_template_tab where (1 = 1)</tt>
	 *
	 *	@param formTemplateTab
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<FormTemplateTabDO>
	 *	@throws DataAccessException
	 */	 
    public List<FormTemplateTabDO> findByCondition(FormTemplateTabDO formTemplateTab, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>form_template_tab</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from form_template_tab where (1 = 1)</tt>
	 *
	 *	@param formTemplateTab
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(FormTemplateTabDO formTemplateTab) throws DataAccessException;

}