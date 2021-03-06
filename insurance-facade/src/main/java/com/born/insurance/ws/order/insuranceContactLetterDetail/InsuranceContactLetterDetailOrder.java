package com.born.insurance.ws.order.insuranceContactLetterDetail;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.born.insurance.ws.order.base.ProcessOrder;
import com.yjf.common.lang.util.money.Money;

public class InsuranceContactLetterDetailOrder extends ProcessOrder {
				
 	/**
	 * 
	 */
	private static final long serialVersionUID = 6785683113166327755L;
	/**
	* id
	*/	
	private long letterDetailId;
	/**
	* 经纪费
	*/	
	private Money brokerAmount = new Money(0,0);
 	/**
	* 保费
	*/	
	private Money premiumAmount = new Money(0,0) ;
 	/**
	* 保额
	*/	
	private Money insuranceAmount = new Money(0,0) ;
	
	/**
	 * 首期保费
	 */
	private Money firstPremiumAmount = new Money(0,0)  ;
	
	/**
	 * 缴费期限
	 */
	private String 	period;
 	/**
	* 联系函id
	*/	
	private long letterId;
 	/**
	* 产品的id
	*/	
	private long productId;
	
	/**
	 * 产品的名称
	 */
	private String productName ;
 
  	public long getLetterDetailId() {
        return letterDetailId;
	}

	public void setLetterDetailId(long letterDetailId) {
        this.letterDetailId = letterDetailId;
	}
	
	public long getLetterId() {
        return letterId;
	}

	public void setLetterId(long letterId) {
        this.letterId = letterId;
	}

    public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	

	public Money getBrokerAmount() {
		return brokerAmount;
	}

	public void setBrokerAmount(Money brokerAmount) {
		this.brokerAmount = brokerAmount;
	}

	public Money getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(Money premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public Money getInsuranceAmount() {
		return insuranceAmount;
	}

	public void setInsuranceAmount(Money insuranceAmount) {
		this.insuranceAmount = insuranceAmount;
	}

	public Money getFirstPremiumAmount() {
		return firstPremiumAmount;
	}

	public void setFirstPremiumAmount(Money firstPremiumAmount) {
		this.firstPremiumAmount = firstPremiumAmount;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
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