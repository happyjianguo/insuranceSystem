/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.daointerface;

// auto generated imports
import com.born.insurance.dal.dataobject.InsuranceBillRenewalDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>insurance_bill_renewal</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/insurance_bill_renewal.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface InsuranceBillRenewalDAO {
	/**
	 *  Insert one <tt>InsuranceBillRenewalDO</tt> object to DB table <tt>insurance_bill_renewal</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into insurance_bill_renewal(bill_renewal_id,business_bill_id,payment_number,bill_no,payment_method,payer,payee,money,trading_time,agent,post_no,merchant_id,trading_code,operater,transfer_serial_number,pay_bank,pay_account,receivables_bank,receivables_account,check_number,platform_name,period,premium_amount,creator_id,creator_name,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param insuranceBillRenewal
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(InsuranceBillRenewalDO insuranceBillRenewal) throws DataAccessException;

	/**
	 *  Update DB table <tt>insurance_bill_renewal</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update insurance_bill_renewal set business_bill_id=?, payment_number=?, bill_no=?, period=?, premium_amount=?, creator_id=?, creator_name=? where (bill_renewal_id = ?)</tt>
	 *
	 *	@param insuranceBillRenewal
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(InsuranceBillRenewalDO insuranceBillRenewal) throws DataAccessException;

	/**
	 *  Query DB table <tt>insurance_bill_renewal</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select bill_renewal_id, business_bill_id, payment_number, bill_no, payment_method, payer, payee, money, trading_time, agent, post_no, merchant_id, trading_code, operater, transfer_serial_number, pay_bank, pay_account, receivables_bank, receivables_account, check_number, platform_name, period, premium_amount, creator_id, creator_name, raw_add_time, raw_update_time from insurance_bill_renewal where (bill_renewal_id = ?)</tt>
	 *
	 *	@param billRenewalId
	 *	@return InsuranceBillRenewalDO
	 *	@throws DataAccessException
	 */	 
    public InsuranceBillRenewalDO findById(long billRenewalId) throws DataAccessException;

	/**
	 *  Query DB table <tt>insurance_bill_renewal</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select bill_renewal_id, business_bill_id, payment_number, bill_no, payment_method, payer, payee, money, trading_time, agent, post_no, merchant_id, trading_code, operater, transfer_serial_number, pay_bank, pay_account, receivables_bank, receivables_account, check_number, platform_name, period, premium_amount, creator_id, creator_name, raw_add_time, raw_update_time from insurance_bill_renewal where ((business_bill_id = ?) AND (period = ?))</tt>
	 *
	 *	@param businessBillId
	 *	@param period
	 *	@return InsuranceBillRenewalDO
	 *	@throws DataAccessException
	 */	 
    public InsuranceBillRenewalDO findInsuranceBillRenewal(long businessBillId, long period) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>insurance_bill_renewal</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from insurance_bill_renewal where (bill_renewal_id = ?)</tt>
	 *
	 *	@param billRenewalId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long billRenewalId) throws DataAccessException;

	/**
	 *  Query DB table <tt>insurance_bill_renewal</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select bill_renewal_id, business_bill_id, payment_number, bill_no, payment_method, payer, payee, money, trading_time, agent, post_no, merchant_id, trading_code, operater, transfer_serial_number, pay_bank, pay_account, receivables_bank, receivables_account, check_number, platform_name, period, premium_amount, creator_id, creator_name, raw_add_time, raw_update_time from insurance_bill_renewal where (1 = 1)</tt>
	 *
	 *	@param insuranceBillRenewal
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<InsuranceBillRenewalDO>
	 *	@throws DataAccessException
	 */	 
    public List<InsuranceBillRenewalDO> findByCondition(InsuranceBillRenewalDO insuranceBillRenewal, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>insurance_bill_renewal</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from insurance_bill_renewal where (1 = 1)</tt>
	 *
	 *	@param insuranceBillRenewal
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(InsuranceBillRenewalDO insuranceBillRenewal) throws DataAccessException;

}