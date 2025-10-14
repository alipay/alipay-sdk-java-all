package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改缴费信息
 *
 * @author auto create
 * @since 1.0, 2025-10-13 16:27:40
 */
public class AlipayEbppIndustryCareertrainingPaymentModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7688467352536176292L;

	/**
	 * 编码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * bizType=COURSE，课程id
bizType=EXAM，评价id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * COURSE-课程、EXAM-评价
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 用户id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("order_time")
	private String orderTime;

	/**
	 * 支付金额，单位分
	 */
	@ApiField("payment_amount")
	private Long paymentAmount;

	/**
	 * yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("payment_time")
	private String paymentTime;

	/**
	 * 示例：CASH-现金、WECHAT_PAY-微信支付、ALIPAY-支付宝、BANKCARD-银行卡支付、CREDIT_CARD-信用卡支付、OTHER-其他
	 */
	@ApiField("payment_way")
	private String paymentWay;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderTime() {
		return this.orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public Long getPaymentAmount() {
		return this.paymentAmount;
	}
	public void setPaymentAmount(Long paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getPaymentTime() {
		return this.paymentTime;
	}
	public void setPaymentTime(String paymentTime) {
		this.paymentTime = paymentTime;
	}

	public String getPaymentWay() {
		return this.paymentWay;
	}
	public void setPaymentWay(String paymentWay) {
		this.paymentWay = paymentWay;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
