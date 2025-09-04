package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云渲染服务数据查询
 *
 * @author auto create
 * @since 1.0, 2024-06-13 14:43:28
 */
public class AlipayTerminalEdgecloudHeyagentDataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4631725221251328416L;

	/**
	 * 本次绘话的ID
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 望拿到的关键字
	 */
	@ApiField("data_type")
	private String dataType;

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

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
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
