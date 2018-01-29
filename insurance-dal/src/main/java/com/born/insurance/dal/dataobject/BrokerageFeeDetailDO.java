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
 * A data object class directly models database table <tt>brokerage_fee_detail</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/brokerage_fee_detail.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class BrokerageFeeDetailDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private long brokerageFeeDetailId;

	private long brokerageFeeId;

	private String appserialPeriod;

	private double borkerageScale;

	private Money receivableAmount = new Money(0, 0);

	private Date planPayDate;

	private Date actualPayDate;

	private Date rawAddTime;

	private Date updateAddTime;

    //========== getters and setters ==========

	public long getBrokerageFeeDetailId() {
		return brokerageFeeDetailId;
	}
	
	public void setBrokerageFeeDetailId(long brokerageFeeDetailId) {
		this.brokerageFeeDetailId = brokerageFeeDetailId;
	}

	public long getBrokerageFeeId() {
		return brokerageFeeId;
	}
	
	public void setBrokerageFeeId(long brokerageFeeId) {
		this.brokerageFeeId = brokerageFeeId;
	}

	public String getAppserialPeriod() {
		return appserialPeriod;
	}
	
	public void setAppserialPeriod(String appserialPeriod) {
		this.appserialPeriod = appserialPeriod;
	}

	public double getBorkerageScale() {
		return borkerageScale;
	}
	
	public void setBorkerageScale(double borkerageScale) {
		this.borkerageScale = borkerageScale;
	}

	public Money getReceivableAmount() {
		return receivableAmount;
	}
	
	public void setReceivableAmount(Money receivableAmount) {
		if (receivableAmount == null) {
			this.receivableAmount = new Money(0, 0);
		} else {
			this.receivableAmount = receivableAmount;
		}
	}

	public Date getPlanPayDate() {
		return planPayDate;
	}
	
	public void setPlanPayDate(Date planPayDate) {
		this.planPayDate = planPayDate;
	}

	public Date getActualPayDate() {
		return actualPayDate;
	}
	
	public void setActualPayDate(Date actualPayDate) {
		this.actualPayDate = actualPayDate;
	}

	public Date getRawAddTime() {
		return rawAddTime;
	}
	
	public void setRawAddTime(Date rawAddTime) {
		this.rawAddTime = rawAddTime;
	}

	public Date getUpdateAddTime() {
		return updateAddTime;
	}
	
	public void setUpdateAddTime(Date updateAddTime) {
		this.updateAddTime = updateAddTime;
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
