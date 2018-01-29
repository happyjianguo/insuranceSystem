/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.daointerface;

// auto generated imports
import com.born.insurance.dal.dataobject.BusinessBillUnderInforDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>business_bill_under_infor</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/business_bill_under_infor.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface BusinessBillUnderInforDAO {
	/**
	 *  Insert one <tt>BusinessBillUnderInforDO</tt> object to DB table <tt>business_bill_under_infor</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into business_bill_under_infor(under_info_id,product_id,product_name,insurance_amount,permium_rate,premium_amount,money_type,business_bill_id) values (?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param businessBillUnderInfor
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(BusinessBillUnderInforDO businessBillUnderInfor) throws DataAccessException;

	/**
	 *  Update DB table <tt>business_bill_under_infor</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update business_bill_under_infor set product_id=?, product_name=?, insurance_amount=?, permium_rate=?, premium_amount=?, money_type=?, business_bill_id=? where (under_info_id = ?)</tt>
	 *
	 *	@param businessBillUnderInfor
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(BusinessBillUnderInforDO businessBillUnderInfor) throws DataAccessException;

	/**
	 *  Query DB table <tt>business_bill_under_infor</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select under_info_id, product_id, product_name, insurance_amount, permium_rate, premium_amount, money_type, business_bill_id from business_bill_under_infor where (under_info_id = ?)</tt>
	 *
	 *	@param underInfoId
	 *	@return BusinessBillUnderInforDO
	 *	@throws DataAccessException
	 */	 
    public BusinessBillUnderInforDO findById(long underInfoId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>business_bill_under_infor</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from business_bill_under_infor where (under_info_id = ?)</tt>
	 *
	 *	@param underInfoId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long underInfoId) throws DataAccessException;

	/**
	 *  Query DB table <tt>business_bill_under_infor</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select under_info_id, product_id, product_name, insurance_amount, permium_rate, premium_amount, money_type, business_bill_id from business_bill_under_infor where (1 = 1)</tt>
	 *
	 *	@param businessBillUnderInfor
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<BusinessBillUnderInforDO>
	 *	@throws DataAccessException
	 */	 
    public List<BusinessBillUnderInforDO> findByCondition(BusinessBillUnderInforDO businessBillUnderInfor, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>business_bill_under_infor</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from business_bill_under_infor where (1 = 1)</tt>
	 *
	 *	@param businessBillUnderInfor
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(BusinessBillUnderInforDO businessBillUnderInfor) throws DataAccessException;

	/**
	 *  Query DB table <tt>business_bill_under_infor</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select under_info_id, product_id, product_name, insurance_amount, permium_rate, premium_amount, money_type, business_bill_id from business_bill_under_infor where (business_bill_id = ?)</tt>
	 *
	 *	@param businessBillId
	 *	@return List<BusinessBillUnderInforDO>
	 *	@throws DataAccessException
	 */	 
    public List<BusinessBillUnderInforDO> findBusinessBillUnderInfo(long businessBillId) throws DataAccessException;

}