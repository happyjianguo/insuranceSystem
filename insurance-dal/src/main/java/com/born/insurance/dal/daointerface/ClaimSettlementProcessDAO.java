/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.daointerface;

// auto generated imports
import com.born.insurance.dal.dataobject.ClaimSettlementProcessDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>claim_settlement_process</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/claim_settlement_process.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface ClaimSettlementProcessDAO {
	/**
	 *  Insert one <tt>ClaimSettlementProcessDO</tt> object to DB table <tt>claim_settlement_process</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into claim_settlement_process(settlement_process_id,claim_settlement_id,type,remark,contactor_name,contactor_mobile1,contactor_mobile2,estimate_amount,damage_amount,payment_amount,process_date,creator_id,creator_name,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param claimSettlementProcess
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(ClaimSettlementProcessDO claimSettlementProcess) throws DataAccessException;

	/**
	 *  Update DB table <tt>claim_settlement_process</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update claim_settlement_process set claim_settlement_id=?, type=?, remark=?, contactor_name=?, contactor_mobile1=?, contactor_mobile2=?, estimate_amount=?, damage_amount=?, payment_amount=?, process_date=?, creator_id=?, creator_name=? where (settlement_process_id = ?)</tt>
	 *
	 *	@param claimSettlementProcess
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(ClaimSettlementProcessDO claimSettlementProcess) throws DataAccessException;

	/**
	 *  Query DB table <tt>claim_settlement_process</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select settlement_process_id, claim_settlement_id, type, remark, contactor_name, contactor_mobile1, contactor_mobile2, estimate_amount, damage_amount, payment_amount, process_date, creator_id, creator_name, raw_add_time, raw_update_time from claim_settlement_process where (settlement_process_id = ?)</tt>
	 *
	 *	@param settlementProcessId
	 *	@return ClaimSettlementProcessDO
	 *	@throws DataAccessException
	 */	 
    public ClaimSettlementProcessDO findById(long settlementProcessId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>claim_settlement_process</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from claim_settlement_process where (settlement_process_id = ?)</tt>
	 *
	 *	@param settlementProcessId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long settlementProcessId) throws DataAccessException;

	/**
	 *  Query DB table <tt>claim_settlement_process</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select settlement_process_id, claim_settlement_id, type, remark, contactor_name, contactor_mobile1, contactor_mobile2, estimate_amount, damage_amount, payment_amount, process_date, creator_id, creator_name, raw_add_time, raw_update_time from claim_settlement_process where (1 = 1)</tt>
	 *
	 *	@param claimSettlementProcess
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<ClaimSettlementProcessDO>
	 *	@throws DataAccessException
	 */	 
    public List<ClaimSettlementProcessDO> findByCondition(ClaimSettlementProcessDO claimSettlementProcess, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>claim_settlement_process</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from claim_settlement_process where (1 = 1)</tt>
	 *
	 *	@param claimSettlementProcess
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(ClaimSettlementProcessDO claimSettlementProcess) throws DataAccessException;

}