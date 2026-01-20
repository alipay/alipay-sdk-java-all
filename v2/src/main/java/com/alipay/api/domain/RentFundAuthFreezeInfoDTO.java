package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预授权信息。不传表示当前订单不使用预授权及芝麻免押
 *
 * @author auto create
 * @since 1.0, 2025-11-28 14:16:46
 */
public class RentFundAuthFreezeInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 8496266279658152775L;

	/**
	 * 商家外部传入的预授权单号
	 */
	@ApiField("auth_no")
	private String authNo;

	/**
	 * 预授权成功消息通知地址，商户可通过指定该地址监听支付宝侧预授权消息
	 */
	@ApiField("freeze_notify_url")
	private String freezeNotifyUrl;

	/**
	 * 预授权场景；
默认空：将进行预授权签约，不会取商家传入authNo
商家预授权：不会进行预授权签约，直接取商家传入authNo；
	 */
	@ApiField("fund_auth_scene")
	private String fundAuthScene;

	/**
	 * 收款账户的支付宝用户号。 以2088开头的16位纯数字，如果传入则会校验该账号是否具备当前商户收款权限
	 */
	@ApiField("payee_user_id")
	private String payeeUserId;

	/**
	 * 免押风控评估金额，即租押分离能力的押金评估金额。单位：元，精确到小数点后两位
	 */
	@ApiField("risk_assessment_price")
	private String riskAssessmentPrice;

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

	public String getFundAuthScene() {
		return this.fundAuthScene;
	}
	public void setFundAuthScene(String fundAuthScene) {
		this.fundAuthScene = fundAuthScene;
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

}
