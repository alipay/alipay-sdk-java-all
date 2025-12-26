package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 健康服务配送节点
 *
 * @author auto create
 * @since 1.0, 2025-10-30 11:06:49
 */
public class DeliveryNode extends AlipayObject {

	private static final long serialVersionUID = 5667548695348284329L;

	/**
	 * 节点描述，传中文，蚂蚁不做校验
	 */
	@ApiField("node_desc")
	private String nodeDesc;

	/**
	 * 传中文，蚂蚁不做校验
	 */
	@ApiField("node_name")
	private String nodeName;

	/**
	 * 时间
	 */
	@ApiField("time")
	private String time;

	public String getNodeDesc() {
		return this.nodeDesc;
	}
	public void setNodeDesc(String nodeDesc) {
		this.nodeDesc = nodeDesc;
	}

	public String getNodeName() {
		return this.nodeName;
	}
	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public String getTime() {
		return this.time;
	}
	public void setTime(String time) {
		this.time = time;
	}

}
