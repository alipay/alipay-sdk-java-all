package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 核销明细列表
 *
 * @author auto create
 * @since 1.0, 2026-04-11 01:22:45
 */
public class GroupBuyVerifyDetailList extends AlipayObject {

	private static final long serialVersionUID = 8143868683768316768L;

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
	private Long certificateOriginalPrice;

	/**
	 * 单凭证售价，单位：元
	 */
	@ApiField("certificate_real_price")
	private Long certificateRealPrice;

	/**
	 * 数据类型
	 */
	@ApiField("data_type")
	private String dataType;

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
	private Long merchantFundAmount;

	/**
	 * 商家实收金额，单位：元
	 */
	@ApiField("merchant_real_receipt_amount")
	private Long merchantRealReceiptAmount;

	/**
	 * 订单总金额，单位：分
	 */
	@ApiField("order_amount")
	private Long orderAmount;

	/**
	 * 平台订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 三方优惠金额，单位：元
	 */
	@ApiField("other_fund_amount")
	private Long otherFundAmount;

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
	 * 商户开放ID
	 */
	@ApiField("partner_open_id")
	private String partnerOpenId;

	/**
	 * 平台优惠金额，单位：元
	 */
	@ApiField("platform_fund_amount")
	private Long platformFundAmount;

	/**
	 * 支付交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 支付宝用户的userId。
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

	public Long getCertificateOriginalPrice() {
		return this.certificateOriginalPrice;
	}
	public void setCertificateOriginalPrice(Long certificateOriginalPrice) {
		this.certificateOriginalPrice = certificateOriginalPrice;
	}

	public Long getCertificateRealPrice() {
		return this.certificateRealPrice;
	}
	public void setCertificateRealPrice(Long certificateRealPrice) {
		this.certificateRealPrice = certificateRealPrice;
	}

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
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

	public Long getMerchantFundAmount() {
		return this.merchantFundAmount;
	}
	public void setMerchantFundAmount(Long merchantFundAmount) {
		this.merchantFundAmount = merchantFundAmount;
	}

	public Long getMerchantRealReceiptAmount() {
		return this.merchantRealReceiptAmount;
	}
	public void setMerchantRealReceiptAmount(Long merchantRealReceiptAmount) {
		this.merchantRealReceiptAmount = merchantRealReceiptAmount;
	}

	public Long getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(Long orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Long getOtherFundAmount() {
		return this.otherFundAmount;
	}
	public void setOtherFundAmount(Long otherFundAmount) {
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

	public Long getPlatformFundAmount() {
		return this.platformFundAmount;
	}
	public void setPlatformFundAmount(Long platformFundAmount) {
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
