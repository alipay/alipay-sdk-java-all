package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家网络节点修改
 *
 * @author auto create
 * @since 1.0, 2024-08-08 14:24:02
 */
public class AlipayMerchantNetworkNodeModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2191681373513466529L;

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
	 * 商家网络的根节点，一般为总部企业账号PID （邀测阶段为商家与支付宝产生合作，由支付宝进行协商提供给商家）
	 */
	@ApiField("root_id")
	private String rootId;

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

	public String getRootId() {
		return this.rootId;
	}
	public void setRootId(String rootId) {
		this.rootId = rootId;
	}

}
