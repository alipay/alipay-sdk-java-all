package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 周边定制生成高清图
 *
 * @author auto create
 * @since 1.0, 2023-12-15 20:24:52
 */
public class AlipayUserAigcDiyitemhdCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1551527939736178479L;

	/**
	 * 支付宝AIGC订单ID
	 */
	@ApiField("aigc_order_id")
	private String aigcOrderId;

	/**
	 * 多媒体图片ID
	 */
	@ApiField("image_id")
	private String imageId;

	/**
	 * 蚂蚁开放id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 业务订单号，如商家侧的订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAigcOrderId() {
		return this.aigcOrderId;
	}
	public void setAigcOrderId(String aigcOrderId) {
		this.aigcOrderId = aigcOrderId;
	}

	public String getImageId() {
		return this.imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
