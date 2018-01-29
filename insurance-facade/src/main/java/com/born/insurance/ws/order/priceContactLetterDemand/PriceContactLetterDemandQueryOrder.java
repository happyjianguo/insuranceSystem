package com.born.insurance.ws.order.priceContactLetterDemand;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import java.util.Date;
import com.born.insurance.ws.base.QueryPermissionPageBase;

public class PriceContactLetterDemandQueryOrder extends QueryPermissionPageBase {
				
 	/**
	* 总长
	*/	
	private String totalLength;
 	/**
	* 工程承包人、建造承包人
	*/	
	private String engineeringContractor;
 	/**
	* 上船台
	*/	
	private String berth;
 	/**
	* 建造地点
	*/	
	private String constructionSite;
 	/**
	* 工程分包人、建造分包人
	*/	
	private String engineeringSubcontractor;
 	/**
	* 适航
	*/	
	private String airworthiness;
 	/**
	* 详细信息
	*/	
	private String remark;
 	/**
	* 交船地点
	*/	
	private String deliveryShipPlace;
 	/**
	* 保证期
	*/	
	private Date warrantyPeriod;
 	/**
	* 其中动工
	*/	
	private String whichStart;
 	/**
	* 扩展字段
	*/	
	private String ext;
 	/**
	* 型宽
	*/	
	private String typeWidth;
 	/**
	* 运输工具及航次
	*/	
	private String transportNum;
 	/**
	* 提单(运单)号
	*/	
	private String billLadingNo;
 	/**
	* 所属行业
	*/	
	private String industry;
 	/**
	* 施工面积
	*/	
	private String constructionArea;
 	/**
	* 型深
	*/	
	private String deep;
 	/**
	* 试车期
	*/	
	private Date commissioningPeriod;
 	/**
	* 主营业务
	*/	
	private String busiScope;
 	/**
	* 工程设计单位
	*/	
	private String engineeringDesignUnit;
 	/**
	* 总吨
	*/	
	private String totalTon;
 	/**
	* 临时
	*/	
	private long tempdoor;
 	/**
	* 车位数
	*/	
	private long parkingNum;
 	/**
	* 设计单位等级
	*/	
	private String designUnitLevel;
 	/**
	* 启运日期
	*/	
	private Date departureDate;
 	/**
	* 发票号
	*/	
	private String invoiceNo;
 	/**
	* 经营区域
	*/	
	private String busiAreas;
 	/**
	* 起运地
	*/	
	private String departurePlace;
 	/**
	* 工程名称、船名
	*/	
	private String projectName;
 	/**
	* 室内
	*/	
	private long indoor;
 	/**
	* 合同编号
	*/	
	private String contractNo;
 	/**
	* 面积
	*/	
	private String busiAcreage;
 	/**
	* 版本
	*/	
	private long version;
 	/**
	* id
	*/	
	private long id;
 	/**
	* 载重吨
	*/	
	private String loadTon;
 	/**
	* 建造期限、建造期限
	*/	
	private Date constructionPeriod;
 	/**
	* 途径地
	*/	
	private String viaPlace;
 	/**
	* 主要原料、产品及流程
	*/	
	private String products;
 	/**
	* 船舶类型
	*/	
	private String shipType;
 	/**
	* 发票金额
	*/	
	private long invoiceValue;
 	/**
	* 工程造价、船舶造价
	*/	
	private long engineeringCost;
 	/**
	* 交船
	*/	
	private String deliveryVessel;
 	/**
	* 被保险人
	*/	
	private String insuredPerson;
 	/**
	* 摩托车位
	*/	
	private long motodoor;
 	/**
	* 目的地
	*/	
	private String destinationPlace;
 	/**
	* 施工期限
	*/	
	private Date projectDuration;
 	/**
	* 投保人
	*/	
	private String policyHolder;
 	/**
	* 下水
	*/	
	private String beLaunched;
 	/**
	* 地址
	*/	
	private String busiAddress;
 	/**
	* 室外
	*/	
	private long outdoor;
 	/**
	* 试航区域
	*/	
	private String trialRegional;
 	/**
	* 标的编号
	*/	
	private String demandNo;
 	/**
	* 工程所有人、船舶所有人
	*/	
	private String projectOwner;
 	/**
	* 风险信息
	*/	
	private String riskInfo;
 	/**
	* 信用证号
	*/	
	private String creditLetterNo;
 	/**
	* 标的名称
	*/	
	private String demandName;
 	/**
	* 询价方案id
	*/	
	private long contactLetterId;
 
  	public String getTotalLength() {
        return totalLength;
	}

	public void setTotalLength(String totalLength) {
        this.totalLength = totalLength;
	}
	public String getEngineeringContractor() {
        return engineeringContractor;
	}

	public void setEngineeringContractor(String engineeringContractor) {
        this.engineeringContractor = engineeringContractor;
	}
	public String getBerth() {
        return berth;
	}

	public void setBerth(String berth) {
        this.berth = berth;
	}
	public String getConstructionSite() {
        return constructionSite;
	}

	public void setConstructionSite(String constructionSite) {
        this.constructionSite = constructionSite;
	}
	public String getEngineeringSubcontractor() {
        return engineeringSubcontractor;
	}

	public void setEngineeringSubcontractor(String engineeringSubcontractor) {
        this.engineeringSubcontractor = engineeringSubcontractor;
	}
	public String getAirworthiness() {
        return airworthiness;
	}

	public void setAirworthiness(String airworthiness) {
        this.airworthiness = airworthiness;
	}
	public String getRemark() {
        return remark;
	}

	public void setRemark(String remark) {
        this.remark = remark;
	}
	public String getDeliveryShipPlace() {
        return deliveryShipPlace;
	}

	public void setDeliveryShipPlace(String deliveryShipPlace) {
        this.deliveryShipPlace = deliveryShipPlace;
	}
	public Date getWarrantyPeriod() {
        return warrantyPeriod;
	}

	public void setWarrantyPeriod(Date warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
	}
	public String getWhichStart() {
        return whichStart;
	}

	public void setWhichStart(String whichStart) {
        this.whichStart = whichStart;
	}
	public String getExt() {
        return ext;
	}

	public void setExt(String ext) {
        this.ext = ext;
	}
	public String getTypeWidth() {
        return typeWidth;
	}

	public void setTypeWidth(String typeWidth) {
        this.typeWidth = typeWidth;
	}
	public String getTransportNum() {
        return transportNum;
	}

	public void setTransportNum(String transportNum) {
        this.transportNum = transportNum;
	}
	public String getBillLadingNo() {
        return billLadingNo;
	}

	public void setBillLadingNo(String billLadingNo) {
        this.billLadingNo = billLadingNo;
	}
	public String getIndustry() {
        return industry;
	}

	public void setIndustry(String industry) {
        this.industry = industry;
	}
	public String getConstructionArea() {
        return constructionArea;
	}

	public void setConstructionArea(String constructionArea) {
        this.constructionArea = constructionArea;
	}
	public String getDeep() {
        return deep;
	}

	public void setDeep(String deep) {
        this.deep = deep;
	}
	public Date getCommissioningPeriod() {
        return commissioningPeriod;
	}

	public void setCommissioningPeriod(Date commissioningPeriod) {
        this.commissioningPeriod = commissioningPeriod;
	}
	public String getBusiScope() {
        return busiScope;
	}

	public void setBusiScope(String busiScope) {
        this.busiScope = busiScope;
	}
	public String getEngineeringDesignUnit() {
        return engineeringDesignUnit;
	}

	public void setEngineeringDesignUnit(String engineeringDesignUnit) {
        this.engineeringDesignUnit = engineeringDesignUnit;
	}
	public String getTotalTon() {
        return totalTon;
	}

	public void setTotalTon(String totalTon) {
        this.totalTon = totalTon;
	}
	public long getTempdoor() {
        return tempdoor;
	}

	public void setTempdoor(long tempdoor) {
        this.tempdoor = tempdoor;
	}
	public long getParkingNum() {
        return parkingNum;
	}

	public void setParkingNum(long parkingNum) {
        this.parkingNum = parkingNum;
	}
	public String getDesignUnitLevel() {
        return designUnitLevel;
	}

	public void setDesignUnitLevel(String designUnitLevel) {
        this.designUnitLevel = designUnitLevel;
	}
	public Date getDepartureDate() {
        return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
	}
	public String getInvoiceNo() {
        return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
	}
	public String getBusiAreas() {
        return busiAreas;
	}

	public void setBusiAreas(String busiAreas) {
        this.busiAreas = busiAreas;
	}
	public String getDeparturePlace() {
        return departurePlace;
	}

	public void setDeparturePlace(String departurePlace) {
        this.departurePlace = departurePlace;
	}
	public String getProjectName() {
        return projectName;
	}

	public void setProjectName(String projectName) {
        this.projectName = projectName;
	}
	public long getIndoor() {
        return indoor;
	}

	public void setIndoor(long indoor) {
        this.indoor = indoor;
	}
	public String getContractNo() {
        return contractNo;
	}

	public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
	}
	public String getBusiAcreage() {
        return busiAcreage;
	}

	public void setBusiAcreage(String busiAcreage) {
        this.busiAcreage = busiAcreage;
	}
	public long getVersion() {
        return version;
	}

	public void setVersion(long version) {
        this.version = version;
	}
	public long getId() {
        return id;
	}

	public void setId(long id) {
        this.id = id;
	}
	public String getLoadTon() {
        return loadTon;
	}

	public void setLoadTon(String loadTon) {
        this.loadTon = loadTon;
	}
	public Date getConstructionPeriod() {
        return constructionPeriod;
	}

	public void setConstructionPeriod(Date constructionPeriod) {
        this.constructionPeriod = constructionPeriod;
	}
	public String getViaPlace() {
        return viaPlace;
	}

	public void setViaPlace(String viaPlace) {
        this.viaPlace = viaPlace;
	}
	public String getProducts() {
        return products;
	}

	public void setProducts(String products) {
        this.products = products;
	}
	public String getShipType() {
        return shipType;
	}

	public void setShipType(String shipType) {
        this.shipType = shipType;
	}
	public long getInvoiceValue() {
        return invoiceValue;
	}

	public void setInvoiceValue(long invoiceValue) {
        this.invoiceValue = invoiceValue;
	}
	public long getEngineeringCost() {
        return engineeringCost;
	}

	public void setEngineeringCost(long engineeringCost) {
        this.engineeringCost = engineeringCost;
	}
	public String getDeliveryVessel() {
        return deliveryVessel;
	}

	public void setDeliveryVessel(String deliveryVessel) {
        this.deliveryVessel = deliveryVessel;
	}
	public String getInsuredPerson() {
        return insuredPerson;
	}

	public void setInsuredPerson(String insuredPerson) {
        this.insuredPerson = insuredPerson;
	}
	public long getMotodoor() {
        return motodoor;
	}

	public void setMotodoor(long motodoor) {
        this.motodoor = motodoor;
	}
	public String getDestinationPlace() {
        return destinationPlace;
	}

	public void setDestinationPlace(String destinationPlace) {
        this.destinationPlace = destinationPlace;
	}
	public Date getProjectDuration() {
        return projectDuration;
	}

	public void setProjectDuration(Date projectDuration) {
        this.projectDuration = projectDuration;
	}
	public String getPolicyHolder() {
        return policyHolder;
	}

	public void setPolicyHolder(String policyHolder) {
        this.policyHolder = policyHolder;
	}
	public String getBeLaunched() {
        return beLaunched;
	}

	public void setBeLaunched(String beLaunched) {
        this.beLaunched = beLaunched;
	}
	public String getBusiAddress() {
        return busiAddress;
	}

	public void setBusiAddress(String busiAddress) {
        this.busiAddress = busiAddress;
	}
	public long getOutdoor() {
        return outdoor;
	}

	public void setOutdoor(long outdoor) {
        this.outdoor = outdoor;
	}
	public String getTrialRegional() {
        return trialRegional;
	}

	public void setTrialRegional(String trialRegional) {
        this.trialRegional = trialRegional;
	}
	public String getDemandNo() {
        return demandNo;
	}

	public void setDemandNo(String demandNo) {
        this.demandNo = demandNo;
	}
	public String getProjectOwner() {
        return projectOwner;
	}

	public void setProjectOwner(String projectOwner) {
        this.projectOwner = projectOwner;
	}
	public String getRiskInfo() {
        return riskInfo;
	}

	public void setRiskInfo(String riskInfo) {
        this.riskInfo = riskInfo;
	}
	public String getCreditLetterNo() {
        return creditLetterNo;
	}

	public void setCreditLetterNo(String creditLetterNo) {
        this.creditLetterNo = creditLetterNo;
	}
	public String getDemandName() {
        return demandName;
	}

	public void setDemandName(String demandName) {
        this.demandName = demandName;
	}
	public long getContactLetterId() {
        return contactLetterId;
	}

	public void setContactLetterId(long contactLetterId) {
        this.contactLetterId = contactLetterId;
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