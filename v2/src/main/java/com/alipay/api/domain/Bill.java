package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账单详情
 *
 * @author auto create
 * @since 1.0, 2023-10-11 09:46:01
 */
public class Bill extends AlipayObject {

	private static final long serialVersionUID = 2415434298153357289L;

	/**
	 * 出账日期
	 */
	@ApiField("bill_date")
	private String billDate;

	/**
	 * 账单状态
 - OFFSET(已结清)
 - CREATE(未结清)
 - PAYOUTING(出账中)
	 */
	@ApiField("bill_status")
	private String billStatus;

	/**
	 * 消费类型
 - PREPAY(预付费)
 - OFFLINE(后付费)
	 */
	@ApiField("bill_type")
	private String billType;

	/**
	 * 小程序id
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 币种
 - CNY
 - USD
 - EUR
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 优惠金额（分）
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 环境ID
	 */
	@ApiField("env_id")
	private String envId;

	/**
	 * 环境名称
	 */
	@ApiField("env_name")
	private String envName;

	/**
	 * 计费项名称
	 */
	@ApiField("fee_item_name")
	private String feeItemName;

	/**
	 * 计费项单位（万次，GB秒，GB天，GB）
	 */
	@ApiField("fee_item_unit")
	private String feeItemUnit;

	/**
	 * 单价（分）
	 */
	@ApiField("original_unit_amount")
	private String originalUnitAmount;

	/**
	 * 欠费金额(分)
	 */
	@ApiField("owed_amount")
	private String owedAmount;

	/**
	 * 已付金额(分)
	 */
	@ApiField("paid_amount")
	private String paidAmount;

	/**
	 * 产品名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 应付金额(分)
应付金额 = 已付金额 + 欠费金额
	 */
	@ApiField("trade_amount")
	private String tradeAmount;

	/**
	 * 总价(分)
每天金额明细向下取整后汇总
总价 = 优惠金额 + 应付金额
	 */
	@ApiField("trade_total_amount")
	private String tradeTotalAmount;

	/**
	 * 用量
	 */
	@ApiField("usage")
	private String usage;

	public String getBillDate() {
		return this.billDate;
	}
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	public String getBillStatus() {
		return this.billStatus;
	}
	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
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

	public String getEnvId() {
		return this.envId;
	}
	public void setEnvId(String envId) {
		this.envId = envId;
	}

	public String getEnvName() {
		return this.envName;
	}
	public void setEnvName(String envName) {
		this.envName = envName;
	}

	public String getFeeItemName() {
		return this.feeItemName;
	}
	public void setFeeItemName(String feeItemName) {
		this.feeItemName = feeItemName;
	}

	public String getFeeItemUnit() {
		return this.feeItemUnit;
	}
	public void setFeeItemUnit(String feeItemUnit) {
		this.feeItemUnit = feeItemUnit;
	}

	public String getOriginalUnitAmount() {
		return this.originalUnitAmount;
	}
	public void setOriginalUnitAmount(String originalUnitAmount) {
		this.originalUnitAmount = originalUnitAmount;
	}

	public String getOwedAmount() {
		return this.owedAmount;
	}
	public void setOwedAmount(String owedAmount) {
		this.owedAmount = owedAmount;
	}

	public String getPaidAmount() {
		return this.paidAmount;
	}
	public void setPaidAmount(String paidAmount) {
		this.paidAmount = paidAmount;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getTradeAmount() {
		return this.tradeAmount;
	}
	public void setTradeAmount(String tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	public String getTradeTotalAmount() {
		return this.tradeTotalAmount;
	}
	public void setTradeTotalAmount(String tradeTotalAmount) {
		this.tradeTotalAmount = tradeTotalAmount;
	}

	public String getUsage() {
		return this.usage;
	}
	public void setUsage(String usage) {
		this.usage = usage;
	}

}
