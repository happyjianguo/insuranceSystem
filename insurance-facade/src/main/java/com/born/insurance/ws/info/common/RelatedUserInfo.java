package com.born.insurance.ws.info.common;

import java.util.Date;

import com.born.insurance.ws.enums.BooleanEnum;
import com.born.insurance.ws.enums.ExeStatusEnum;
import com.born.insurance.ws.enums.FormCodeEnum;

import com.born.insurance.ws.order.common.SimpleUserInfo;

/**
 * 相关人员Info
 *
 * @author wuzj
 * 
 * 2016年4月29日
 */
public class RelatedUserInfo extends BaseToStringInfo {
	
	private static final long serialVersionUID = 5842137929127224733L;
	
	private long relatedId; //主键
	
	private long formId; //表单ID
	
	private long taskId; //任务ID
	
	private String projectCode; //项目编号/签报编号等
	

	
	private ExeStatusEnum exeStatus; //任务执行状态
	
	private FormCodeEnum formCode;
	
	/**
	 * 当前人员
	 */
	private long userId;
	
	private String userAccount;
	
	private String userName;
	
	private String userMobile;
	
	private String userEmail;
	
	//相关部门
	private long deptId;
	
	private String deptCode;
	
	private String deptName;
	
	//移交时间
	private Date transferTime;
	
	private String remark;
	
	//是否当前
	private BooleanEnum isCurrent;
	//是否已删除
	private BooleanEnum isDel;
	
	private Date rawAddTime;
	
	private Date rawUpdateTime;
	
	public SimpleUserInfo toSimpleUserInfo() {
		SimpleUserInfo user = new SimpleUserInfo();
		user.setUserId(userId);
		user.setUserName(userName);
		user.setUserAccount(userAccount);
		user.setEmail(userEmail);
		user.setMobile(userMobile);
		return user;
	}
	
	public long getRelatedId() {
		return this.relatedId;
	}
	
	public void setRelatedId(long relatedId) {
		this.relatedId = relatedId;
	}
	
	public long getFormId() {
		return this.formId;
	}
	
	public void setFormId(long formId) {
		this.formId = formId;
	}
	
	public String getProjectCode() {
		return this.projectCode;
	}
	
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}
	

	
	public long getUserId() {
		return this.userId;
	}
	
	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	public String getUserAccount() {
		return this.userAccount;
	}
	
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public Date getTransferTime() {
		return this.transferTime;
	}
	
	public void setTransferTime(Date transferTime) {
		this.transferTime = transferTime;
	}
	
	public String getRemark() {
		return this.remark;
	}
	
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	public BooleanEnum getIsCurrent() {
		return this.isCurrent;
	}
	
	public void setIsCurrent(BooleanEnum isCurrent) {
		this.isCurrent = isCurrent;
	}
	
	public Date getRawAddTime() {
		return this.rawAddTime;
	}
	
	public void setRawAddTime(Date rawAddTime) {
		this.rawAddTime = rawAddTime;
	}
	
	public Date getRawUpdateTime() {
		return this.rawUpdateTime;
	}
	
	public void setRawUpdateTime(Date rawUpdateTime) {
		this.rawUpdateTime = rawUpdateTime;
	}
	
	public long getDeptId() {
		return this.deptId;
	}
	
	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}
	
	public String getDeptName() {
		return this.deptName;
	}
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	public long getTaskId() {
		return this.taskId;
	}
	
	public void setTaskId(long taskId) {
		this.taskId = taskId;
	}
	
	public ExeStatusEnum getExeStatus() {
		return this.exeStatus;
	}
	
	public void setExeStatus(ExeStatusEnum exeStatus) {
		this.exeStatus = exeStatus;
	}
	
	public String getUserMobile() {
		return this.userMobile;
	}
	
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}
	
	public String getUserEmail() {
		return this.userEmail;
	}
	
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	public BooleanEnum getIsDel() {
		return this.isDel;
	}
	
	public void setIsDel(BooleanEnum isDel) {
		this.isDel = isDel;
	}
	
	public FormCodeEnum getFormCode() {
		return this.formCode;
	}
	
	public void setFormCode(FormCodeEnum formCode) {
		this.formCode = formCode;
	}
	
	public String getDeptCode() {
		return this.deptCode;
	}
	
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	
}
