package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 货运企业支付账户授权申请
 *
 * @author auto create
 * @since 1.0, 2025-05-28 16:56:27
 */
public class AlipayCommerceLogisticsFreightflowAccountauthApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6586224699813235776L;

	/**
	 * 格式标准：需要在尾部添加时间戳，格式为yyyyMMdd。 ●外部需要保证重复请求不更换时间戳，否则会导致幂等击穿
	 */
	@ApiField("apply_request_no")
	private String applyRequestNo;

	/**
	 * 被授权方。本期：母公司
	 */
	@ApiField("authorizee_info")
	private FreigtFlowAuthAccount authorizeeInfo;

	/**
	 * 授权方。本期：子公司
	 */
	@ApiField("authorizer_info")
	private FreigtFlowAuthAccount authorizerInfo;

	/**
	 * 格式：yyyyMMddHHmmss
	 */
	@ApiField("expiration_time")
	private String expirationTime;

	/**
	 * 由支付宝分配
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 银行管理模式
	 */
	@ApiField("mode")
	private String mode;

	/**
	 * 如果mode为网商银行，则为网商银行分配
	 */
	@ApiField("partner_id")
	private String partnerId;

	public String getApplyRequestNo() {
		return this.applyRequestNo;
	}
	public void setApplyRequestNo(String applyRequestNo) {
		this.applyRequestNo = applyRequestNo;
	}

	public FreigtFlowAuthAccount getAuthorizeeInfo() {
		return this.authorizeeInfo;
	}
	public void setAuthorizeeInfo(FreigtFlowAuthAccount authorizeeInfo) {
		this.authorizeeInfo = authorizeeInfo;
	}

	public FreigtFlowAuthAccount getAuthorizerInfo() {
		return this.authorizerInfo;
	}
	public void setAuthorizerInfo(FreigtFlowAuthAccount authorizerInfo) {
		this.authorizerInfo = authorizerInfo;
	}

	public String getExpirationTime() {
		return this.expirationTime;
	}
	public void setExpirationTime(String expirationTime) {
		this.expirationTime = expirationTime;
	}

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getMode() {
		return this.mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

}
