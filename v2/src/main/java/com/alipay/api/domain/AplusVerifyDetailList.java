package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 核销明细列表
 *
 * @author auto create
 * @since 1.0, 2026-06-02 19:42:50
 */
public class AplusVerifyDetailList extends AlipayObject {

	private static final long serialVersionUID = 1815436365443825818L;

	/**
	 * 业务发生时间
	 */
	@ApiField("biz_time")
	private String bizTime;

	/**
	 * 券码code
	 */
	@ApiField("certificate_code")
	private String certificateCode;

	/**
	 * 凭证id
	 */
	@ApiField("certificate_id")
	private String certificateId;

	/**
	 * 单凭证原价，单位：元
	 */
	@ApiField("certificate_original_price")
	private String certificateOriginalPrice;

	/**
	 * 单凭证售价，单位：元
	 */
	@ApiField("certificate_real_price")
	private String certificateRealPrice;

	/**
	 * 数据类型
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 创建日期
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品名称
	 */
	@ApiField("item_title")
	private String itemTitle;

	/**
	 * 商家优惠金额，单位：元
	 */
	@ApiField("merchant_fund_amount")
	private String merchantFundAmount;

	/**
	 * 商家减收优惠金额，单位：元
	 */
	@ApiField("merchant_no_fund_amount")
	private String merchantNoFundAmount;

	/**
	 * 商家实收金额，单位：元
	 */
	@ApiField("merchant_real_receipt_amount")
	private String merchantRealReceiptAmount;

	/**
	 * 订单总金额，单位：元
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 平台订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 三方优惠金额，单位：元
	 */
	@ApiField("other_fund_amount")
	private String otherFundAmount;

	/**
	 * 外部业务单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 商家订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 商户id
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 商户id
	 */
	@ApiField("partner_open_id")
	private String partnerOpenId;

	/**
	 * 平台优惠金额，单位：元
	 */
	@ApiField("platform_fund_amount")
	private String platformFundAmount;

	/**
	 * 支付交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 支付宝用户的userId
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 支付宝用户的userId
	 */
	@ApiField("user_open_id")
	private String userOpenId;

	/**
	 * 平台核销单号
	 */
	@ApiField("verify_order_no")
	private String verifyOrderNo;

	/**
	 * 核销门店id
	 */
	@ApiField("verify_shop_id")
	private String verifyShopId;

	public String getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(String bizTime) {
		this.bizTime = bizTime;
	}

	public String getCertificateCode() {
		return this.certificateCode;
	}
	public void setCertificateCode(String certificateCode) {
		this.certificateCode = certificateCode;
	}

	public String getCertificateId() {
		return this.certificateId;
	}
	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}

	public String getCertificateOriginalPrice() {
		return this.certificateOriginalPrice;
	}
	public void setCertificateOriginalPrice(String certificateOriginalPrice) {
		this.certificateOriginalPrice = certificateOriginalPrice;
	}

	public String getCertificateRealPrice() {
		return this.certificateRealPrice;
	}
	public void setCertificateRealPrice(String certificateRealPrice) {
		this.certificateRealPrice = certificateRealPrice;
	}

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemTitle() {
		return this.itemTitle;
	}
	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}

	public String getMerchantFundAmount() {
		return this.merchantFundAmount;
	}
	public void setMerchantFundAmount(String merchantFundAmount) {
		this.merchantFundAmount = merchantFundAmount;
	}

	public String getMerchantNoFundAmount() {
		return this.merchantNoFundAmount;
	}
	public void setMerchantNoFundAmount(String merchantNoFundAmount) {
		this.merchantNoFundAmount = merchantNoFundAmount;
	}

	public String getMerchantRealReceiptAmount() {
		return this.merchantRealReceiptAmount;
	}
	public void setMerchantRealReceiptAmount(String merchantRealReceiptAmount) {
		this.merchantRealReceiptAmount = merchantRealReceiptAmount;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOtherFundAmount() {
		return this.otherFundAmount;
	}
	public void setOtherFundAmount(String otherFundAmount) {
		this.otherFundAmount = otherFundAmount;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPartnerOpenId() {
		return this.partnerOpenId;
	}
	public void setPartnerOpenId(String partnerOpenId) {
		this.partnerOpenId = partnerOpenId;
	}

	public String getPlatformFundAmount() {
		return this.platformFundAmount;
	}
	public void setPlatformFundAmount(String platformFundAmount) {
		this.platformFundAmount = platformFundAmount;
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

	public String getUserOpenId() {
		return this.userOpenId;
	}
	public void setUserOpenId(String userOpenId) {
		this.userOpenId = userOpenId;
	}

	public String getVerifyOrderNo() {
		return this.verifyOrderNo;
	}
	public void setVerifyOrderNo(String verifyOrderNo) {
		this.verifyOrderNo = verifyOrderNo;
	}

	public String getVerifyShopId() {
		return this.verifyShopId;
	}
	public void setVerifyShopId(String verifyShopId) {
		this.verifyShopId = verifyShopId;
	}

}
