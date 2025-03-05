package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业缴费代缴单信息查询接口
 *
 * @author auto create
 * @since 1.0, 2024-11-04 15:05:34
 */
public class AlipayOverseasOpenPoboQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6751676245448463296L;

	/**
	 * 代缴单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 场景类型
	 */
	@ApiField("scene_type")
	private String sceneType;

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

}
