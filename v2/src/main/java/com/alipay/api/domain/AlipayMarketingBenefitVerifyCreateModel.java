package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益中心统一核身
 *
 * @author auto create
 * @since 1.0, 2025-09-26 19:45:54
 */
public class AlipayMarketingBenefitVerifyCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8757478261478916789L;

	/**
	 * 本次动作核身的业务单号，用于后续操作的业务幂等号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 走iframe通过前端postMessage方式获取结果-无需传递该参数，如果走回跳url方式得到核身结果则必传
	 */
	@ApiField("call_back_url")
	private String callBackUrl;

	/**
	 * 账户归属人对应的支付宝账号
	 */
	@ApiField("publisher_user_id")
	private String publisherUserId;

	/**
	 * 风控参数
	 */
	@ApiField("risk_info")
	private String riskInfo;

	/**
	 * 核身场景支付宝分配
	 */
	@ApiField("verify_scene")
	private String verifyScene;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getCallBackUrl() {
		return this.callBackUrl;
	}
	public void setCallBackUrl(String callBackUrl) {
		this.callBackUrl = callBackUrl;
	}

	public String getPublisherUserId() {
		return this.publisherUserId;
	}
	public void setPublisherUserId(String publisherUserId) {
		this.publisherUserId = publisherUserId;
	}

	public String getRiskInfo() {
		return this.riskInfo;
	}
	public void setRiskInfo(String riskInfo) {
		this.riskInfo = riskInfo;
	}

	public String getVerifyScene() {
		return this.verifyScene;
	}
	public void setVerifyScene(String verifyScene) {
		this.verifyScene = verifyScene;
	}

}
