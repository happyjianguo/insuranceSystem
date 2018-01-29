/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.daointerface;

// auto generated imports
import com.born.insurance.dal.dataobject.UserExtraMessageDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>user_extra_message</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/user_extra_message.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface UserExtraMessageDAO {
	/**
	 *  Insert one <tt>UserExtraMessageDO</tt> object to DB table <tt>user_extra_message</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into user_extra_message(id,user_id,user_name,user_account,user_judge_key,oa_system_id,bank_name,bank_account_no,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param userExtraMessage
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(UserExtraMessageDO userExtraMessage) throws DataAccessException;

	/**
	 *  Update DB table <tt>user_extra_message</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update user_extra_message set user_id=?, user_name=?, user_account=?, user_judge_key=?, oa_system_id=?, bank_name=?, bank_account_no=? where (id = ?)</tt>
	 *
	 *	@param userExtraMessage
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(UserExtraMessageDO userExtraMessage) throws DataAccessException;

	/**
	 *  Query DB table <tt>user_extra_message</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from user_extra_message where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return UserExtraMessageDO
	 *	@throws DataAccessException
	 */	 
    public UserExtraMessageDO findById(long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>user_extra_message</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from user_extra_message where (user_account = ?)</tt>
	 *
	 *	@param userAccount
	 *	@return UserExtraMessageDO
	 *	@throws DataAccessException
	 */	 
    public UserExtraMessageDO findByAccount(String userAccount) throws DataAccessException;

	/**
	 *  Query DB table <tt>user_extra_message</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from user_extra_message where (user_id = ?)</tt>
	 *
	 *	@param userId
	 *	@return UserExtraMessageDO
	 *	@throws DataAccessException
	 */	 
    public UserExtraMessageDO findByUserId(long userId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>user_extra_message</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from user_extra_message where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>user_extra_message</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from user_extra_message where (1 = 1)</tt>
	 *
	 *	@param userExtraMessage
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<UserExtraMessageDO>
	 *	@throws DataAccessException
	 */	 
    public List<UserExtraMessageDO> findByCondition(UserExtraMessageDO userExtraMessage, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>user_extra_message</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from user_extra_message where (1 = 1)</tt>
	 *
	 *	@param userExtraMessage
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(UserExtraMessageDO userExtraMessage) throws DataAccessException;

}