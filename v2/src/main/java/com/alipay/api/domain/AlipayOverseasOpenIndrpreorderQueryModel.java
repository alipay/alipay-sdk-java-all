package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询单据状态
 *
 * @author auto create
 * @since 1.0, 2023-05-11 14:04:28
 */
public class AlipayOverseasOpenIndrpreorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4726983988849861213L;

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
