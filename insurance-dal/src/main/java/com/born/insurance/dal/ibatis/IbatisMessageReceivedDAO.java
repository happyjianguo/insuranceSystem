/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.ibatis;

import com.born.insurance.dal.daointerface.MessageReceivedDAO;
import com.born.insurance.dal.dataobject.MessageReceivedDO;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;


// auto generated imports
import org.springframework.dao.DataAccessException;
import java.util.Date;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.fcs.pm.dal.daointerface.MessageReceivedDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/message_received.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisMessageReceivedDAO extends SqlMapClientDaoSupport implements MessageReceivedDAO {
	/**
	 *  Insert one <tt>MessageReceivedDO</tt> object to DB table <tt>message_received</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into message_received(received_id,message_id,message_title,message_type,message_subject,message_content,notification_object,view_type,link_url,message_received_date,message_sender_id,message_sender_name,message_received_name,message_received_id,message_received_status,message_received_account,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param messageReceived
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(MessageReceivedDO messageReceived) throws DataAccessException {
    	if (messageReceived == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-MESSAGE-RECEIVED-INSERT", messageReceived);

        return messageReceived.getReceivedId();
    }

	/**
	 *  Update DB table <tt>message_received</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update message_received set message_id=?, message_title=?, message_type=?, message_subject=?, message_content=?, notification_object=?, view_type=?, link_url=?, message_received_date=?, message_sender_id=?, message_sender_name=?, message_received_name=?, message_received_id=?, message_received_status=?, message_received_account=? where (received_id = ?)</tt>
	 *
	 *	@param messageReceived
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(MessageReceivedDO messageReceived) throws DataAccessException {
    	if (messageReceived == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-MESSAGE-RECEIVED-UPDATE", messageReceived);
    }

	/**
	 *  Update DB table <tt>message_received</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update message_received set message_received_status=? where (message_received_id = ?)</tt>
	 *
	 *	@param messageReceivedStatus
	 *	@param messageReceivedId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateStatus(String messageReceivedStatus, long messageReceivedId) throws DataAccessException {
        Map param = new HashMap();

        param.put("messageReceivedStatus", messageReceivedStatus);
        param.put("messageReceivedId", new Long(messageReceivedId));

        return getSqlMapClientTemplate().update("MS-MESSAGE-RECEIVED-UPDATE-STATUS", param);
    }

	/**
	 *  Query DB table <tt>message_received</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from message_received where (received_id = ?)</tt>
	 *
	 *	@param receivedId
	 *	@return MessageReceivedDO
	 *	@throws DataAccessException
	 */	 
    public MessageReceivedDO findById(long receivedId) throws DataAccessException {
        Long param = new Long(receivedId);

        return (MessageReceivedDO) getSqlMapClientTemplate().queryForObject("MS-MESSAGE-RECEIVED-FIND-BY-ID", param);

    }

	/**
	 *  Delete records from DB table <tt>message_received</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from message_received where (received_id = ?)</tt>
	 *
	 *	@param receivedId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long receivedId) throws DataAccessException {
        Long param = new Long(receivedId);

        return getSqlMapClientTemplate().delete("MS-MESSAGE-RECEIVED-DELETE-BY-ID", param);
    }

	/**
	 *  Query DB table <tt>message_received</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from message_received where (1 = 1)</tt>
	 *
	 *	@param messageReceived
	 *	@param beginReceivedDate
	 *	@param endReceivedDate
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@param statusList
	 *	@return List<MessageReceivedDO>
	 *	@throws DataAccessException
	 */	 
    public List<MessageReceivedDO> findByCondition(MessageReceivedDO messageReceived, Date beginReceivedDate, Date endReceivedDate, String sortCol, String sortOrder, long limitStart, long pageSize, List statusList) throws DataAccessException {
    	if (messageReceived == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("messageReceived", messageReceived);
        param.put("beginReceivedDate", beginReceivedDate);
        param.put("endReceivedDate", endReceivedDate);
        param.put("sortCol", sortCol);
        param.put("sortOrder", sortOrder);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));
        param.put("statusList", statusList);

        return getSqlMapClientTemplate().queryForList("MS-MESSAGE-RECEIVED-FIND-BY-CONDITION", param);

    }

	/**
	 *  Query DB table <tt>message_received</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from message_received</tt>
	 *
	 *	@param messageReceived
	 *	@param beginReceivedDate
	 *	@param endReceivedDate
	 *	@param statusList
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findCountByCondition(MessageReceivedDO messageReceived, Date beginReceivedDate, Date endReceivedDate, List statusList) throws DataAccessException {
    	if (messageReceived == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("messageReceived", messageReceived);
        param.put("beginReceivedDate", beginReceivedDate);
        param.put("endReceivedDate", endReceivedDate);
        param.put("statusList", statusList);

	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-MESSAGE-RECEIVED-FIND-COUNT-BY-CONDITION", param);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

}