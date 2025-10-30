package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 荣耀借款交易鉴权
 *
 * @author auto create
 * @since 1.0, 2025-09-12 17:09:30
 */
public class AlipayPcreditLoanHonorLendadmitConsultModel extends AlipayObject {

	private static final long serialVersionUID = 5492878594438725172L;

	/**
	 * 支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 联合建模模型分（JSON格式）
	 */
	@ApiField("api_model_score_map")
	private String apiModelScoreMap;

	/**
	 * 用户标签（JSON格式）
	 */
	@ApiField("api_user_tag_map")
	private String apiUserTagMap;

	/**
	 * 渠道侧借款申请订单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 支付宝绑卡Id
	 */
	@ApiField("bank_card_id")
	private String bankCardId;

	/**
	 * 渠道侧用户id
	 */
	@ApiField("channel_customer_id")
	private String channelCustomerId;

	/**
	 * 借款优惠券id
	 */
	@ApiField("coupon_no")
	private String couponNo;

	/**
	 * 借款金额，单位：分
	 */
	@ApiField("loan_amount")
	private String loanAmount;

	/**
	 * 借款用途，枚举值：
RCXF-个人日常消费
ZX-房屋装修
LY-旅游出行
JX-在职深造
JKYL-健康医疗
Others-其他消费
	 */
	@ApiField("loan_use")
	private String loanUse;

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
	 * 渠道产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 还款方式，枚举值：
1-等额本息(灵活还)，
2-等额本金(灵活还)，
3-先息后本(灵活还)，
4-等额本息(按期还)
	 */
	@ApiField("repay_method")
	private Long repayMethod;

	/**
	 * 请求来源 CUSTOMER-C端对应用户发起、SCHEDULER-调度发起、BACKDOOR-小二对应后台用户调用
	 */
	@ApiField("request_source")
	private String requestSource;

	/**
	 * 安全必要参数（JSON格式）
	 */
	@ApiField("risk_info")
	private String riskInfo;

	/**
	 * 协议曝光情况(0-未曝光，1-已曝光[默认])
	 */
	@ApiField("sign_flag")
	private Long signFlag;

	/**
	 * 借款期数
	 */
	@ApiField("total_term")
	private Long totalTerm;

	/**
	 * 借款试算咨询id
	 */
	@ApiField("trial_serial_no")
	private String trialSerialNo;

	/**
	 * 核身结束跳转的渠道侧URL
	 */
	@ApiField("verify_callback_url")
	private String verifyCallbackUrl;

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

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public String getBankCardId() {
		return this.bankCardId;
	}
	public void setBankCardId(String bankCardId) {
		this.bankCardId = bankCardId;
	}

	public String getChannelCustomerId() {
		return this.channelCustomerId;
	}
	public void setChannelCustomerId(String channelCustomerId) {
		this.channelCustomerId = channelCustomerId;
	}

	public String getCouponNo() {
		return this.couponNo;
	}
	public void setCouponNo(String couponNo) {
		this.couponNo = couponNo;
	}

	public String getLoanAmount() {
		return this.loanAmount;
	}
	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getLoanUse() {
		return this.loanUse;
	}
	public void setLoanUse(String loanUse) {
		this.loanUse = loanUse;
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

	public Long getRepayMethod() {
		return this.repayMethod;
	}
	public void setRepayMethod(Long repayMethod) {
		this.repayMethod = repayMethod;
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

	public Long getSignFlag() {
		return this.signFlag;
	}
	public void setSignFlag(Long signFlag) {
		this.signFlag = signFlag;
	}

	public Long getTotalTerm() {
		return this.totalTerm;
	}
	public void setTotalTerm(Long totalTerm) {
		this.totalTerm = totalTerm;
	}

	public String getTrialSerialNo() {
		return this.trialSerialNo;
	}
	public void setTrialSerialNo(String trialSerialNo) {
		this.trialSerialNo = trialSerialNo;
	}

	public String getVerifyCallbackUrl() {
		return this.verifyCallbackUrl;
	}
	public void setVerifyCallbackUrl(String verifyCallbackUrl) {
		this.verifyCallbackUrl = verifyCallbackUrl;
	}

}
