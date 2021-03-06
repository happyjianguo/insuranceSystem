/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.daointerface;

// auto generated imports
import com.born.insurance.dal.dataobject.SysDbBackupConfigDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>sys_db_backup_config</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/sys_db_backup_config.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface SysDbBackupConfigDAO {
	/**
	 *  Insert one <tt>SysDbBackupConfigDO</tt> object to DB table <tt>sys_db_backup_config</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into sys_db_backup_config(config_id,db_home,db_user,db_psw,db_host,db_port,scheme_name,backup_folder,backup_inverval_minute,backup_time_begin,backup_time_end,in_use,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param sysDbBackupConfig
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(SysDbBackupConfigDO sysDbBackupConfig) throws DataAccessException;

	/**
	 *  Update DB table <tt>sys_db_backup_config</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update sys_db_backup_config set db_home=?, db_user=?, db_psw=?, db_host=?, db_port=?, scheme_name=?, backup_folder=?, backup_inverval_minute=?, backup_time_begin=?, backup_time_end=?, in_use=? where (config_id = ?)</tt>
	 *
	 *	@param sysDbBackupConfig
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(SysDbBackupConfigDO sysDbBackupConfig) throws DataAccessException;

	/**
	 *  Query DB table <tt>sys_db_backup_config</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from sys_db_backup_config where (config_id = ?)</tt>
	 *
	 *	@param configId
	 *	@return SysDbBackupConfigDO
	 *	@throws DataAccessException
	 */	 
    public SysDbBackupConfigDO findById(long configId) throws DataAccessException;

	/**
	 *  Query DB table <tt>sys_db_backup_config</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from sys_db_backup_config</tt>
	 *
	 *	@return List<SysDbBackupConfigDO>
	 *	@throws DataAccessException
	 */	 
    public List<SysDbBackupConfigDO> fandAll() throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>sys_db_backup_config</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from sys_db_backup_config where (config_id = ?)</tt>
	 *
	 *	@param configId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long configId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>sys_db_backup_config</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from sys_db_backup_config where (db_host = ?)</tt>
	 *
	 *	@param dbHost
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByHost(String dbHost) throws DataAccessException;

	/**
	 *  Query DB table <tt>sys_db_backup_config</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from sys_db_backup_config where (1 = 1)</tt>
	 *
	 *	@param sysDbBackupConfig
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<SysDbBackupConfigDO>
	 *	@throws DataAccessException
	 */	 
    public List<SysDbBackupConfigDO> findByCondition(SysDbBackupConfigDO sysDbBackupConfig, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>sys_db_backup_config</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from sys_db_backup_config where (1 = 1)</tt>
	 *
	 *	@param sysDbBackupConfig
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(SysDbBackupConfigDO sysDbBackupConfig) throws DataAccessException;

}