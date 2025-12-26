package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账号绑定
 *
 * @author auto create
 * @since 1.0, 2025-09-12 15:06:41
 */
public class AlipayPcreditLoanHonorBindApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2179979672117233937L;

	/**
	 * 协议咨询id
	 */
	@ApiField("agreement_consult_serial_no")
	private String agreementConsultSerialNo;

	/**
	 * 支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 联合建模模型分 (Map< key, value>的 json字符串)
	 */
	@ApiField("api_model_score_map")
	private String apiModelScoreMap;

	/**
	 * 用户标签 (Map< key, value>的 json字符串)
	 */
	@ApiField("api_user_tag_map")
	private String apiUserTagMap;

	/**
	 * 渠道用户id
	 */
	@ApiField("channel_customer_id")
	private String channelCustomerId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部traceId
	 */
	@ApiField("out_trace_id")
	private String outTraceId;

	/**
	 * SL_PD_SALE_CODE-HONOR
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 请求源
	 */
	@ApiField("request_source")
	private String requestSource;

	/**
	 * 大安全风控信息
	 */
	@ApiField("risk_info")
	private String riskInfo;

	/**
	 * 核身回调url
	 */
	@ApiField("verify_callback_url")
	private String verifyCallbackUrl;

	public String getAgreementConsultSerialNo() {
		return this.agreementConsultSerialNo;
	}
	public void setAgreementConsultSerialNo(String agreementConsultSerialNo) {
		this.agreementConsultSerialNo = agreementConsultSerialNo;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getApiModelScoreMap() {
		return this.apiModelScoreMap;
	}
	public void setApiModelScoreMap(String apiModelScoreMap) {
		this.apiModelScoreMap = apiModelScoreMap;
	}

	public String getApiUserTagMap() {
		return this.apiUserTagMap;
	}
	public void setApiUserTagMap(String apiUserTagMap) {
		this.apiUserTagMap = apiUserTagMap;
	}

	public String getChannelCustomerId() {
		return this.channelCustomerId;
	}
	public void setChannelCustomerId(String channelCustomerId) {
		this.channelCustomerId = channelCustomerId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutTraceId() {
		return this.outTraceId;
	}
	public void setOutTraceId(String outTraceId) {
		this.outTraceId = outTraceId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRequestSource() {
		return this.requestSource;
	}
	public void setRequestSource(String requestSource) {
		this.requestSource = requestSource;
	}

	public String getRiskInfo() {
		return this.riskInfo;
	}
	public void setRiskInfo(String riskInfo) {
		this.riskInfo = riskInfo;
	}

	public String getVerifyCallbackUrl() {
		return this.verifyCallbackUrl;
	}
	public void setVerifyCallbackUrl(String verifyCallbackUrl) {
		this.verifyCallbackUrl = verifyCallbackUrl;
	}

}
