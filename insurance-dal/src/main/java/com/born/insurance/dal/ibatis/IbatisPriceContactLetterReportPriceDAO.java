/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.insurance.dal.daointerface.PriceContactLetterReportPriceDAO;


// auto generated imports
import com.born.insurance.dal.dataobject.PriceContactLetterReportPriceDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.insurance.dal.daointerface.PriceContactLetterReportPriceDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/price_contact_letter_report_price.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisPriceContactLetterReportPriceDAO extends SqlMapClientDaoSupport implements PriceContactLetterReportPriceDAO {
	/**
	 *  Insert one <tt>PriceContactLetterReportPriceDO</tt> object to DB table <tt>price_contact_letter_report_price</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into price_contact_letter_report_price(report_price_id,form_id,contact_letter_id,remark) values (?, ?, ?, ?)</tt>
	 *
	 *	@param priceContactLetterReportPrice
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(PriceContactLetterReportPriceDO priceContactLetterReportPrice) throws DataAccessException {
    	if (priceContactLetterReportPrice == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-PRICE-CONTACT-LETTER-REPORT-PRICE-INSERT", priceContactLetterReportPrice);

        return priceContactLetterReportPrice.getReportPriceId();
    }

	/**
	 *  Update DB table <tt>price_contact_letter_report_price</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update price_contact_letter_report_price set form_id=?, contact_letter_id=?, remark=? where (report_price_id = ?)</tt>
	 *
	 *	@param priceContactLetterReportPrice
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(PriceContactLetterReportPriceDO priceContactLetterReportPrice) throws DataAccessException {
    	if (priceContactLetterReportPrice == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-PRICE-CONTACT-LETTER-REPORT-PRICE-UPDATE", priceContactLetterReportPrice);
    }

	/**
	 *  Query DB table <tt>price_contact_letter_report_price</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select report_price_id, form_id, contact_letter_id, remark from price_contact_letter_report_price where (report_price_id = ?)</tt>
	 *
	 *	@param reportPriceId
	 *	@return PriceContactLetterReportPriceDO
	 *	@throws DataAccessException
	 */	 
    public PriceContactLetterReportPriceDO findByReportPriceId(long reportPriceId) throws DataAccessException {
        Long param = new Long(reportPriceId);

        return (PriceContactLetterReportPriceDO) getSqlMapClientTemplate().queryForObject("MS-PRICE-CONTACT-LETTER-REPORT-PRICE-FIND-BY-REPORT-PRICE-ID", param);

    }

	/**
	 *  Query DB table <tt>price_contact_letter_report_price</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select report_price_id, form_id, contact_letter_id, remark from price_contact_letter_report_price where (contact_letter_id = ?)</tt>
	 *
	 *	@param contactLetterId
	 *	@return PriceContactLetterReportPriceDO
	 *	@throws DataAccessException
	 */	 
    public PriceContactLetterReportPriceDO findByContactLetterId(long contactLetterId) throws DataAccessException {
        Long param = new Long(contactLetterId);

        return (PriceContactLetterReportPriceDO) getSqlMapClientTemplate().queryForObject("MS-PRICE-CONTACT-LETTER-REPORT-PRICE-FIND-BY-CONTACT-LETTER-ID", param);

    }

	/**
	 *  Query DB table <tt>price_contact_letter_report_price</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select report_price_id, form_id, contact_letter_id, remark from price_contact_letter_report_price where (form_id = ?)</tt>
	 *
	 *	@param formId
	 *	@return PriceContactLetterReportPriceDO
	 *	@throws DataAccessException
	 */	 
    public PriceContactLetterReportPriceDO findByFormId(long formId) throws DataAccessException {
        Long param = new Long(formId);

        return (PriceContactLetterReportPriceDO) getSqlMapClientTemplate().queryForObject("MS-PRICE-CONTACT-LETTER-REPORT-PRICE-FIND-BY-FORM-ID", param);

    }

	/**
	 *  Delete records from DB table <tt>price_contact_letter_report_price</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from price_contact_letter_report_price where (report_price_id = ?)</tt>
	 *
	 *	@param reportPriceId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByReportPriceId(long reportPriceId) throws DataAccessException {
        Long param = new Long(reportPriceId);

        return getSqlMapClientTemplate().delete("MS-PRICE-CONTACT-LETTER-REPORT-PRICE-DELETE-BY-REPORT-PRICE-ID", param);
    }

	/**
	 *  Query DB table <tt>price_contact_letter_report_price</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select report_price_id, form_id, contact_letter_id, remark from price_contact_letter_report_price where (1 = 1)</tt>
	 *
	 *	@param priceContactLetterReportPrice
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<PriceContactLetterReportPriceDO>
	 *	@throws DataAccessException
	 */	 
    public List<PriceContactLetterReportPriceDO> findByCondition(PriceContactLetterReportPriceDO priceContactLetterReportPrice, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException {
    	if (priceContactLetterReportPrice == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("priceContactLetterReportPrice", priceContactLetterReportPrice);
        param.put("sortCol", sortCol);
        param.put("sortOrder", sortOrder);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));

        return getSqlMapClientTemplate().queryForList("MS-PRICE-CONTACT-LETTER-REPORT-PRICE-FIND-BY-CONDITION", param);

    }

	/**
	 *  Query DB table <tt>price_contact_letter_report_price</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from price_contact_letter_report_price where (1 = 1)</tt>
	 *
	 *	@param priceContactLetterReportPrice
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(PriceContactLetterReportPriceDO priceContactLetterReportPrice) throws DataAccessException {
    	if (priceContactLetterReportPrice == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}


	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-PRICE-CONTACT-LETTER-REPORT-PRICE-FIND-BY-CONDITION-COUNT", priceContactLetterReportPrice);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

}