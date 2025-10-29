package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预授权信息
 *
 * @author auto create
 * @since 1.0, 2025-07-16 13:39:50
 */
public class RentFundAuthFreezeInfoVO extends AlipayObject {

	private static final long serialVersionUID = 4651657855266433393L;

	/**
	 * 预授权冻结单号
	 */
	@ApiField("auth_no")
	private String authNo;

	/**
	 * 预授权成功消息通知地址，商户可通过指定该地址监听支付宝侧预授权消息
	 */
	@ApiField("freeze_notify_url")
	private String freezeNotifyUrl;

	/**
	 * 收款账户的支付宝用户号。 以2088开头的16位纯数字
	 */
	@ApiField("payee_user_id")
	private String payeeUserId;

	/**
	 * 免押风控评估金额，即租押分离能力的押金评估金额。单位：元，精确到小数点后两位
	 */
	@ApiField("risk_assessment_price")
	private String riskAssessmentPrice;

	/**
	 * 签约状态
	 */
	@ApiField("sign_status")
	private String signStatus;

	/**
	 * 签约时间
	 */
	@ApiField("sign_time")
	private Date signTime;

	public String getAuthNo() {
		return this.authNo;
	}
	public void setAuthNo(String authNo) {
		this.authNo = authNo;
	}

	public String getFreezeNotifyUrl() {
		return this.freezeNotifyUrl;
	}
	public void setFreezeNotifyUrl(String freezeNotifyUrl) {
		this.freezeNotifyUrl = freezeNotifyUrl;
	}

	public String getPayeeUserId() {
		return this.payeeUserId;
	}
	public void setPayeeUserId(String payeeUserId) {
		this.payeeUserId = payeeUserId;
	}

	public String getRiskAssessmentPrice() {
		return this.riskAssessmentPrice;
	}
	public void setRiskAssessmentPrice(String riskAssessmentPrice) {
		this.riskAssessmentPrice = riskAssessmentPrice;
	}

	public String getSignStatus() {
		return this.signStatus;
	}
	public void setSignStatus(String signStatus) {
		this.signStatus = signStatus;
	}

	public Date getSignTime() {
		return this.signTime;
	}
	public void setSignTime(Date signTime) {
		this.signTime = signTime;
	}

}
