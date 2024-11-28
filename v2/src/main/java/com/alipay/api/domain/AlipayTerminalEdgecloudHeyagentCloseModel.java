package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 关闭云渲染服务
 *
 * @author auto create
 * @since 1.0, 2024-07-22 19:33:50
 */
public class AlipayTerminalEdgecloudHeyagentCloseModel extends AlipayObject {

	private static final long serialVersionUID = 3681981992385434162L;

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
	 * 结束的结果码
	 */
	@ApiField("result_code")
	private String resultCode;

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

	public String getResultCode() {
		return this.resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
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
