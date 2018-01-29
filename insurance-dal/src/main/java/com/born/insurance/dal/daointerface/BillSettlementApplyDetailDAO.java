/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.daointerface;

// auto generated imports
import com.born.insurance.dal.dataobject.BillSettlementApplyDetailDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>bill_settlement_apply_detail</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/bill_settlement_apply_detail.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface BillSettlementApplyDetailDAO {
	/**
	 *  Insert one <tt>BillSettlementApplyDetailDO</tt> object to DB table <tt>bill_settlement_apply_detail</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into bill_settlement_apply_detail(id,settlement_apply_id,business_bill_id,recievable_fee,recieved_fee,should_pay_fee,actual_pay_fee,service_fee,generation_fee,individual_tax,pay_fee,reserved_scale,row_add_time,row_update_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param billSettlementApplyDetail
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(BillSettlementApplyDetailDO billSettlementApplyDetail) throws DataAccessException;

	/**
	 *  Update DB table <tt>bill_settlement_apply_detail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update bill_settlement_apply_detail set settlement_apply_id=?, business_bill_id=?, recievable_fee=?, recieved_fee=?, should_pay_fee=?, actual_pay_fee=?, service_fee=?, generation_fee=?, individual_tax=?, pay_fee=?, reserved_scale=?, row_add_time=?, row_update_time=? where (id = ?)</tt>
	 *
	 *	@param billSettlementApplyDetail
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(BillSettlementApplyDetailDO billSettlementApplyDetail) throws DataAccessException;

	/**
	 *  Query DB table <tt>bill_settlement_apply_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, settlement_apply_id, business_bill_id, recievable_fee, recieved_fee, should_pay_fee, actual_pay_fee, service_fee, generation_fee, individual_tax, pay_fee, reserved_scale, row_add_time, row_update_time from bill_settlement_apply_detail where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return BillSettlementApplyDetailDO
	 *	@throws DataAccessException
	 */	 
    public BillSettlementApplyDetailDO findById(long id) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>bill_settlement_apply_detail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from bill_settlement_apply_detail where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>bill_settlement_apply_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, settlement_apply_id, business_bill_id, recievable_fee, recieved_fee, should_pay_fee, actual_pay_fee, service_fee, generation_fee, individual_tax, pay_fee, reserved_scale, row_add_time, row_update_time from bill_settlement_apply_detail where (1 = 1)</tt>
	 *
	 *	@param billSettlementApplyDetail
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<BillSettlementApplyDetailDO>
	 *	@throws DataAccessException
	 */	 
    public List<BillSettlementApplyDetailDO> findByCondition(BillSettlementApplyDetailDO billSettlementApplyDetail, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>bill_settlement_apply_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from bill_settlement_apply_detail where (1 = 1)</tt>
	 *
	 *	@param billSettlementApplyDetail
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(BillSettlementApplyDetailDO billSettlementApplyDetail) throws DataAccessException;

	/**
	 *  Query DB table <tt>bill_settlement_apply_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, settlement_apply_id, business_bill_id, recievable_fee, recieved_fee, should_pay_fee, actual_pay_fee, service_fee, generation_fee, individual_tax, pay_fee, reserved_scale, row_add_time, row_update_time from bill_settlement_apply_detail where (settlement_apply_id = ?)</tt>
	 *
	 *	@param settlementApplyId
	 *	@return BillSettlementApplyDetailDO
	 *	@throws DataAccessException
	 */	 
    public BillSettlementApplyDetailDO findBySettlementApplyId(long settlementApplyId) throws DataAccessException;

}