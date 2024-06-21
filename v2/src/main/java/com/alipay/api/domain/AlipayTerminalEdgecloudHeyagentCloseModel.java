package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 关闭云渲染服务
 *
 * @author auto create
 * @since 1.0, 2024-06-13 14:43:08
 */
public class AlipayTerminalEdgecloudHeyagentCloseModel extends AlipayObject {

	private static final long serialVersionUID = 4867381579447833241L;

	/**
	 * 本次绘话的ID
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("uid")
	private String uid;

	/**
	 * 用户设备的唯一标识
	 */
	@ApiField("utdid")
	private String utdid;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUtdid() {
		return this.utdid;
	}
	public void setUtdid(String utdid) {
		this.utdid = utdid;
	}

}
