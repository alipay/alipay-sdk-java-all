package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消费订单信息
 *
 * @author auto create
 * @since 1.0, 2025-06-16 10:16:17
 */
public class ConsumeOrder extends AlipayObject {

	private static final long serialVersionUID = 7691968669349683339L;

	/**
	 * 应付金额，单位：元
	 */
	@ApiField("bill_amount")
	private String billAmount;

	/**
	 * 账单类型
	 */
	@ApiField("bill_type")
	private String billType;

	/**
	 * 小程序id
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 环境id
	 */
	@ApiField("biz_env_id")
	private String bizEnvId;

	/**
	 * 环境名称
	 */
	@ApiField("biz_env_name")
	private String bizEnvName;

	/**
	 * 账期
	 */
	@ApiField("biz_mth")
	private String bizMth;

	/**
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 优惠金额，单位：元
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 计费项
	 */
	@ApiField("fee_item_code")
	private String feeItemCode;

	/**
	 * 计费项名称
	 */
	@ApiField("fee_item_name")
	private String feeItemName;

	/**
	 * 未付金额，单位：元
	 */
	@ApiField("nonpayment_amount")
	private String nonpaymentAmount;

	/**
	 * 订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 总价，单位：元
	 */
	@ApiField("origin_bill_amount")
	private String originBillAmount;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 产品名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 实付金额，单位：元
	 */
	@ApiField("real_amount")
	private String realAmount;

	/**
	 * 规格实例id
	 */
	@ApiField("spec_instance_id")
	private String specInstanceId;

	/**
	 * 钱包来源
	 */
	@ApiField("wallet_source")
	private String walletSource;

	/**
	 * 钱包来源id
	 */
	@ApiField("wallet_source_id")
	private String walletSourceId;

	public String getBillAmount() {
		return this.billAmount;
	}
	public void setBillAmount(String billAmount) {
		this.billAmount = billAmount;
	}

	public String getBillType() {
		return this.billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
	}

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

	public String getBizEnvId() {
		return this.bizEnvId;
	}
	public void setBizEnvId(String bizEnvId) {
		this.bizEnvId = bizEnvId;
	}

	public String getBizEnvName() {
		return this.bizEnvName;
	}
	public void setBizEnvName(String bizEnvName) {
		this.bizEnvName = bizEnvName;
	}

	public String getBizMth() {
		return this.bizMth;
	}
	public void setBizMth(String bizMth) {
		this.bizMth = bizMth;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getFeeItemCode() {
		return this.feeItemCode;
	}
	public void setFeeItemCode(String feeItemCode) {
		this.feeItemCode = feeItemCode;
	}

	public String getFeeItemName() {
		return this.feeItemName;
	}
	public void setFeeItemName(String feeItemName) {
		this.feeItemName = feeItemName;
	}

	public String getNonpaymentAmount() {
		return this.nonpaymentAmount;
	}
	public void setNonpaymentAmount(String nonpaymentAmount) {
		this.nonpaymentAmount = nonpaymentAmount;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOriginBillAmount() {
		return this.originBillAmount;
	}
	public void setOriginBillAmount(String originBillAmount) {
		this.originBillAmount = originBillAmount;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getRealAmount() {
		return this.realAmount;
	}
	public void setRealAmount(String realAmount) {
		this.realAmount = realAmount;
	}

	public String getSpecInstanceId() {
		return this.specInstanceId;
	}
	public void setSpecInstanceId(String specInstanceId) {
		this.specInstanceId = specInstanceId;
	}

	public String getWalletSource() {
		return this.walletSource;
	}
	public void setWalletSource(String walletSource) {
		this.walletSource = walletSource;
	}

	public String getWalletSourceId() {
		return this.walletSourceId;
	}
	public void setWalletSourceId(String walletSourceId) {
		this.walletSourceId = walletSourceId;
	}

}
