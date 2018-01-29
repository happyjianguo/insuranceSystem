/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.daointerface;

// auto generated imports
import com.born.insurance.dal.dataobject.PriceContactLetterSchemeDetailDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>price_contact_letter_scheme_detail</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/price_contact_letter_scheme_detail.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface PriceContactLetterSchemeDetailDAO {
	/**
	 *  Insert one <tt>PriceContactLetterSchemeDetailDO</tt> object to DB table <tt>price_contact_letter_scheme_detail</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into price_contact_letter_scheme_detail(id,letter_scheme_id,parent_catalog_id,parent_catalog_name,catalog_id,catalog_name,liability_name_id,responsibility_scope,property_category,insurance_amount,insurance_way,deductible_rate,premium_rate,limit_amount_type,limit_amount,expect_premium_amount,intention_broker_rate,non_deductible,name,packing_quantity,sign,job,age_group,person_num,programme,goods,target,version,ext) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param priceContactLetterSchemeDetail
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(PriceContactLetterSchemeDetailDO priceContactLetterSchemeDetail) throws DataAccessException;

	/**
	 *  Update DB table <tt>price_contact_letter_scheme_detail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update price_contact_letter_scheme_detail set letter_scheme_id=?, parent_catalog_id=?, parent_catalog_name=?, catalog_id=?, catalog_name=?, liability_name_id=?, responsibility_scope=?, property_category=?, insurance_amount=?, insurance_way=?, deductible_rate=?, premium_rate=?, limit_amount_type=?, limit_amount=?, expect_premium_amount=?, intention_broker_rate=?, non_deductible=?, name=?, packing_quantity=?, sign=?, job=?, age_group=?, person_num=?, programme=?, goods=?, target=?, version=?, ext=? where (id = ?)</tt>
	 *
	 *	@param priceContactLetterSchemeDetail
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(PriceContactLetterSchemeDetailDO priceContactLetterSchemeDetail) throws DataAccessException;

	/**
	 *  Query DB table <tt>price_contact_letter_scheme_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, letter_scheme_id, parent_catalog_id, parent_catalog_name, catalog_id, catalog_name, liability_name_id, responsibility_scope, property_category, insurance_amount, insurance_way, deductible_rate, premium_rate, limit_amount_type, limit_amount, expect_premium_amount, intention_broker_rate, non_deductible, name, packing_quantity, sign, job, age_group, person_num, programme, goods, target, version, ext from price_contact_letter_scheme_detail where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return PriceContactLetterSchemeDetailDO
	 *	@throws DataAccessException
	 */	 
    public PriceContactLetterSchemeDetailDO findById(long id) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>price_contact_letter_scheme_detail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from price_contact_letter_scheme_detail where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>price_contact_letter_scheme_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, letter_scheme_id, parent_catalog_id, parent_catalog_name, catalog_id, catalog_name, liability_name_id, responsibility_scope, property_category, insurance_amount, insurance_way, deductible_rate, premium_rate, limit_amount_type, limit_amount, expect_premium_amount, intention_broker_rate, non_deductible, name, packing_quantity, sign, job, age_group, person_num, programme, goods, target, version, ext from price_contact_letter_scheme_detail where (1 = 1)</tt>
	 *
	 *	@param priceContactLetterSchemeDetail
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<PriceContactLetterSchemeDetailDO>
	 *	@throws DataAccessException
	 */	 
    public List<PriceContactLetterSchemeDetailDO> findByCondition(PriceContactLetterSchemeDetailDO priceContactLetterSchemeDetail, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>price_contact_letter_scheme_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from price_contact_letter_scheme_detail where (1 = 1)</tt>
	 *
	 *	@param priceContactLetterSchemeDetail
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(PriceContactLetterSchemeDetailDO priceContactLetterSchemeDetail) throws DataAccessException;

}