package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ivr轨迹信息
 *
 * @author auto create
 * @since 1.0, 2024-05-24 11:34:03
 */
public class IvrTrackingVO extends AlipayObject {

	private static final long serialVersionUID = 1625974282892595457L;

	/**
	 * 被叫号码
	 */
	@ApiField("callee")
	private String callee;

	/**
	 * 主叫号码
	 */
	@ApiField("caller")
	private String caller;

	/**
	 * 话务通道 ID
	 */
	@ApiField("channel_id")
	private String channelId;

	/**
	 * 通话id
	 */
	@ApiField("contact_id")
	private String contactId;

	/**
	 * 进入该 IVR 节点的时间，格式为 Unix 时间戳，单位毫秒。
	 */
	@ApiField("enter_time")
	private String enterTime;

	/**
	 * 联系流 ID
	 */
	@ApiField("flow_id")
	private String flowId;

	/**
	 * 联系流名称
	 */
	@ApiField("flow_name")
	private String flowName;

	/**
	 * 离开该 IVR 节点的时间
	 */
	@ApiField("leave_time")
	private String leaveTime;

	/**
	 * 节点的状态码。
	 */
	@ApiField("node_exit_code")
	private String nodeExitCode;

	/**
	 * 节点 ID
	 */
	@ApiField("node_id")
	private String nodeId;

	/**
	 * 节点名称
	 */
	@ApiField("node_name")
	private String nodeName;

	/**
	 * 节点的属性（根据不同的属性表示的内容不同）
	 */
	@ApiField("node_properties")
	private String nodeProperties;

	/**
	 * 节点类型。
	 */
	@ApiField("node_type")
	private String nodeType;

	/**
	 * 节点变量(根据不同的节点表示的不同意思)
	 */
	@ApiField("node_variables")
	private String nodeVariables;

	public String getCallee() {
		return this.callee;
	}
	public void setCallee(String callee) {
		this.callee = callee;
	}

	public String getCaller() {
		return this.caller;
	}
	public void setCaller(String caller) {
		this.caller = caller;
	}

	public String getChannelId() {
		return this.channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getContactId() {
		return this.contactId;
	}
	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public String getEnterTime() {
		return this.enterTime;
	}
	public void setEnterTime(String enterTime) {
		this.enterTime = enterTime;
	}

	public String getFlowId() {
		return this.flowId;
	}
	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

	public String getFlowName() {
		return this.flowName;
	}
	public void setFlowName(String flowName) {
		this.flowName = flowName;
	}

	public String getLeaveTime() {
		return this.leaveTime;
	}
	public void setLeaveTime(String leaveTime) {
		this.leaveTime = leaveTime;
	}

	public String getNodeExitCode() {
		return this.nodeExitCode;
	}
	public void setNodeExitCode(String nodeExitCode) {
		this.nodeExitCode = nodeExitCode;
	}

	public String getNodeId() {
		return this.nodeId;
	}
	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	public String getNodeName() {
		return this.nodeName;
	}
	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public String getNodeProperties() {
		return this.nodeProperties;
	}
	public void setNodeProperties(String nodeProperties) {
		this.nodeProperties = nodeProperties;
	}

	public String getNodeType() {
		return this.nodeType;
	}
	public void setNodeType(String nodeType) {
		this.nodeType = nodeType;
	}

	public String getNodeVariables() {
		return this.nodeVariables;
	}
	public void setNodeVariables(String nodeVariables) {
		this.nodeVariables = nodeVariables;
	}

}
