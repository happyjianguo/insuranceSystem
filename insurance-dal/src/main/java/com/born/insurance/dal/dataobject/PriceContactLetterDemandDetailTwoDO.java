/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.dataobject;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

// auto generated imports

/**
 * A data object class directly models database table <tt>price_contact_letter_demand_detail_two</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/price_contact_letter_demand_detail_two.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class PriceContactLetterDemandDetailTwoDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private long id;

	private long letterDemandId;

	private String licensePlateNumber;

	private String drivingLicenseOwner;

	private String frameNumber;

	private String brandModel;

	private String initialRegistrationDate;

	private String dangerousGoodsName;

	private String outputVolume;

	private String engineNumber;

	private String vehicleType;

	private String shipName;

	private String navigationArea;

	private String parking;

	private String constructionDate;

	private String singleVoyage;

	private String shipType;

	private String grossTonnage;

	private String alterationDate;

	private long version;

	private String ext;

    //========== getters and setters ==========

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public long getLetterDemandId() {
		return letterDemandId;
	}
	
	public void setLetterDemandId(long letterDemandId) {
		this.letterDemandId = letterDemandId;
	}

	public String getLicensePlateNumber() {
		return licensePlateNumber;
	}
	
	public void setLicensePlateNumber(String licensePlateNumber) {
		this.licensePlateNumber = licensePlateNumber;
	}

	public String getDrivingLicenseOwner() {
		return drivingLicenseOwner;
	}
	
	public void setDrivingLicenseOwner(String drivingLicenseOwner) {
		this.drivingLicenseOwner = drivingLicenseOwner;
	}

	public String getFrameNumber() {
		return frameNumber;
	}
	
	public void setFrameNumber(String frameNumber) {
		this.frameNumber = frameNumber;
	}

	public String getBrandModel() {
		return brandModel;
	}
	
	public void setBrandModel(String brandModel) {
		this.brandModel = brandModel;
	}

	public String getInitialRegistrationDate() {
		return initialRegistrationDate;
	}
	
	public void setInitialRegistrationDate(String initialRegistrationDate) {
		this.initialRegistrationDate = initialRegistrationDate;
	}

	public String getDangerousGoodsName() {
		return dangerousGoodsName;
	}
	
	public void setDangerousGoodsName(String dangerousGoodsName) {
		this.dangerousGoodsName = dangerousGoodsName;
	}

	public String getOutputVolume() {
		return outputVolume;
	}
	
	public void setOutputVolume(String outputVolume) {
		this.outputVolume = outputVolume;
	}

	public String getEngineNumber() {
		return engineNumber;
	}
	
	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}

	public String getVehicleType() {
		return vehicleType;
	}
	
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getShipName() {
		return shipName;
	}
	
	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	public String getNavigationArea() {
		return navigationArea;
	}
	
	public void setNavigationArea(String navigationArea) {
		this.navigationArea = navigationArea;
	}

	public String getParking() {
		return parking;
	}
	
	public void setParking(String parking) {
		this.parking = parking;
	}

	public String getConstructionDate() {
		return constructionDate;
	}
	
	public void setConstructionDate(String constructionDate) {
		this.constructionDate = constructionDate;
	}

	public String getSingleVoyage() {
		return singleVoyage;
	}
	
	public void setSingleVoyage(String singleVoyage) {
		this.singleVoyage = singleVoyage;
	}

	public String getShipType() {
		return shipType;
	}
	
	public void setShipType(String shipType) {
		this.shipType = shipType;
	}

	public String getGrossTonnage() {
		return grossTonnage;
	}
	
	public void setGrossTonnage(String grossTonnage) {
		this.grossTonnage = grossTonnage;
	}

	public String getAlterationDate() {
		return alterationDate;
	}
	
	public void setAlterationDate(String alterationDate) {
		this.alterationDate = alterationDate;
	}

	public long getVersion() {
		return version;
	}
	
	public void setVersion(long version) {
		this.version = version;
	}

	public String getExt() {
		return ext;
	}
	
	public void setExt(String ext) {
		this.ext = ext;
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
