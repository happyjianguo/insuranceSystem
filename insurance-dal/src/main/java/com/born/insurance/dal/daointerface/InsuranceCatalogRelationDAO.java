/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.daointerface;

// auto generated imports
import com.born.insurance.dal.dataobject.InsuranceCatalogRelationDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>insurance_catalog_relation</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/insurance_catalog_relation.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface InsuranceCatalogRelationDAO {
	/**
	 *  Insert one <tt>InsuranceCatalogRelationDO</tt> object to DB table <tt>insurance_catalog_relation</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into insurance_catalog_relation(relation_id,parent_name,parent_id,child_name,child_id,type) values (?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param insuranceCatalogRelation
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(InsuranceCatalogRelationDO insuranceCatalogRelation) throws DataAccessException;

	/**
	 *  Update DB table <tt>insurance_catalog_relation</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update insurance_catalog_relation set parent_name=?, parent_id=?, child_name=?, child_id=?, type=? where (relation_id = ?)</tt>
	 *
	 *	@param insuranceCatalogRelation
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(InsuranceCatalogRelationDO insuranceCatalogRelation) throws DataAccessException;

	/**
	 *  Query DB table <tt>insurance_catalog_relation</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select relation_id, parent_name, parent_id, child_name, child_id, type from insurance_catalog_relation where (relation_id = ?)</tt>
	 *
	 *	@param relationId
	 *	@return InsuranceCatalogRelationDO
	 *	@throws DataAccessException
	 */	 
    public InsuranceCatalogRelationDO findById(long relationId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>insurance_catalog_relation</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from insurance_catalog_relation where (relation_id = ?)</tt>
	 *
	 *	@param relationId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long relationId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>insurance_catalog_relation</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from insurance_catalog_relation where (child_id = ?)</tt>
	 *
	 *	@param childId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByChildId(long childId) throws DataAccessException;

	/**
	 *  Query DB table <tt>insurance_catalog_relation</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select relation_id, parent_name, parent_id, child_name, child_id, type from insurance_catalog_relation where (1 = 1)</tt>
	 *
	 *	@param insuranceCatalogRelation
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<InsuranceCatalogRelationDO>
	 *	@throws DataAccessException
	 */	 
    public List<InsuranceCatalogRelationDO> findByCondition(InsuranceCatalogRelationDO insuranceCatalogRelation, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>insurance_catalog_relation</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from insurance_catalog_relation where (1 = 1)</tt>
	 *
	 *	@param insuranceCatalogRelation
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(InsuranceCatalogRelationDO insuranceCatalogRelation) throws DataAccessException;

}