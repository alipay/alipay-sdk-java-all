package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 声音节点信息，某个时间节点的声音摘要
 *
 * @author auto create
 * @since 1.0, 2024-09-03 11:41:01
 */
public class SoundNodeInfo extends AlipayObject {

	private static final long serialVersionUID = 1487569476589698481L;

	/**
	 * 声音某个时间节点的内容概要
	 */
	@ApiField("node_desc")
	private String nodeDesc;

	/**
	 * 声音的某个时间节点，格式是hh:mm:ss
	 */
	@ApiField("node_time")
	private String nodeTime;

	public String getNodeDesc() {
		return this.nodeDesc;
	}
	public void setNodeDesc(String nodeDesc) {
		this.nodeDesc = nodeDesc;
	}

	public String getNodeTime() {
		return this.nodeTime;
	}
	public void setNodeTime(String nodeTime) {
		this.nodeTime = nodeTime;
	}

}
