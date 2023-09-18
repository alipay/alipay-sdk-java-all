package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家网络的叶子节点创建
 *
 * @author auto create
 * @since 1.0, 2023-08-15 11:41:28
 */
public class AlipayMerchantNetworkLeafnodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4448581258919251553L;

	/**
	 * 节点的业务备注信息（如地址等信息）
	 */
	@ApiField("biz_info")
	private String bizInfo;

	/**
	 * 商家的网络叶子节点ID，叶子节点ID一般为最后一个层级节点，在预付卡商家网络中对应的值为商户在直付通进件后的SMID账号
	 */
	@ApiField("merchant_leafnode_id")
	private String merchantLeafnodeId;

	/**
	 * 商家的网络叶子节点名称
	 */
	@ApiField("merchant_leafnode_name")
	private String merchantLeafnodeName;

	/**
	 * 商家网络类型
	 */
	@ApiField("network_type")
	private String networkType;

	/**
	 * 增加当前商家的网络叶子节点ID的父节点ID
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

	public String getMerchantLeafnodeId() {
		return this.merchantLeafnodeId;
	}
	public void setMerchantLeafnodeId(String merchantLeafnodeId) {
		this.merchantLeafnodeId = merchantLeafnodeId;
	}

	public String getMerchantLeafnodeName() {
		return this.merchantLeafnodeName;
	}
	public void setMerchantLeafnodeName(String merchantLeafnodeName) {
		this.merchantLeafnodeName = merchantLeafnodeName;
	}

	public String getNetworkType() {
		return this.networkType;
	}
	public void setNetworkType(String networkType) {
		this.networkType = networkType;
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
