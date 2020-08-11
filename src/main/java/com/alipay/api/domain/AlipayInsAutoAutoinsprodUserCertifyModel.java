package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 代理人实名认证接口
 *
 * @author auto create
 * @since 1.0, 2019-12-05 14:45:22
 */
public class AlipayInsAutoAutoinsprodUserCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 7242893183736588544L;

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
	 * 代理人用户唯一标识
	 */
	@ApiField("agent_user_id")
	private String agentUserId;

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

	public String getAgentUserId() {
		return this.agentUserId;
	}
	public void setAgentUserId(String agentUserId) {
		this.agentUserId = agentUserId;
	}

}
