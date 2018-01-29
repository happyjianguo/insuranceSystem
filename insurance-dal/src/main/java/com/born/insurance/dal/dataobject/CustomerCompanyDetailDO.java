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
 * A data object class directly models database table <tt>customer_company_detail</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/customer_company_detail.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class CustomerCompanyDetailDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private String customerId;

	private String customerName;

	private String enterpriseType;

	private long registerCapital;

	private long actualCapital;

	private Date establishedTime;

	private String scale;

	private long staffNum;

	private String contactMan;

	private long contactManId;

	private String contactEmail;

	private String busiScope;

	private String websit;

	private String legalPersion;

	private String legalPersionCertNo;

	private String legalPersionAddress;

	private String actualControlMan;

	private String actualControlManCertNo;

	private String actualControlManCertType;

	private String actualControlManAddress;

	private long parentId;

	private String parentName;

	private String kind;

	private String companyType;

	private String companyNature;

    //========== getters and setters ==========

	public String getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEnterpriseType() {
		return enterpriseType;
	}
	
	public void setEnterpriseType(String enterpriseType) {
		this.enterpriseType = enterpriseType;
	}

	public long getRegisterCapital() {
		return registerCapital;
	}
	
	public void setRegisterCapital(long registerCapital) {
		this.registerCapital = registerCapital;
	}

	public long getActualCapital() {
		return actualCapital;
	}
	
	public void setActualCapital(long actualCapital) {
		this.actualCapital = actualCapital;
	}

	public Date getEstablishedTime() {
		return establishedTime;
	}
	
	public void setEstablishedTime(Date establishedTime) {
		this.establishedTime = establishedTime;
	}

	public String getScale() {
		return scale;
	}
	
	public void setScale(String scale) {
		this.scale = scale;
	}

	public long getStaffNum() {
		return staffNum;
	}
	
	public void setStaffNum(long staffNum) {
		this.staffNum = staffNum;
	}

	public String getContactMan() {
		return contactMan;
	}
	
	public void setContactMan(String contactMan) {
		this.contactMan = contactMan;
	}

	public long getContactManId() {
		return contactManId;
	}
	
	public void setContactManId(long contactManId) {
		this.contactManId = contactManId;
	}

	public String getContactEmail() {
		return contactEmail;
	}
	
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getBusiScope() {
		return busiScope;
	}
	
	public void setBusiScope(String busiScope) {
		this.busiScope = busiScope;
	}

	public String getWebsit() {
		return websit;
	}
	
	public void setWebsit(String websit) {
		this.websit = websit;
	}

	public String getLegalPersion() {
		return legalPersion;
	}
	
	public void setLegalPersion(String legalPersion) {
		this.legalPersion = legalPersion;
	}

	public String getLegalPersionCertNo() {
		return legalPersionCertNo;
	}
	
	public void setLegalPersionCertNo(String legalPersionCertNo) {
		this.legalPersionCertNo = legalPersionCertNo;
	}

	public String getLegalPersionAddress() {
		return legalPersionAddress;
	}
	
	public void setLegalPersionAddress(String legalPersionAddress) {
		this.legalPersionAddress = legalPersionAddress;
	}

	public String getActualControlMan() {
		return actualControlMan;
	}
	
	public void setActualControlMan(String actualControlMan) {
		this.actualControlMan = actualControlMan;
	}

	public String getActualControlManCertNo() {
		return actualControlManCertNo;
	}
	
	public void setActualControlManCertNo(String actualControlManCertNo) {
		this.actualControlManCertNo = actualControlManCertNo;
	}

	public String getActualControlManCertType() {
		return actualControlManCertType;
	}
	
	public void setActualControlManCertType(String actualControlManCertType) {
		this.actualControlManCertType = actualControlManCertType;
	}

	public String getActualControlManAddress() {
		return actualControlManAddress;
	}
	
	public void setActualControlManAddress(String actualControlManAddress) {
		this.actualControlManAddress = actualControlManAddress;
	}

	public long getParentId() {
		return parentId;
	}
	
	public void setParentId(long parentId) {
		this.parentId = parentId;
	}

	public String getParentName() {
		return parentName;
	}
	
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getKind() {
		return kind;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getCompanyType() {
		return companyType;
	}
	
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public String getCompanyNature() {
		return companyNature;
	}
	
	public void setCompanyNature(String companyNature) {
		this.companyNature = companyNature;
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
