/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.daointerface;

// auto generated imports
import com.born.insurance.dal.dataobject.PriceContactLetterCompanyReportPriceDetailDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>price_contact_letter_company_report_price_detail</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/price_contact_letter_company_report_price_detail.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface PriceContactLetterCompanyReportPriceDetailDAO {
	/**
	 *  Insert one <tt>PriceContactLetterCompanyReportPriceDetailDO</tt> object to DB table <tt>price_contact_letter_company_report_price_detail</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into price_contact_letter_company_report_price_detail(id,company_report_price_id,parent_catalog_id,parent_catalog_name,catalog_id,catalog_name,insurance_product_id,insurance_product_name,responsibility_scope,property_category,premium_amount,borker_amount,charge_rate,borker_amount_rate,insurance_amount,insurance_way,deductible_rate,premium_rate,limit_amount_type,limit_amount,expect_premium_amount,intention_broker_rate,non_deductible,product_id,product_name,packing_quantity,sign,job,age_group,person_num,programme,goods,target,version,ext) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param priceContactLetterCompanyReportPriceDetail
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(PriceContactLetterCompanyReportPriceDetailDO priceContactLetterCompanyReportPriceDetail) throws DataAccessException;

	/**
	 *  Update DB table <tt>price_contact_letter_company_report_price_detail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update price_contact_letter_company_report_price_detail set company_report_price_id=?, parent_catalog_id=?, parent_catalog_name=?, catalog_id=?, catalog_name=?, insurance_product_id=?, insurance_product_name=?, responsibility_scope=?, property_category=?, premium_amount=?, borker_amount=?, charge_rate=?, borker_amount_rate=?, insurance_amount=?, insurance_way=?, deductible_rate=?, premium_rate=?, limit_amount_type=?, limit_amount=?, expect_premium_amount=?, intention_broker_rate=?, non_deductible=?, product_id=?, product_name=?, packing_quantity=?, sign=?, job=?, age_group=?, person_num=?, programme=?, goods=?, target=?, version=?, ext=? where (id = ?)</tt>
	 *
	 *	@param priceContactLetterCompanyReportPriceDetail
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(PriceContactLetterCompanyReportPriceDetailDO priceContactLetterCompanyReportPriceDetail) throws DataAccessException;

	/**
	 *  Query DB table <tt>price_contact_letter_company_report_price_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, company_report_price_id, parent_catalog_id, parent_catalog_name, catalog_id, catalog_name, insurance_product_id, insurance_product_name, responsibility_scope, property_category, premium_amount, borker_amount, charge_rate, borker_amount_rate, insurance_amount, insurance_way, deductible_rate, premium_rate, limit_amount_type, limit_amount, expect_premium_amount, intention_broker_rate, non_deductible, product_id, product_name, packing_quantity, sign, job, age_group, person_num, programme, goods, target, version, ext from price_contact_letter_company_report_price_detail where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return PriceContactLetterCompanyReportPriceDetailDO
	 *	@throws DataAccessException
	 */	 
    public PriceContactLetterCompanyReportPriceDetailDO findById(long id) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>price_contact_letter_company_report_price_detail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from price_contact_letter_company_report_price_detail where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>price_contact_letter_company_report_price_detail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from price_contact_letter_company_report_price_detail where (company_report_price_id = ?)</tt>
	 *
	 *	@param companyReportPriceId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByCompanyReportPriceId(long companyReportPriceId) throws DataAccessException;

	/**
	 *  Query DB table <tt>price_contact_letter_company_report_price_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, company_report_price_id, parent_catalog_id, parent_catalog_name, catalog_id, catalog_name, insurance_product_id, insurance_product_name, responsibility_scope, property_category, premium_amount, borker_amount, charge_rate, borker_amount_rate, insurance_amount, insurance_way, deductible_rate, premium_rate, limit_amount_type, limit_amount, expect_premium_amount, intention_broker_rate, non_deductible, product_id, product_name, packing_quantity, sign, job, age_group, person_num, programme, goods, target, version, ext from price_contact_letter_company_report_price_detail where (1 = 1)</tt>
	 *
	 *	@param priceContactLetterCompanyReportPriceDetail
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<PriceContactLetterCompanyReportPriceDetailDO>
	 *	@throws DataAccessException
	 */	 
    public List<PriceContactLetterCompanyReportPriceDetailDO> findByCondition(PriceContactLetterCompanyReportPriceDetailDO priceContactLetterCompanyReportPriceDetail, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>price_contact_letter_company_report_price_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from price_contact_letter_company_report_price_detail where (1 = 1)</tt>
	 *
	 *	@param priceContactLetterCompanyReportPriceDetail
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(PriceContactLetterCompanyReportPriceDetailDO priceContactLetterCompanyReportPriceDetail) throws DataAccessException;

}