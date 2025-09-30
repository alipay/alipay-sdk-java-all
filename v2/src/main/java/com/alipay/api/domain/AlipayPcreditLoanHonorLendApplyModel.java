package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 荣耀借款申请提交
 *
 * @author auto create
 * @since 1.0, 2025-09-12 17:10:24
 */
public class AlipayPcreditLoanHonorLendApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3488738176158146325L;

	/**
	 * 支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 渠道侧借款申请单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 渠道侧用户id
	 */
	@ApiField("channel_customer_id")
	private String channelCustomerId;

	/**
	 * 证件号码
	 */
	@ApiField("ctf_code")
	private String ctfCode;

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
	 * 姓名
	 */
	@ApiField("real_name")
	private String realName;

	/**
	 * 请求来源 CUSTOMER-C端对应用户发起、SCHEDULER-调度发起、BACKDOOR-小二对应后台用户调用
	 */
	@ApiField("request_source")
	private String requestSource;

	/**
	 * 借款试算咨询id
	 */
	@ApiField("trial_serial_no")
	private String trialSerialNo;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public String getChannelCustomerId() {
		return this.channelCustomerId;
	}
	public void setChannelCustomerId(String channelCustomerId) {
		this.channelCustomerId = channelCustomerId;
	}

	public String getCtfCode() {
		return this.ctfCode;
	}
	public void setCtfCode(String ctfCode) {
		this.ctfCode = ctfCode;
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

	public String getRealName() {
		return this.realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getRequestSource() {
		return this.requestSource;
	}
	public void setRequestSource(String requestSource) {
		this.requestSource = requestSource;
	}

	public String getTrialSerialNo() {
		return this.trialSerialNo;
	}
	public void setTrialSerialNo(String trialSerialNo) {
		this.trialSerialNo = trialSerialNo;
	}

}
