package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账号绑定检查
 *
 * @author auto create
 * @since 1.0, 2025-09-01 17:06:24
 */
public class AlipayPcreditLoanHonorUserbindCheckModel extends AlipayObject {

	private static final long serialVersionUID = 8295229273883674137L;

	/**
	 * 渠道用户id
	 */
	@ApiField("channel_customer_id")
	private String channelCustomerId;

	/**
	 * 证件号
	 */
	@ApiField("ctf_code")
	private String ctfCode;

	/**
	 * 手机号
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	/**
	 * 外部traceId
	 */
	@ApiField("out_trace_id")
	private String outTraceId;

	/**
	 * 姓名
	 */
	@ApiField("real_name")
	private String realName;

	/**
	 * 请求源
	 */
	@ApiField("request_source")
	private String requestSource;

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

	public String getMobileNo() {
		return this.mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getOutTraceId() {
		return this.outTraceId;
	}
	public void setOutTraceId(String outTraceId) {
		this.outTraceId = outTraceId;
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

}
