package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hzreferralform.messagedetail.get response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-27 11:02:39
 */
public class AlipayCommerceMedicalHzreferralformMessagedetailGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2664516875114388264L;

	/** 
	 * 安诊儿智能体跳转链接
	 */
	@ApiField("agent_url")
	private String agentUrl;

	/** 
	 * 用户身份证号
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * 用户姓名
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 用户手机号
	 */
	@ApiField("phone_no")
	private String phoneNo;

	public void setAgentUrl(String agentUrl) {
		this.agentUrl = agentUrl;
	}
	public String getAgentUrl( ) {
		return this.agentUrl;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertNo( ) {
		return this.certNo;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getPhoneNo( ) {
		return this.phoneNo;
	}

}
