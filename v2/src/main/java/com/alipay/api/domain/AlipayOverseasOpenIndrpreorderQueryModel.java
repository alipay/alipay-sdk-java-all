package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询单据状态
 *
 * @author auto create
 * @since 1.0, 2024-04-15 10:53:21
 */
public class AlipayOverseasOpenIndrpreorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3334133758734626712L;

	/**
	 * 订单号
	 */
	@ApiField("pre_order_id")
	private String preOrderId;

	/**
	 * 场景类型
	 */
	@ApiField("scene_type")
	private String sceneType;

	public String getPreOrderId() {
		return this.preOrderId;
	}
	public void setPreOrderId(String preOrderId) {
		this.preOrderId = preOrderId;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

}
