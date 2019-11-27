package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 红包模型，包含红包的NID，金额，有效时间等信息。
 *
 * @author auto create
 * @since 1.0, 2014-09-21 18:26:05
 */
public class CouponInfoDto extends AlipayObject {

	private static final long serialVersionUID = 3268724819647349681L;

	/**
	 * 活动地址
	 */
	@ApiField("active_url")
	private String activeUrl;

	/**
	 * 红包面额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 红包名称
	 */
	@ApiField("coupon_name")
	private String couponName;

	/**
	 * 红包NID
	 */
	@ApiField("coupon_nid")
	private String couponNid;

	/**
	 * 当前现金价值
	 */
	@ApiField("current_amount")
	private String currentAmount;

	/**
	 * 激活时间
	 */
	@ApiField("gmt_active")
	private String gmtActive;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * gmtExpired
	 */
	@ApiField("gmt_expired")
	private String gmtExpired;

	/**
	 * 展期时间
	 */
	@ApiField("gmt_extend")
	private String gmtExtend;

	/**
	 * 发行者名称
	 */
	@ApiField("publisher_name")
	private String publisherName;

	/**
	 * 红包当前状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 模板NID
	 */
	@ApiField("template_nid")
	private String templateNid;

	/**
	 * 红包使用范围
	 */
	@ApiField("use_area")
	private String useArea;

	/**
	 * 用户uid
	 */
	@ApiField("user_id")
	private String userId;

	public String getActiveUrl() {
		return this.activeUrl;
	}
	public void setActiveUrl(String activeUrl) {
		this.activeUrl = activeUrl;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCouponName() {
		return this.couponName;
	}
	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public String getCouponNid() {
		return this.couponNid;
	}
	public void setCouponNid(String couponNid) {
		this.couponNid = couponNid;
	}

	public String getCurrentAmount() {
		return this.currentAmount;
	}
	public void setCurrentAmount(String currentAmount) {
		this.currentAmount = currentAmount;
	}

	public String getGmtActive() {
		return this.gmtActive;
	}
	public void setGmtActive(String gmtActive) {
		this.gmtActive = gmtActive;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getGmtExpired() {
		return this.gmtExpired;
	}
	public void setGmtExpired(String gmtExpired) {
		this.gmtExpired = gmtExpired;
	}

	public String getGmtExtend() {
		return this.gmtExtend;
	}
	public void setGmtExtend(String gmtExtend) {
		this.gmtExtend = gmtExtend;
	}

	public String getPublisherName() {
		return this.publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTemplateNid() {
		return this.templateNid;
	}
	public void setTemplateNid(String templateNid) {
		this.templateNid = templateNid;
	}

	public String getUseArea() {
		return this.useArea;
	}
	public void setUseArea(String useArea) {
		this.useArea = useArea;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
