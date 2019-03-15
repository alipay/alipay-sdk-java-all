package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安全场景
 *
 * @author auto create
 * @since 1.0, 2018-09-18 10:50:24
 */
public class SecurityScene extends AlipayObject {

	private static final long serialVersionUID = 4138942351643218775L;

	/**
	 * 接入渠道
	 */
	@ApiField("access_channel")
	private String accessChannel;

	/**
	 * 事件信息
	 */
	@ApiField("ctu_params")
	private String ctuParams;

	/**
	 * 产品名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 产品节点
	 */
	@ApiField("product_node")
	private String productNode;

	/**
	 * 扩展参数
	 */
	@ApiField("security_scene_params")
	private String securitySceneParams;

	/**
	 * 系统名称
	 */
	@ApiField("system_name")
	private String systemName;

	/**
	 * 总金额
	 */
	@ApiField("total_fee")
	private String totalFee;

	public String getAccessChannel() {
		return this.accessChannel;
	}
	public void setAccessChannel(String accessChannel) {
		this.accessChannel = accessChannel;
	}

	public String getCtuParams() {
		return this.ctuParams;
	}
	public void setCtuParams(String ctuParams) {
		this.ctuParams = ctuParams;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductNode() {
		return this.productNode;
	}
	public void setProductNode(String productNode) {
		this.productNode = productNode;
	}

	public String getSecuritySceneParams() {
		return this.securitySceneParams;
	}
	public void setSecuritySceneParams(String securitySceneParams) {
		this.securitySceneParams = securitySceneParams;
	}

	public String getSystemName() {
		return this.systemName;
	}
	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}

	public String getTotalFee() {
		return this.totalFee;
	}
	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}

}
