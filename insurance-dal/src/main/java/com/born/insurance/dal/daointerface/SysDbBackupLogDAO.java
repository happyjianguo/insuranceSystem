/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.daointerface;

// auto generated imports
import com.born.insurance.dal.dataobject.SysDbBackupLogDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>sys_db_backup_log</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/sys_db_backup_log.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface SysDbBackupLogDAO {
	/**
	 *  Insert one <tt>SysDbBackupLogDO</tt> object to DB table <tt>sys_db_backup_log</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into sys_db_backup_log(log_id,db_host,scheme_name,backup_file,backup_time,is_success,is_del,del_time,remark,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param sysDbBackupLog
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(SysDbBackupLogDO sysDbBackupLog) throws DataAccessException;

	/**
	 *  Update DB table <tt>sys_db_backup_log</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update sys_db_backup_log set db_host=?, scheme_name=?, backup_file=?, backup_time=?, is_success=?, is_del=?, del_time=?, remark=? where (log_id = ?)</tt>
	 *
	 *	@param sysDbBackupLog
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(SysDbBackupLogDO sysDbBackupLog) throws DataAccessException;

	/**
	 *  Query DB table <tt>sys_db_backup_log</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from sys_db_backup_log where (log_id = ?)</tt>
	 *
	 *	@param logId
	 *	@return SysDbBackupLogDO
	 *	@throws DataAccessException
	 */	 
    public SysDbBackupLogDO findById(long logId) throws DataAccessException;

	/**
	 *  Query DB table <tt>sys_db_backup_log</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from sys_db_backup_log where (1 = 1)</tt>
	 *
	 *	@param sysDbBackupLog
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<SysDbBackupLogDO>
	 *	@throws DataAccessException
	 */	 
    public List<SysDbBackupLogDO> findByCondition(SysDbBackupLogDO sysDbBackupLog, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>sys_db_backup_log</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from sys_db_backup_log where (1 = 1)</tt>
	 *
	 *	@param sysDbBackupLog
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(SysDbBackupLogDO sysDbBackupLog) throws DataAccessException;

}