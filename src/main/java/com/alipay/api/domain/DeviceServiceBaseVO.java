package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备服务信息
 *
 * @author auto create
 * @since 1.0, 2021-04-07 19:21:32
 */
public class DeviceServiceBaseVO extends AlipayObject {

	private static final long serialVersionUID = 1282274913769179434L;

	/**
	 * 设备别名
	 */
	@ApiField("alias_name")
	private String aliasName;

	/**
	 * 图标
	 */
	@ApiField("icon")
	private String icon;

	/**
	 * 节点类型
0为网关设备。1.为mesh子设备。2为除网关类的其他直连设备。3为外设
	 */
	@ApiField("node_type")
	private Long nodeType;

	/**
	 * 产品名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 设备在线状态
0为离线。1为在线
	 */
	@ApiField("status")
	private String status;

	/**
	 * xpId
	 */
	@ApiField("xp_id")
	private String xpId;

	public String getAliasName() {
		return this.aliasName;
	}
	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

	public String getIcon() {
		return this.icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Long getNodeType() {
		return this.nodeType;
	}
	public void setNodeType(Long nodeType) {
		this.nodeType = nodeType;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getXpId() {
		return this.xpId;
	}
	public void setXpId(String xpId) {
		this.xpId = xpId;
	}

}
