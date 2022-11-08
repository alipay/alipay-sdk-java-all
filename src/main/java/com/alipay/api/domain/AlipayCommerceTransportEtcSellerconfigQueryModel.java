package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * ETC发行方信息查询
 *
 * @author auto create
 * @since 1.0, 2022-06-30 20:39:16
 */
public class AlipayCommerceTransportEtcSellerconfigQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8411857428947613689L;

	/**
	 * 外部宿主商户（ISV）的appid
	 */
	@ApiField("agent_appid")
	private String agentAppid;

	/**
	 * 外部宿主商户（ISV）的pid
	 */
	@ApiField("agent_pid")
	private String agentPid;

	/**
	 * 需要查询的发行方信息配置类目
	 */
	@ApiListField("query_scopes")
	@ApiField("string")
	private List<String> queryScopes;

	/**
	 * 发行方的标识ID
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAgentAppid() {
		return this.agentAppid;
	}
	public void setAgentAppid(String agentAppid) {
		this.agentAppid = agentAppid;
	}

	public String getAgentPid() {
		return this.agentPid;
	}
	public void setAgentPid(String agentPid) {
		this.agentPid = agentPid;
	}

	public List<String> getQueryScopes() {
		return this.queryScopes;
	}
	public void setQueryScopes(List<String> queryScopes) {
		this.queryScopes = queryScopes;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
