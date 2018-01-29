/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.insurance.dal.daointerface.ClaimSettlementDAO;


// auto generated imports
import com.born.insurance.dal.dataobject.ClaimSettlementDO;
import org.springframework.dao.DataAccessException;
import java.util.Date;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.insurance.dal.daointerface.ClaimSettlementDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/claim_settlement.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisClaimSettlementDAO extends SqlMapClientDaoSupport implements ClaimSettlementDAO {
	/**
	 *  Insert one <tt>ClaimSettlementDO</tt> object to DB table <tt>claim_settlement</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into claim_settlement(claim_settlement_id,insurance_no,business_bill_id,informant,mobile,danger_place,danger_date,remark,creator_id,creator_name,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param claimSettlement
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(ClaimSettlementDO claimSettlement) throws DataAccessException {
    	if (claimSettlement == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-CLAIM-SETTLEMENT-INSERT", claimSettlement);

        return claimSettlement.getClaimSettlementId();
    }

	/**
	 *  Update DB table <tt>claim_settlement</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update claim_settlement set insurance_no=?, business_bill_id=?, informant=?, mobile=?, danger_place=?, danger_date=?, remark=?, creator_id=?, creator_name=? where (claim_settlement_id = ?)</tt>
	 *
	 *	@param claimSettlement
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(ClaimSettlementDO claimSettlement) throws DataAccessException {
    	if (claimSettlement == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-CLAIM-SETTLEMENT-UPDATE", claimSettlement);
    }

	/**
	 *  Query DB table <tt>claim_settlement</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select claim_settlement_id, insurance_no, business_bill_id, informant, mobile, danger_place, danger_date, remark, creator_id, creator_name, raw_add_time, raw_update_time from claim_settlement where (claim_settlement_id = ?)</tt>
	 *
	 *	@param claimSettlementId
	 *	@return ClaimSettlementDO
	 *	@throws DataAccessException
	 */	 
    public ClaimSettlementDO findById(long claimSettlementId) throws DataAccessException {
        Long param = new Long(claimSettlementId);

        return (ClaimSettlementDO) getSqlMapClientTemplate().queryForObject("MS-CLAIM-SETTLEMENT-FIND-BY-ID", param);

    }

	/**
	 *  Delete records from DB table <tt>claim_settlement</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from claim_settlement where (claim_settlement_id = ?)</tt>
	 *
	 *	@param claimSettlementId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long claimSettlementId) throws DataAccessException {
        Long param = new Long(claimSettlementId);

        return getSqlMapClientTemplate().delete("MS-CLAIM-SETTLEMENT-DELETE-BY-ID", param);
    }

	/**
	 *  Query DB table <tt>claim_settlement</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select claim_settlement_id, insurance_no, business_bill_id, informant, mobile, danger_place, danger_date, remark, creator_id, creator_name, raw_add_time, raw_update_time from claim_settlement where (1 = 1)</tt>
	 *
	 *	@param claimSettlement
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@param startTime
	 *	@param endTime
	 *	@return List<ClaimSettlementDO>
	 *	@throws DataAccessException
	 */	 
    public List<ClaimSettlementDO> findByCondition(ClaimSettlementDO claimSettlement, String sortCol, String sortOrder, long limitStart, long pageSize, Date startTime, Date endTime) throws DataAccessException {
    	if (claimSettlement == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("claimSettlement", claimSettlement);
        param.put("sortCol", sortCol);
        param.put("sortOrder", sortOrder);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));
        param.put("startTime", startTime);
        param.put("endTime", endTime);

        return getSqlMapClientTemplate().queryForList("MS-CLAIM-SETTLEMENT-FIND-BY-CONDITION", param);

    }

	/**
	 *  Query DB table <tt>claim_settlement</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from claim_settlement where (1 = 1)</tt>
	 *
	 *	@param claimSettlement
	 *	@param startTime
	 *	@param endTime
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(ClaimSettlementDO claimSettlement, Date startTime, Date endTime) throws DataAccessException {
    	if (claimSettlement == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("claimSettlement", claimSettlement);
        param.put("startTime", startTime);
        param.put("endTime", endTime);

	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-CLAIM-SETTLEMENT-FIND-BY-CONDITION-COUNT", param);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

}