/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.daointerface;

// auto generated imports
import com.born.insurance.dal.dataobject.PersonCommissionProcessDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import com.yjf.common.lang.util.money.Money;

/**
 * A dao interface provides methods to access database table <tt>person_commission_process</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/person_commission_process.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface PersonCommissionProcessDAO {
	/**
	 *  Insert one <tt>PersonCommissionProcessDO</tt> object to DB table <tt>person_commission_process</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into person_commission_process(commission_process_id,settlement_number,business_user_id,business_user_name,business_user_mobile,business_user_cert_no,apply_draw_amount,status,reason,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param personCommissionProcess
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(PersonCommissionProcessDO personCommissionProcess) throws DataAccessException;

	/**
	 *  Update DB table <tt>person_commission_process</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update person_commission_process set business_user_id=?, settlement_number=?, business_user_name=?, business_user_mobile=?, business_user_cert_no=?, apply_draw_amount=?, status=?, reason=? where (commission_process_id = ?)</tt>
	 *
	 *	@param personCommissionProcess
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(PersonCommissionProcessDO personCommissionProcess) throws DataAccessException;

	/**
	 *  Query DB table <tt>person_commission_process</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select commission_process_id, settlement_number, business_user_id, business_user_name, business_user_mobile, business_user_cert_no, apply_draw_amount, status, reason, raw_add_time, raw_update_time from person_commission_process where (commission_process_id = ?)</tt>
	 *
	 *	@param commissionProcessId
	 *	@return PersonCommissionProcessDO
	 *	@throws DataAccessException
	 */	 
    public PersonCommissionProcessDO findById(long commissionProcessId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>person_commission_process</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from person_commission_process where (commission_process_id = ?)</tt>
	 *
	 *	@param commissionProcessId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long commissionProcessId) throws DataAccessException;

	/**
	 *  Query DB table <tt>person_commission_process</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select commission_process_id, settlement_number, business_user_id, business_user_name, business_user_mobile, business_user_cert_no, apply_draw_amount, status, reason, raw_add_time, raw_update_time from person_commission_process where (1 = 1)</tt>
	 *
	 *	@param personCommissionProcess
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<PersonCommissionProcessDO>
	 *	@throws DataAccessException
	 */	 
    public List<PersonCommissionProcessDO> findByCondition(PersonCommissionProcessDO personCommissionProcess, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>person_commission_process</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from person_commission_process where (1 = 1)</tt>
	 *
	 *	@param personCommissionProcess
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(PersonCommissionProcessDO personCommissionProcess) throws DataAccessException;

	/**
	 *  Update DB table <tt>person_commission_process</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update person_commission_process set business_user_id=?, settlement_number=?, business_user_name=?, business_user_mobile=?, business_user_cert_no=?, apply_draw_amount=?, status=?, reason=? where (commission_process_id = ?)</tt>
	 *
	 *	@param commissionProcessIds
	 *	@param settleNo
	 *	@param status
	 *	@param reason
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateStatus(String commissionProcessIds, String settleNo, String status, String reason) throws DataAccessException;

}