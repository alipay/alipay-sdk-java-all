package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户红包
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class Coupon extends AlipayObject {

	private static final long serialVersionUID = 7754169757897996324L;

	/**
	 * 当前可用面额
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/**
	 * 红包编号
	 */
	@ApiField("coupon_no")
	private String couponNo;

	/**
	 * 可优惠面额
	 */
	@ApiField("deduct_amount")
	private String deductAmount;

	/**
	 * 有效期开始时间
	 */
	@ApiField("gmt_active")
	private String gmtActive;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 有效期结束时间
	 */
	@ApiField("gmt_expired")
	private String gmtExpired;

	/**
	 * 红包使用说明
	 */
	@ApiField("instructions")
	private String instructions;

	/**
	 * 红包详情说明
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 商户id
	 */
	@ApiField("merchant_uniq_id")
	private String merchantUniqId;

	/**
	 * 是否可叠加
	 */
	@ApiField("multi_use_flag")
	private String multiUseFlag;

	/**
	 * 红包名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 是否可退款标识
	 */
	@ApiField("refund_flag")
	private String refundFlag;

	/**
	 * 红包状态信息
	 */
	@ApiField("status")
	private String status;

	/**
	 * 红包模板编号
	 */
	@ApiField("template_no")
	private String templateNo;

	/**
	 * 用户openid
	 */
	@ApiField("user_id")
	private String userId;

	public String getAvailableAmount() {
		return this.availableAmount;
	}
	public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}

	public String getCouponNo() {
		return this.couponNo;
	}
	public void setCouponNo(String couponNo) {
		this.couponNo = couponNo;
	}

	public String getDeductAmount() {
		return this.deductAmount;
	}
	public void setDeductAmount(String deductAmount) {
		this.deductAmount = deductAmount;
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

	public String getInstructions() {
		return this.instructions;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMerchantUniqId() {
		return this.merchantUniqId;
	}
	public void setMerchantUniqId(String merchantUniqId) {
		this.merchantUniqId = merchantUniqId;
	}

	public String getMultiUseFlag() {
		return this.multiUseFlag;
	}
	public void setMultiUseFlag(String multiUseFlag) {
		this.multiUseFlag = multiUseFlag;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getRefundFlag() {
		return this.refundFlag;
	}
	public void setRefundFlag(String refundFlag) {
		this.refundFlag = refundFlag;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTemplateNo() {
		return this.templateNo;
	}
	public void setTemplateNo(String templateNo) {
		this.templateNo = templateNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
