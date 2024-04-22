package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业服务标准化订单数据回流
 *
 * @author auto create
 * @since 1.0, 2022-11-02 14:35:49
 */
public class AlipayCommerceIndustryOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3449913388382922789L;

	/**
	 * 支付宝userid（用户在支付宝平台的2088开头16位id）
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 优惠金额
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 行业信息

数据格式详情联系解决方案同学
	 */
	@ApiField("industry_info")
	private String industryInfo;

	/**
	 * 商户订单号
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 支付宝用户的openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单总金额
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 订单创建时间
	 */
	@ApiField("order_create_time")
	private Date orderCreateTime;

	/**
	 * 订单详情链接 链接是商户自己的小程序的
	 */
	@ApiField("order_detail_url")
	private String orderDetailUrl;

	/**
	 * 订单扩展字段，示例展示场景：key：scene_type，value：NOTICE_TOUCH；key：cup_type，value:BRING_CUP
	 */
	@ApiField("order_extra_info")
	private ExtraInfo orderExtraInfo;

	/**
	 * 订单修改时间(订单更新时需有变动)
	 */
	@ApiField("order_modify_time")
	private Date orderModifyTime;

	/**
	 * 订单类型，枚举支持 ALIPAY_APPLETS：支付宝小程序产生的订单 ALIPAY_POS：收银POS产生的支付宝订单
 ALIPAY_INDUSTRY：支付宝行业小程序
	 */
	@ApiField("order_source")
	private String orderSource;

	/**
	 * 交易支付金额
	 */
	@ApiField("payment_amount")
	private String paymentAmount;

	/**
	 * 商户订单同步记录id
	 */
	@ApiField("record_id")
	private String recordId;

	/**
	 * 服务标识
	 */
	@ApiField("service_code")
	private String serviceCode;

	/**
	 * 服务类型  
具体值联系解决方案同学
	 */
	@ApiField("service_type")
	private String serviceType;

	/**
	 * 订单状态枚举

数据格式详情联系解决方案同学
	 */
	@ApiField("status")
	private String status;

	/**
	 * 子服务类型
	 */
	@ApiField("sub_service_type")
	private String subServiceType;

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getIndustryInfo() {
		return this.industryInfo;
	}
	public void setIndustryInfo(String industryInfo) {
		this.industryInfo = industryInfo;
	}

	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Date getOrderCreateTime() {
		return this.orderCreateTime;
	}
	public void setOrderCreateTime(Date orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public String getOrderDetailUrl() {
		return this.orderDetailUrl;
	}
	public void setOrderDetailUrl(String orderDetailUrl) {
		this.orderDetailUrl = orderDetailUrl;
	}

	public ExtraInfo getOrderExtraInfo() {
		return this.orderExtraInfo;
	}
	public void setOrderExtraInfo(ExtraInfo orderExtraInfo) {
		this.orderExtraInfo = orderExtraInfo;
	}

	public Date getOrderModifyTime() {
		return this.orderModifyTime;
	}
	public void setOrderModifyTime(Date orderModifyTime) {
		this.orderModifyTime = orderModifyTime;
	}

	public String getOrderSource() {
		return this.orderSource;
	}
	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}

	public String getPaymentAmount() {
		return this.paymentAmount;
	}
	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getRecordId() {
		return this.recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubServiceType() {
		return this.subServiceType;
	}
	public void setSubServiceType(String subServiceType) {
		this.subServiceType = subServiceType;
	}

}
