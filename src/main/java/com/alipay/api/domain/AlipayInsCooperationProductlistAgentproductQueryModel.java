package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * （快捷投保）调用本保险公司的线下产品列表
 *
 * @author auto create
 * @since 1.0, 2017-08-01 17:36:50
 */
public class AlipayInsCooperationProductlistAgentproductQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1394643814873544631L;

	/**
	 * 本代理人在保险公司的惟一标识，后续需要关联该代理人在蚂蚁平台上的行动，以及代理的保单信息
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 蚂蚁平台需要校验改代理人的合法身份
	 */
	@ApiField("id_card")
	private String idCard;

	/**
	 * 机构在蚂蚁平台上的惟一标识
	 */
	@ApiField("inst_id")
	private String instId;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getIdCard() {
		return this.idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

}
