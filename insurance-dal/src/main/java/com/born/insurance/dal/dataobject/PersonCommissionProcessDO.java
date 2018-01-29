/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.dataobject;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

// auto generated imports
import java.util.Date;
import com.yjf.common.lang.util.money.Money;

/**
 * A data object class directly models database table <tt>person_commission_process</tt>.
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
public class PersonCommissionProcessDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private long commissionProcessId;

	private String settlementNumber;

	private long businessUserId;

	private String businessUserName;

	private String businessUserMobile;

	private String businessUserCertNo;

	private Money applyDrawAmount = new Money(0, 0);

	private String status;

	private String reason;

	private Date rawAddTime;

	private Date rawUpdateTime;

    //========== getters and setters ==========

	public long getCommissionProcessId() {
		return commissionProcessId;
	}
	
	public void setCommissionProcessId(long commissionProcessId) {
		this.commissionProcessId = commissionProcessId;
	}

	public String getSettlementNumber() {
		return settlementNumber;
	}
	
	public void setSettlementNumber(String settlementNumber) {
		this.settlementNumber = settlementNumber;
	}

	public long getBusinessUserId() {
		return businessUserId;
	}
	
	public void setBusinessUserId(long businessUserId) {
		this.businessUserId = businessUserId;
	}

	public String getBusinessUserName() {
		return businessUserName;
	}
	
	public void setBusinessUserName(String businessUserName) {
		this.businessUserName = businessUserName;
	}

	public String getBusinessUserMobile() {
		return businessUserMobile;
	}
	
	public void setBusinessUserMobile(String businessUserMobile) {
		this.businessUserMobile = businessUserMobile;
	}

	public String getBusinessUserCertNo() {
		return businessUserCertNo;
	}
	
	public void setBusinessUserCertNo(String businessUserCertNo) {
		this.businessUserCertNo = businessUserCertNo;
	}

	public Money getApplyDrawAmount() {
		return applyDrawAmount;
	}
	
	public void setApplyDrawAmount(Money applyDrawAmount) {
		if (applyDrawAmount == null) {
			this.applyDrawAmount = new Money(0, 0);
		} else {
			this.applyDrawAmount = applyDrawAmount;
		}
	}

	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}

	public String getReason() {
		return reason;
	}
	
	public void setReason(String reason) {
		this.reason = reason;
	}

	public Date getRawAddTime() {
		return rawAddTime;
	}
	
	public void setRawAddTime(Date rawAddTime) {
		this.rawAddTime = rawAddTime;
	}

	public Date getRawUpdateTime() {
		return rawUpdateTime;
	}
	
	public void setRawUpdateTime(Date rawUpdateTime) {
		this.rawUpdateTime = rawUpdateTime;
	}


	/**
     * @return
     *
     * @see java.lang.Object#toString()
     */
	@Override
    public String toString() {

        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
