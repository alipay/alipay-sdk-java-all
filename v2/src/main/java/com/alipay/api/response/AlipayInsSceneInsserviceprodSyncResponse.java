package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.insserviceprod.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 07:41:10
 */
public class AlipayInsSceneInsserviceprodSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5761952442457187654L;

	/** 
	 * 节点描述信息
	 */
	@ApiField("node_desc")
	private String nodeDesc;

	/** 
	 * 节点名称
	 */
	@ApiField("node_name")
	private String nodeName;

	public void setNodeDesc(String nodeDesc) {
		this.nodeDesc = nodeDesc;
	}
	public String getNodeDesc( ) {
		return this.nodeDesc;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}
	public String getNodeName( ) {
		return this.nodeName;
	}

}
