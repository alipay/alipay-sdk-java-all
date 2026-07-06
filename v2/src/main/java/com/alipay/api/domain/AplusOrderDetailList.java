package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单列表
 *
 * @author auto create
 * @since 1.0, 2026-06-02 19:42:50
 */
public class AplusOrderDetailList extends AlipayObject {

	private static final long serialVersionUID = 5299426634816145138L;

	/**
	 * 订单购买的总凭证数量
	 */
	@ApiField("certificate_count")
	private Long certificateCount;

	/**
	 * 凭证id
	 */
	@ApiField("certificate_id_list")
	private String certificateIdList;

	/**
	 * 每条数据依次为，凭证id、凭证状态、凭证原价、凭证售价
	 */
	@ApiField("certificate_status_mapping")
	private String certificateStatusMapping;

	/**
	 * 订单创建时间（时间戳秒）
	 */
	@ApiField("gmt_create")
	private Long gmtCreate;

	/**
	 * 订单状态最后更新时间
	 */
	@ApiField("gmt_modified")
	private Long gmtModified;

	/**
	 * 商品ID
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
	@ApiField("merchant_discount")
	private String merchantDiscount;

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
	 * 平台订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

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
	@ApiField("platform_discount")
	private String platformDiscount;

	/**
	 * 用户实付金额，单位：元
	 */
	@ApiField("real_pay_amount")
	private String realPayAmount;

	/**
	 * 三方优惠金额，单位：元
	 */
	@ApiField("third_discount")
	private String thirdDiscount;

	/**
	 * 订单总金额，单位：元
	 */
	@ApiField("total_amount")
	private String totalAmount;

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

	public Long getCertificateCount() {
		return this.certificateCount;
	}
	public void setCertificateCount(Long certificateCount) {
		this.certificateCount = certificateCount;
	}

	public String getCertificateIdList() {
		return this.certificateIdList;
	}
	public void setCertificateIdList(String certificateIdList) {
		this.certificateIdList = certificateIdList;
	}

	public String getCertificateStatusMapping() {
		return this.certificateStatusMapping;
	}
	public void setCertificateStatusMapping(String certificateStatusMapping) {
		this.certificateStatusMapping = certificateStatusMapping;
	}

	public Long getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Long gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Long getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Long gmtModified) {
		this.gmtModified = gmtModified;
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

	public String getMerchantDiscount() {
		return this.merchantDiscount;
	}
	public void setMerchantDiscount(String merchantDiscount) {
		this.merchantDiscount = merchantDiscount;
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

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
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

	public String getPlatformDiscount() {
		return this.platformDiscount;
	}
	public void setPlatformDiscount(String platformDiscount) {
		this.platformDiscount = platformDiscount;
	}

	public String getRealPayAmount() {
		return this.realPayAmount;
	}
	public void setRealPayAmount(String realPayAmount) {
		this.realPayAmount = realPayAmount;
	}

	public String getThirdDiscount() {
		return this.thirdDiscount;
	}
	public void setThirdDiscount(String thirdDiscount) {
		this.thirdDiscount = thirdDiscount;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
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

}
