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
 * A data object class directly models database table <tt>related_user</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/related_user.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class RelatedUserDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private long relatedId;

	private long formId;

	private String formCode;

	private long taskId;

	private String exeStatus;

	private String projectCode;

	private String userType;

	private long userId;

	private String userAccount;

	private String userName;

	private String userMobile;

	private String userEmail;

	private long deptId;

	private String deptCode;

	private String deptName;

	private Date transferTime;

	private String remark;

	private String isCurrent;

	private String isDel;

	private Date rawAddTime;

	private Date rawUpdateTime;

    //========== getters and setters ==========

	public long getRelatedId() {
		return relatedId;
	}
	
	public void setRelatedId(long relatedId) {
		this.relatedId = relatedId;
	}

	public long getFormId() {
		return formId;
	}
	
	public void setFormId(long formId) {
		this.formId = formId;
	}

	public String getFormCode() {
		return formCode;
	}
	
	public void setFormCode(String formCode) {
		this.formCode = formCode;
	}

	public long getTaskId() {
		return taskId;
	}
	
	public void setTaskId(long taskId) {
		this.taskId = taskId;
	}

	public String getExeStatus() {
		return exeStatus;
	}
	
	public void setExeStatus(String exeStatus) {
		this.exeStatus = exeStatus;
	}

	public String getProjectCode() {
		return projectCode;
	}
	
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public String getUserType() {
		return userType;
	}
	
	public void setUserType(String userType) {
		this.userType = userType;
	}

	public long getUserId() {
		return userId;
	}
	
	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserAccount() {
		return userAccount;
	}
	
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserMobile() {
		return userMobile;
	}
	
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserEmail() {
		return userEmail;
	}
	
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public long getDeptId() {
		return deptId;
	}
	
	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}

	public String getDeptCode() {
		return deptCode;
	}
	
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public String getDeptName() {
		return deptName;
	}
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Date getTransferTime() {
		return transferTime;
	}
	
	public void setTransferTime(Date transferTime) {
		this.transferTime = transferTime;
	}

	public String getRemark() {
		return remark;
	}
	
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getIsCurrent() {
		return isCurrent;
	}
	
	public void setIsCurrent(String isCurrent) {
		this.isCurrent = isCurrent;
	}

	public String getIsDel() {
		return isDel;
	}
	
	public void setIsDel(String isDel) {
		this.isDel = isDel;
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
