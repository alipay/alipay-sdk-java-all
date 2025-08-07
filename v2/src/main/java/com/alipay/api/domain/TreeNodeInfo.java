package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家网络节点信息
 *
 * @author auto create
 * @since 1.0, 2023-08-10 20:03:35
 */
public class TreeNodeInfo extends AlipayObject {

	private static final long serialVersionUID = 8576464698684238973L;

	/**
	 * 商家创建节点时需要携带的业务信息(比如地址)
	 */
	@ApiField("biz_info")
	private String bizInfo;

	/**
	 * 商家的网络节点ID，一般为商家系统的公司，部门等关系之间的唯一ID
	 */
	@ApiField("merchant_node_id")
	private String merchantNodeId;

	/**
	 * 商家的网络节点名称
	 */
	@ApiField("merchant_node_name")
	private String merchantNodeName;

	/**
	 * 节点业务类型
	 */
	@ApiField("node_biz_type")
	private String nodeBizType;

	public String getBizInfo() {
		return this.bizInfo;
	}
	public void setBizInfo(String bizInfo) {
		this.bizInfo = bizInfo;
	}

	public String getMerchantNodeId() {
		return this.merchantNodeId;
	}
	public void setMerchantNodeId(String merchantNodeId) {
		this.merchantNodeId = merchantNodeId;
	}

	public String getMerchantNodeName() {
		return this.merchantNodeName;
	}
	public void setMerchantNodeName(String merchantNodeName) {
		this.merchantNodeName = merchantNodeName;
	}

	public String getNodeBizType() {
		return this.nodeBizType;
	}
	public void setNodeBizType(String nodeBizType) {
		this.nodeBizType = nodeBizType;
	}

}
