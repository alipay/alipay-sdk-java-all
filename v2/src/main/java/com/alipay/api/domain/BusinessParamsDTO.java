package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务信息参数
 *
 * @author auto create
 * @since 1.0, 2023-03-06 17:54:02
 */
public class BusinessParamsDTO extends AlipayObject {

	private static final long serialVersionUID = 8399273628582584799L;

	/**
	 * 实际订单时间，在乘车码场景，传入的是用户刷码乘车时间
	 */
	@ApiField("actual_order_time")
	private String actualOrderTime;

	/**
	 * 校园卡编号
	 */
	@ApiField("campus_card")
	private String campusCard;

	/**
	 * 虚拟卡卡类型
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 因公付金额
	 */
	@ApiField("enterprise_pay_amount")
	private String enterprisePayAmount;

	/**
	 * 因公付业务信息
	 */
	@ApiField("enterprise_pay_info")
	private String enterprisePayInfo;

	/**
	 * 商户传入的交易税费。需要落地风控使用
	 */
	@ApiField("good_taxes")
	private String goodTaxes;

	public String getActualOrderTime() {
		return this.actualOrderTime;
	}
	public void setActualOrderTime(String actualOrderTime) {
		this.actualOrderTime = actualOrderTime;
	}

	public String getCampusCard() {
		return this.campusCard;
	}
	public void setCampusCard(String campusCard) {
		this.campusCard = campusCard;
	}

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getEnterprisePayAmount() {
		return this.enterprisePayAmount;
	}
	public void setEnterprisePayAmount(String enterprisePayAmount) {
		this.enterprisePayAmount = enterprisePayAmount;
	}

	public String getEnterprisePayInfo() {
		return this.enterprisePayInfo;
	}
	public void setEnterprisePayInfo(String enterprisePayInfo) {
		this.enterprisePayInfo = enterprisePayInfo;
	}

	public String getGoodTaxes() {
		return this.goodTaxes;
	}
	public void setGoodTaxes(String goodTaxes) {
		this.goodTaxes = goodTaxes;
	}

}
