package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家网络叶子节点删除
 *
 * @author auto create
 * @since 1.0, 2023-08-15 11:41:54
 */
public class AlipayMerchantNetworkLeafnodeDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 7349143758816946388L;

	/**
	 * 商家的网络叶子节点ID，叶子节点ID一般为最后一个层级节点，在预付卡商家网络中对应的值为商户在直付通进件后的SMID账号
	 */
	@ApiField("merchant_leafnode_id")
	private String merchantLeafnodeId;

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

	public String getMerchantLeafnodeId() {
		return this.merchantLeafnodeId;
	}
	public void setMerchantLeafnodeId(String merchantLeafnodeId) {
		this.merchantLeafnodeId = merchantLeafnodeId;
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
