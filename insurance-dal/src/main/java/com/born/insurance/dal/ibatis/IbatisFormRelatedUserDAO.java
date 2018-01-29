/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.insurance.dal.daointerface.FormRelatedUserDAO;


// auto generated imports
import com.born.insurance.dal.dataobject.FormRelatedUserDO;
import org.springframework.dao.DataAccessException;
import java.util.Date;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.FormRelatedUserDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/form_related_user.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisFormRelatedUserDAO extends SqlMapClientDaoSupport implements FormRelatedUserDAO {
	/**
	 *  Insert one <tt>FormRelatedUserDO</tt> object to DB table <tt>form_related_user</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into form_related_user(related_id,form_id,form_code,task_id,task_name,task_opinion,task_start_time,task_end_time,exe_status,project_code,user_type,user_id,user_account,user_name,user_mobile,user_email,dept_id,dept_code,dept_name,dept_path,dept_path_name,remark,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param formRelatedUser
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FormRelatedUserDO formRelatedUser) throws DataAccessException {
    	if (formRelatedUser == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-FORM-RELATED-USER-INSERT", formRelatedUser);

        return formRelatedUser.getRelatedId();
    }

	/**
	 *  Update DB table <tt>form_related_user</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update form_related_user set form_id=?, form_code=?, task_id=?, task_name=?, task_opinion=?, task_start_time=?, task_end_time=?, exe_status=?, project_code=?, user_type=?, user_id=?, user_account=?, user_name=?, user_mobile=?, user_email=?, dept_id=?, dept_code=?, dept_name=?, dept_path=?, dept_path_name=?, remark=? where (related_id = ?)</tt>
	 *
	 *	@param formRelatedUser
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FormRelatedUserDO formRelatedUser) throws DataAccessException {
    	if (formRelatedUser == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-FORM-RELATED-USER-UPDATE", formRelatedUser);
    }

	/**
	 *  Update DB table <tt>form_related_user</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update form_related_user set task_opinion=?, exe_status=?, remark=?, task_end_time=? where ((task_id = ?) AND (user_id = ?))</tt>
	 *
	 *	@param taskOpinion
	 *	@param exeStatus
	 *	@param remark
	 *	@param taskEndTime
	 *	@param taskId
	 *	@param userId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateExeStatus(String taskOpinion, String exeStatus, String remark, Date taskEndTime, long taskId, long userId) throws DataAccessException {
        Map param = new HashMap();

        param.put("taskOpinion", taskOpinion);
        param.put("exeStatus", exeStatus);
        param.put("remark", remark);
        param.put("taskEndTime", taskEndTime);
        param.put("taskId", new Long(taskId));
        param.put("userId", new Long(userId));

        return getSqlMapClientTemplate().update("MS-FORM-RELATED-USER-UPDATE-EXE-STATUS", param);
    }

	/**
	 *  Update DB table <tt>form_related_user</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update form_related_user set task_opinion=?, exe_status=?, task_end_time=? where ((form_id = ?) AND (user_type = 'FLOW_SUBMIT_MAN'))</tt>
	 *
	 *	@param taskOpinion
	 *	@param exeStatus
	 *	@param taskEndTime
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateSubmitExeStatus(String taskOpinion, String exeStatus, Date taskEndTime, long formId) throws DataAccessException {
        Map param = new HashMap();

        param.put("taskOpinion", taskOpinion);
        param.put("exeStatus", exeStatus);
        param.put("taskEndTime", taskEndTime);
        param.put("formId", new Long(formId));

        return getSqlMapClientTemplate().update("MS-FORM-RELATED-USER-UPDATE-SUBMIT-EXE-STATUS", param);
    }

	/**
	 *  Query DB table <tt>form_related_user</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from form_related_user where (related_id = ?)</tt>
	 *
	 *	@param relatedId
	 *	@return FormRelatedUserDO
	 *	@throws DataAccessException
	 */	 
    public FormRelatedUserDO findById(long relatedId) throws DataAccessException {
        Long param = new Long(relatedId);

        return (FormRelatedUserDO) getSqlMapClientTemplate().queryForObject("MS-FORM-RELATED-USER-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>form_related_user</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from form_related_user where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return List<FormRelatedUserDO>
	 *	@throws DataAccessException
	 */	 
    public List<FormRelatedUserDO> findByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return getSqlMapClientTemplate().queryForList("MS-FORM-RELATED-USER-FIND-BY-FORM-ID", param);

    }

	/**
	 *  Query DB table <tt>form_related_user</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from form_related_user where (task_id = ?)</tt>
	 *
	 *	@param taskId
	 *	@return List<FormRelatedUserDO>
	 *	@throws DataAccessException
	 */	 
    public List<FormRelatedUserDO> findByTaskId(long taskId) throws DataAccessException {
        Long param = new Long(taskId);

        return getSqlMapClientTemplate().queryForList("MS-FORM-RELATED-USER-FIND-BY-TASK-ID", param);

    }

	/**
	 *  Query DB table <tt>form_related_user</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from form_related_user where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return List<FormRelatedUserDO>
	 *	@throws DataAccessException
	 */	 
    public List<FormRelatedUserDO> findByProjectCode(String projectCode) throws DataAccessException {

        return getSqlMapClientTemplate().queryForList("MS-FORM-RELATED-USER-FIND-BY-PROJECT-CODE", projectCode);

    }

	/**
	 *  Delete records from DB table <tt>form_related_user</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from form_related_user where (related_id = ?)</tt>
	 *
	 *	@param relatedId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long relatedId) throws DataAccessException {
        Long param = new Long(relatedId);

        return getSqlMapClientTemplate().delete("MS-FORM-RELATED-USER-DELETE-BY-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>form_related_user</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from form_related_user where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return getSqlMapClientTemplate().delete("MS-FORM-RELATED-USER-DELETE-BY-FORM-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>form_related_user</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from form_related_user where ((form_id = ?) AND (exe_status = 'WAITING'))</tt>
	 *
	 *	@param formId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteWaiting(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return getSqlMapClientTemplate().delete("MS-FORM-RELATED-USER-DELETE-WAITING", param);
    }

	/**
	 *  Delete records from DB table <tt>form_related_user</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from form_related_user where (project_code = ?)</tt>
	 *
	 *	@param projectCode
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByProjectCode(String projectCode) throws DataAccessException {

        return getSqlMapClientTemplate().delete("MS-FORM-RELATED-USER-DELETE-BY-PROJECT-CODE", projectCode);
    }

	/**
	 *  Query DB table <tt>form_related_user</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from form_related_user where (1 = 1)</tt>
	 *
	 *	@param formRelatedUser
	 *	@param deptIdList
	 *	@param exeStatusList
	 *	@param excludeList
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<FormRelatedUserDO>
	 *	@throws DataAccessException
	 */	 
    public List<FormRelatedUserDO> findByCondition(FormRelatedUserDO formRelatedUser, List deptIdList, List exeStatusList, List excludeList, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException {
    	if (formRelatedUser == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("formRelatedUser", formRelatedUser);
        param.put("deptIdList", deptIdList);
        param.put("exeStatusList", exeStatusList);
        param.put("excludeList", excludeList);
        param.put("sortCol", sortCol);
        param.put("sortOrder", sortOrder);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));

        return getSqlMapClientTemplate().queryForList("MS-FORM-RELATED-USER-FIND-BY-CONDITION", param);

    }

	/**
	 *  Query DB table <tt>form_related_user</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from form_related_user where (1 = 1)</tt>
	 *
	 *	@param formRelatedUser
	 *	@param deptIdList
	 *	@param exeStatusList
	 *	@param excludeList
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(FormRelatedUserDO formRelatedUser, List deptIdList, List exeStatusList, List excludeList) throws DataAccessException {
    	if (formRelatedUser == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("formRelatedUser", formRelatedUser);
        param.put("deptIdList", deptIdList);
        param.put("exeStatusList", exeStatusList);
        param.put("excludeList", excludeList);

	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-FORM-RELATED-USER-FIND-BY-CONDITION-COUNT", param);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

}