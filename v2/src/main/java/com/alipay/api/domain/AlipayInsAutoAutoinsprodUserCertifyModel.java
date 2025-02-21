package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 代理人实名认证接口
 *
 * @author auto create
 * @since 1.0, 2022-12-28 12:01:34
 */
public class AlipayInsAutoAutoinsprodUserCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 5846755516269681867L;

	/**
	 * 代理人姓名
	 */
	@ApiField("agent_id_card_name")
	private String agentIdCardName;

	/**
	 * 代理人身份证号
	 */
	@ApiField("agent_id_card_no")
	private String agentIdCardNo;

	/**
	 * 代理人用户唯一标识openId
	 */
	@ApiField("agent_open_id")
	private String agentOpenId;

	/**
	 * 代理人用户唯一标识
	 */
	@ApiField("agent_user_id")
	private String agentUserId;

	/**
	 * 授权代理人姓名
	 */
	@ApiField("auth_cert_name")
	private String authCertName;

	/**
	 * 授权证件号码
	 */
	@ApiField("auth_cert_no")
	private String authCertNo;

	public String getAgentIdCardName() {
		return this.agentIdCardName;
	}
	public void setAgentIdCardName(String agentIdCardName) {
		this.agentIdCardName = agentIdCardName;
	}

	public String getAgentIdCardNo() {
		return this.agentIdCardNo;
	}
	public void setAgentIdCardNo(String agentIdCardNo) {
		this.agentIdCardNo = agentIdCardNo;
	}

	public String getAgentOpenId() {
		return this.agentOpenId;
	}
	public void setAgentOpenId(String agentOpenId) {
		this.agentOpenId = agentOpenId;
	}

	public String getAgentUserId() {
		return this.agentUserId;
	}
	public void setAgentUserId(String agentUserId) {
		this.agentUserId = agentUserId;
	}

	public String getAuthCertName() {
		return this.authCertName;
	}
	public void setAuthCertName(String authCertName) {
		this.authCertName = authCertName;
	}

	public String getAuthCertNo() {
		return this.authCertNo;
	}
	public void setAuthCertNo(String authCertNo) {
		this.authCertNo = authCertNo;
	}

}
