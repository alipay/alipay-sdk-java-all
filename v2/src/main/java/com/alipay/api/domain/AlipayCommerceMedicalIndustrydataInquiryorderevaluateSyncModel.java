package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 问诊订单评价回流接口
 *
 * @author auto create
 * @since 1.0, 2024-11-14 15:17:08
 */
public class AlipayCommerceMedicalIndustrydataInquiryorderevaluateSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8596134649926119271L;

	/**
	 * 支付宝用户openId
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 支付宝问诊订单号
	 */
	@ApiField("alipay_order_id")
	private String alipayOrderId;

	/**
	 * 支付宝userId
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 评价内容
	 */
	@ApiField("evaluate_content")
	private String evaluateContent;

	/**
	 * 评价标签
	 */
	@ApiField("evaluate_label")
	private String evaluateLabel;

	/**
	 * 评价分数 例如99、89
	 */
	@ApiField("evaluate_score")
	private String evaluateScore;

	/**
	 * 评价时间
	 */
	@ApiField("evaluate_time")
	private Date evaluateTime;

	/**
	 * 外部平台用户id
	 */
	@ApiField("merchant_user_id")
	private String merchantUserId;

	/**
	 * 评价是否可透出
	 */
	@ApiField("open_status")
	private Boolean openStatus;

	/**
	 * 外部问诊订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 外部平台编号
	 */
	@ApiField("platform_code")
	private String platformCode;

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getAlipayOrderId() {
		return this.alipayOrderId;
	}
	public void setAlipayOrderId(String alipayOrderId) {
		this.alipayOrderId = alipayOrderId;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getEvaluateContent() {
		return this.evaluateContent;
	}
	public void setEvaluateContent(String evaluateContent) {
		this.evaluateContent = evaluateContent;
	}

	public String getEvaluateLabel() {
		return this.evaluateLabel;
	}
	public void setEvaluateLabel(String evaluateLabel) {
		this.evaluateLabel = evaluateLabel;
	}

	public String getEvaluateScore() {
		return this.evaluateScore;
	}
	public void setEvaluateScore(String evaluateScore) {
		this.evaluateScore = evaluateScore;
	}

	public Date getEvaluateTime() {
		return this.evaluateTime;
	}
	public void setEvaluateTime(Date evaluateTime) {
		this.evaluateTime = evaluateTime;
	}

	public String getMerchantUserId() {
		return this.merchantUserId;
	}
	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}

	public Boolean getOpenStatus() {
		return this.openStatus;
	}
	public void setOpenStatus(Boolean openStatus) {
		this.openStatus = openStatus;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

}
