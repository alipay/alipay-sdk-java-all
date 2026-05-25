package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.afusignin.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-03 13:57:44
 */
public class AlipayCommerceMedicalAfusigninQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7158573139657392533L;

	/** 
	 * 智能体头像链接
	 */
	@ApiField("agent_avatar")
	private String agentAvatar;

	/** 
	 * 医生id
	 */
	@ApiField("doctor_id")
	private String doctorId;

	/** 
	 * 阿福报道开通状态
	 */
	@ApiField("status")
	private Long status;

	/** 
	 * 阿福报道短链
	 */
	@ApiField("url")
	private String url;

	public void setAgentAvatar(String agentAvatar) {
		this.agentAvatar = agentAvatar;
	}
	public String getAgentAvatar( ) {
		return this.agentAvatar;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorId( ) {
		return this.doctorId;
	}

	public void setStatus(Long status) {
		this.status = status;
	}
	public Long getStatus( ) {
		return this.status;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}
