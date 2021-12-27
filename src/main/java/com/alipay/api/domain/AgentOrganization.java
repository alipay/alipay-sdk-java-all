package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 代理
 *
 * @author auto create
 * @since 1.0, 2019-12-09 15:21:55
 */
public class AgentOrganization extends AlipayObject {

	private static final long serialVersionUID = 8529493787867716918L;

	/**
	 * 经代下面二级商户id
	 */
	@ApiField("agent_merchant_id")
	private String agentMerchantId;

	/**
	 * 代理机构(ISV)蚂蚁编码，组织入驻蚂蚁生成的cid
	 */
	@ApiField("cid")
	private String cid;

	/**
	 * 代理机构(ISV)蚂蚁全称,组织入驻蚂蚂蚁的全称
	 */
	@ApiField("cid_name")
	private String cidName;

	public String getAgentMerchantId() {
		return this.agentMerchantId;
	}
	public void setAgentMerchantId(String agentMerchantId) {
		this.agentMerchantId = agentMerchantId;
	}

	public String getCid() {
		return this.cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCidName() {
		return this.cidName;
	}
	public void setCidName(String cidName) {
		this.cidName = cidName;
	}

}
