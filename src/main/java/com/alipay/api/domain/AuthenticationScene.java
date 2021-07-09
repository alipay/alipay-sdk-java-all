package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 身份认证业务场景信息
 *
 * @author auto create
 * @since 1.0, 2017-11-16 14:06:46
 */
public class AuthenticationScene extends AlipayObject {

	private static final long serialVersionUID = 6117949852873848456L;

	/**
	 * 渠道类型
	 */
	@ApiField("access_channel")
	private String accessChannel;

	/**
	 * 系统名称
	 */
	@ApiField("biz_name")
	private String bizName;

	/**
	 * 业务产品节点
	 */
	@ApiField("biz_prod_node")
	private String bizProdNode;

	/**
	 * 产品
	 */
	@ApiField("biz_product")
	private String bizProduct;

	/**
	 * 场景参数
	 */
	@ApiField("scene_params")
	private String sceneParams;

	public String getAccessChannel() {
		return this.accessChannel;
	}
	public void setAccessChannel(String accessChannel) {
		this.accessChannel = accessChannel;
	}

	public String getBizName() {
		return this.bizName;
	}
	public void setBizName(String bizName) {
		this.bizName = bizName;
	}

	public String getBizProdNode() {
		return this.bizProdNode;
	}
	public void setBizProdNode(String bizProdNode) {
		this.bizProdNode = bizProdNode;
	}

	public String getBizProduct() {
		return this.bizProduct;
	}
	public void setBizProduct(String bizProduct) {
		this.bizProduct = bizProduct;
	}

	public String getSceneParams() {
		return this.sceneParams;
	}
	public void setSceneParams(String sceneParams) {
		this.sceneParams = sceneParams;
	}

}
