package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 黑晶服务发送指令
 *
 * @author auto create
 * @since 1.0, 2024-06-13 14:43:19
 */
public class AlipayTerminalEdgecloudHeyagentCommandSendModel extends AlipayObject {

	private static final long serialVersionUID = 6148177415997544368L;

	/**
	 * 本次绘话的ID
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * RPA命令，点击滑动输入等
	 */
	@ApiField("command")
	private String command;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 向谁发送命令
目前有两个字符串类型的枚举"native""cloud"
	 */
	@ApiField("target")
	private String target;

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

	public String getCommand() {
		return this.command;
	}
	public void setCommand(String command) {
		this.command = command;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getTarget() {
		return this.target;
	}
	public void setTarget(String target) {
		this.target = target;
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
