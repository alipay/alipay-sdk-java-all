package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家网络节点创建
 *
 * @author auto create
 * @since 1.0, 2023-08-15 11:40:52
 */
public class AlipayMerchantNetworkNodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3441145746627889189L;

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
	 * 商家网络类型
	 */
	@ApiField("network_type")
	private String networkType;

	/**
	 * 商家网络节点的类型，如城市，商圈, 商家
	 */
	@ApiField("node_biz_type")
	private String nodeBizType;

	/**
	 * 增加当前商家的网络节点ID的父节点ID
	 */
	@ApiField("parent_merchant_node_id")
	private String parentMerchantNodeId;

	/**
	 * 商家网络的根节点，一般为总部企业账号PID （邀测阶段为商家与支付宝产生合作，由支付宝进行协商提供给商家）
	 */
	@ApiField("root_id")
	private String rootId;

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

	public String getNetworkType() {
		return this.networkType;
	}
	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}

	public String getNodeBizType() {
		return this.nodeBizType;
	}
	public void setNodeBizType(String nodeBizType) {
		this.nodeBizType = nodeBizType;
	}

	public String getParentMerchantNodeId() {
		return this.parentMerchantNodeId;
	}
	public void setParentMerchantNodeId(String parentMerchantNodeId) {
		this.parentMerchantNodeId = parentMerchantNodeId;
	}

	public String getRootId() {
		return this.rootId;
	}
	public void setRootId(String rootId) {
		this.rootId = rootId;
	}

}
