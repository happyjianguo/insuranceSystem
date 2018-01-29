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

/**
 * A data object class directly models database table <tt>price_contact_letter</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/price_contact_letter.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class PriceContactLetterDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private long id;

	private String priceType;

	private String priceTemplate;

	private long catalogId;

	private String catalogName;

	private long businessConditionId;

	private String businessConditions;

	private String businessUserId;

	private String businessUserName;

	private long projectSetupId;

	private String projectSetupName;

	private String name;

	private String billNo;

	private String customerType;

	private long customerUserId;

	private String customerUserName;

	private String customerCertType;

	private String customerCertNo;

	private long creatorId;

	private String creatorName;

	private long formId;

	private String status;

	private Date rawAddTime;

	private Date rawUpdateTime;

	private String specialReq;

	private String askDate;

	private long version;

	private String ext;

    //========== getters and setters ==========

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public String getPriceType() {
		return priceType;
	}
	
	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}

	public String getPriceTemplate() {
		return priceTemplate;
	}
	
	public void setPriceTemplate(String priceTemplate) {
		this.priceTemplate = priceTemplate;
	}

	public long getCatalogId() {
		return catalogId;
	}
	
	public void setCatalogId(long catalogId) {
		this.catalogId = catalogId;
	}

	public String getCatalogName() {
		return catalogName;
	}
	
	public void setCatalogName(String catalogName) {
		this.catalogName = catalogName;
	}

	public long getBusinessConditionId() {
		return businessConditionId;
	}
	
	public void setBusinessConditionId(long businessConditionId) {
		this.businessConditionId = businessConditionId;
	}

	public String getBusinessConditions() {
		return businessConditions;
	}
	
	public void setBusinessConditions(String businessConditions) {
		this.businessConditions = businessConditions;
	}

	public String getBusinessUserId() {
		return businessUserId;
	}
	
	public void setBusinessUserId(String businessUserId) {
		this.businessUserId = businessUserId;
	}

	public String getBusinessUserName() {
		return businessUserName;
	}
	
	public void setBusinessUserName(String businessUserName) {
		this.businessUserName = businessUserName;
	}

	public long getProjectSetupId() {
		return projectSetupId;
	}
	
	public void setProjectSetupId(long projectSetupId) {
		this.projectSetupId = projectSetupId;
	}

	public String getProjectSetupName() {
		return projectSetupName;
	}
	
	public void setProjectSetupName(String projectSetupName) {
		this.projectSetupName = projectSetupName;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getBillNo() {
		return billNo;
	}
	
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getCustomerType() {
		return customerType;
	}
	
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public long getCustomerUserId() {
		return customerUserId;
	}
	
	public void setCustomerUserId(long customerUserId) {
		this.customerUserId = customerUserId;
	}

	public String getCustomerUserName() {
		return customerUserName;
	}
	
	public void setCustomerUserName(String customerUserName) {
		this.customerUserName = customerUserName;
	}

	public String getCustomerCertType() {
		return customerCertType;
	}
	
	public void setCustomerCertType(String customerCertType) {
		this.customerCertType = customerCertType;
	}

	public String getCustomerCertNo() {
		return customerCertNo;
	}
	
	public void setCustomerCertNo(String customerCertNo) {
		this.customerCertNo = customerCertNo;
	}

	public long getCreatorId() {
		return creatorId;
	}
	
	public void setCreatorId(long creatorId) {
		this.creatorId = creatorId;
	}

	public String getCreatorName() {
		return creatorName;
	}
	
	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}

	public long getFormId() {
		return formId;
	}
	
	public void setFormId(long formId) {
		this.formId = formId;
	}

	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
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

	public String getSpecialReq() {
		return specialReq;
	}
	
	public void setSpecialReq(String specialReq) {
		this.specialReq = specialReq;
	}

	public String getAskDate() {
		return askDate;
	}
	
	public void setAskDate(String askDate) {
		this.askDate = askDate;
	}

	public long getVersion() {
		return version;
	}
	
	public void setVersion(long version) {
		this.version = version;
	}

	public String getExt() {
		return ext;
	}
	
	public void setExt(String ext) {
		this.ext = ext;
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
