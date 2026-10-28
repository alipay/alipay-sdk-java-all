package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 抵扣来源明细
 *
 * @author auto create
 * @since 1.0, 2026-10-27 16:41:14
 */
public class DeductionInfoList extends AlipayObject {

	private static final long serialVersionUID = 6836744774675741566L;

	/**
	 * 是否为本次买单时新购的凭证。
	 */
	@ApiField("can_one_time_buy")
	private Boolean canOneTimeBuy;

	/**
	 * 来源代金券商品类型
	 */
	@ApiField("item_type")
	private String itemType;

	/**
	 * 商家优惠金额。货币单位固定为"CNY"。
	 */
	@ApiField("merchant_discount_amount")
	private String merchantDiscountAmount;

	/**
	 * 商家减收优惠金额。货币单位固定为"CNY"。
	 */
	@ApiField("merchant_no_fund_amount")
	private String merchantNoFundAmount;

	/**
	 * 第三方优惠金额。货币单位固定为"CNY"。
	 */
	@ApiField("other_discount_amount")
	private String otherDiscountAmount;

	/**
	 * 支付宝优惠金额。货币单位固定为"CNY"。
	 */
	@ApiField("platform_discount_amount")
	private String platformDiscountAmount;

	/**
	 * 商家实收金额。货币单位固定为"CNY"。
	 */
	@ApiField("receipt_amount")
	private String receiptAmount;

	/**
	 * 本次抵扣金额。货币单位固定为"CNY"。
	 */
	@ApiField("source_amount")
	private String sourceAmount;

	/**
	 * 本次使用的来源凭证码
	 */
	@ApiField("source_certificate_code")
	private String sourceCertificateCode;

	/**
	 * 本次使用的来源凭证ID
	 */
	@ApiField("source_certificate_id")
	private String sourceCertificateId;

	/**
	 * 来源订单ID
	 */
	@ApiField("source_order_id")
	private String sourceOrderId;

	/**
	 * 来源代金券售价。货币单位固定为"CNY"。
	 */
	@ApiField("source_selling_price")
	private String sourceSellingPrice;

	/**
	 * 来源代金券商品SKU ID
	 */
	@ApiField("source_sku_id")
	private String sourceSkuId;

	/**
	 * 来源代金券商品名称
	 */
	@ApiField("source_sku_name")
	private String sourceSkuName;

	/**
	 * 用户购买来源代金券的实付金额。货币单位固定为"CNY"。
	 */
	@ApiField("source_user_pay_amount")
	private String sourceUserPayAmount;

	/**
	 * 操作单号
	 */
	@ApiField("use_order_no")
	private String useOrderNo;

	public Boolean getCanOneTimeBuy() {
		return this.canOneTimeBuy;
	}
	public void setCanOneTimeBuy(Boolean canOneTimeBuy) {
		this.canOneTimeBuy = canOneTimeBuy;
	}

	public String getItemType() {
		return this.itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getMerchantDiscountAmount() {
		return this.merchantDiscountAmount;
	}
	public void setMerchantDiscountAmount(String merchantDiscountAmount) {
		this.merchantDiscountAmount = merchantDiscountAmount;
	}

	public String getMerchantNoFundAmount() {
		return this.merchantNoFundAmount;
	}
	public void setMerchantNoFundAmount(String merchantNoFundAmount) {
		this.merchantNoFundAmount = merchantNoFundAmount;
	}

	public String getOtherDiscountAmount() {
		return this.otherDiscountAmount;
	}
	public void setOtherDiscountAmount(String otherDiscountAmount) {
		this.otherDiscountAmount = otherDiscountAmount;
	}

	public String getPlatformDiscountAmount() {
		return this.platformDiscountAmount;
	}
	public void setPlatformDiscountAmount(String platformDiscountAmount) {
		this.platformDiscountAmount = platformDiscountAmount;
	}

	public String getReceiptAmount() {
		return this.receiptAmount;
	}
	public void setReceiptAmount(String receiptAmount) {
		this.receiptAmount = receiptAmount;
	}

	public String getSourceAmount() {
		return this.sourceAmount;
	}
	public void setSourceAmount(String sourceAmount) {
		this.sourceAmount = sourceAmount;
	}

	public String getSourceCertificateCode() {
		return this.sourceCertificateCode;
	}
	public void setSourceCertificateCode(String sourceCertificateCode) {
		this.sourceCertificateCode = sourceCertificateCode;
	}

	public String getSourceCertificateId() {
		return this.sourceCertificateId;
	}
	public void setSourceCertificateId(String sourceCertificateId) {
		this.sourceCertificateId = sourceCertificateId;
	}

	public String getSourceOrderId() {
		return this.sourceOrderId;
	}
	public void setSourceOrderId(String sourceOrderId) {
		this.sourceOrderId = sourceOrderId;
	}

	public String getSourceSellingPrice() {
		return this.sourceSellingPrice;
	}
	public void setSourceSellingPrice(String sourceSellingPrice) {
		this.sourceSellingPrice = sourceSellingPrice;
	}

	public String getSourceSkuId() {
		return this.sourceSkuId;
	}
	public void setSourceSkuId(String sourceSkuId) {
		this.sourceSkuId = sourceSkuId;
	}

	public String getSourceSkuName() {
		return this.sourceSkuName;
	}
	public void setSourceSkuName(String sourceSkuName) {
		this.sourceSkuName = sourceSkuName;
	}

	public String getSourceUserPayAmount() {
		return this.sourceUserPayAmount;
	}
	public void setSourceUserPayAmount(String sourceUserPayAmount) {
		this.sourceUserPayAmount = sourceUserPayAmount;
	}

	public String getUseOrderNo() {
		return this.useOrderNo;
	}
	public void setUseOrderNo(String useOrderNo) {
		this.useOrderNo = useOrderNo;
	}

}
