package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 金融资源领取回调通知
 *
 * @author auto create
 * @since 1.0, 2021-01-15 11:33:33
 */
public class AlipayFinancialnetAuthPaymentNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 7635345491719591838L;

	/**
	 * 商品资源基础价值
	 */
	@ApiField("basic_amount")
	private String basicAmount;

	/**
	 * 商品资源权益价值
	 */
	@ApiField("benefit_amount")
	private String benefitAmount;

	/**
	 * 业务状态
	 */
	@ApiField("biz_status")
	private String bizStatus;

	/**
	 * 由平台分配，领取、消费的品类类型，有储值方案、商品、权益方案等
	 */
	@ApiField("commodity_type")
	private String commodityType;

	/**
	 * 外部资源品类的id（长度<128）
	 */
	@ApiField("out_commodity_id")
	private String outCommodityId;

	/**
	 * 外部流水号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 由平台分配，区分外部回调来源平台的身份
	 */
	@ApiField("platform_id")
	private String platformId;

	/**
	 * 业务流水号（非必填）
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * uuid，用于身份核验（选填）
	 */
	@ApiField("validate_token")
	private String validateToken;

	public String getBasicAmount() {
		return this.basicAmount;
	}
	public void setBasicAmount(String basicAmount) {
		this.basicAmount = basicAmount;
	}

	public String getBenefitAmount() {
		return this.benefitAmount;
	}
	public void setBenefitAmount(String benefitAmount) {
		this.benefitAmount = benefitAmount;
	}

	public String getBizStatus() {
		return this.bizStatus;
	}
	public void setBizStatus(String bizStatus) {
		this.bizStatus = bizStatus;
	}

	public String getCommodityType() {
		return this.commodityType;
	}
	public void setCommodityType(String commodityType) {
		this.commodityType = commodityType;
	}

	public String getOutCommodityId() {
		return this.outCommodityId;
	}
	public void setOutCommodityId(String outCommodityId) {
		this.outCommodityId = outCommodityId;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getPlatformId() {
		return this.platformId;
	}
	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getValidateToken() {
		return this.validateToken;
	}
	public void setValidateToken(String validateToken) {
		this.validateToken = validateToken;
	}

}
