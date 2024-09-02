package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业缴费ISV取消预订单
 *
 * @author auto create
 * @since 1.0, 2023-05-11 14:07:03
 */
public class AlipayOverseasOpenIndrpreorderCancelModel extends AlipayObject {

	private static final long serialVersionUID = 3755838734198356178L;

	/**
	 * 预订单号
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
