/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.daointerface;

// auto generated imports
import com.born.insurance.dal.dataobject.CommissionInfoDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>commission_info</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/commission_info.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface CommissionInfoDAO {
	/**
	 *  Insert one <tt>CommissionInfoDO</tt> object to DB table <tt>commission_info</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into commission_info(commission_info_id,business_bill_id,business_user_id,business_user_name,commission_catalog,commission_scale,commission_amount,raw_add_time,update_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param commissionInfo
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(CommissionInfoDO commissionInfo) throws DataAccessException;

	/**
	 *  Update DB table <tt>commission_info</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update commission_info set business_bill_id=?, business_user_id=?, business_user_name=?, commission_catalog=?, commission_scale=?, commission_amount=?, update_add_time=? where (commission_info_id = ?)</tt>
	 *
	 *	@param commissionInfo
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(CommissionInfoDO commissionInfo) throws DataAccessException;

	/**
	 *  Query DB table <tt>commission_info</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select commission_info_id, business_bill_id, business_user_id, business_user_name, commission_catalog, commission_scale, commission_amount, raw_add_time, update_add_time from commission_info where (commission_info_id = ?)</tt>
	 *
	 *	@param commissionInfoId
	 *	@return CommissionInfoDO
	 *	@throws DataAccessException
	 */	 
    public CommissionInfoDO findById(long commissionInfoId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>commission_info</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from commission_info where (commission_info_id = ?)</tt>
	 *
	 *	@param commissionInfoId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long commissionInfoId) throws DataAccessException;

	/**
	 *  Query DB table <tt>commission_info</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select commission_info_id, business_bill_id, business_user_id, business_user_name, commission_catalog, commission_scale, commission_amount, raw_add_time, update_add_time from commission_info where (1 = 1)</tt>
	 *
	 *	@param commissionInfo
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<CommissionInfoDO>
	 *	@throws DataAccessException
	 */	 
    public List<CommissionInfoDO> findByCondition(CommissionInfoDO commissionInfo, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>commission_info</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from commission_info where (1 = 1)</tt>
	 *
	 *	@param commissionInfo
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(CommissionInfoDO commissionInfo) throws DataAccessException;

	/**
	 *  Query DB table <tt>commission_info</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select commission_info_id, business_bill_id, business_user_id, business_user_name, commission_catalog, commission_scale, commission_amount, raw_add_time, update_add_time from commission_info where (business_bill_id = ?)</tt>
	 *
	 *	@param businessBillId
	 *	@return CommissionInfoDO
	 *	@throws DataAccessException
	 */	 
    public CommissionInfoDO findCommissionInfoByBusinessBillId(long businessBillId) throws DataAccessException;

}