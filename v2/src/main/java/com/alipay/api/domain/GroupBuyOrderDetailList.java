package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单id
 *
 * @author auto create
 * @since 1.0, 2026-04-11 01:22:45
 */
public class GroupBuyOrderDetailList extends AlipayObject {

	private static final long serialVersionUID = 3581235919843772728L;

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
	 * 凭证id和凭证状态的映射关系
	 */
	@ApiField("certificate_status_mapping")
	private String certificateStatusMapping;

	/**
	 * 订单创建时间（时间戳秒）
	 */
	@ApiField("gmt_create")
	private Long gmtCreate;

	/**
	 * 订单状态最后更新时间（时间戳秒）
	 */
	@ApiField("gmt_modified")
	private Long gmtModified;

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
	@ApiField("merchant_discount")
	private Long merchantDiscount;

	/**
	 * 商家实收金额，单位：元
	 */
	@ApiField("merchant_real_receipt_amount")
	private Long merchantRealReceiptAmount;

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
	private Long platformDiscount;

	/**
	 * 用户实付金额，单位：元
	 */
	@ApiField("real_pay_amount")
	private Long realPayAmount;

	/**
	 * 三方优惠金额，单位：元
	 */
	@ApiField("third_discount")
	private Long thirdDiscount;

	/**
	 * 订单总金额，单位：元
	 */
	@ApiField("total_amount")
	private Long totalAmount;

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

	public Long getMerchantDiscount() {
		return this.merchantDiscount;
	}
	public void setMerchantDiscount(Long merchantDiscount) {
		this.merchantDiscount = merchantDiscount;
	}

	public Long getMerchantRealReceiptAmount() {
		return this.merchantRealReceiptAmount;
	}
	public void setMerchantRealReceiptAmount(Long merchantRealReceiptAmount) {
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

	public Long getPlatformDiscount() {
		return this.platformDiscount;
	}
	public void setPlatformDiscount(Long platformDiscount) {
		this.platformDiscount = platformDiscount;
	}

	public Long getRealPayAmount() {
		return this.realPayAmount;
	}
	public void setRealPayAmount(Long realPayAmount) {
		this.realPayAmount = realPayAmount;
	}

	public Long getThirdDiscount() {
		return this.thirdDiscount;
	}
	public void setThirdDiscount(Long thirdDiscount) {
		this.thirdDiscount = thirdDiscount;
	}

	public Long getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(Long totalAmount) {
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
