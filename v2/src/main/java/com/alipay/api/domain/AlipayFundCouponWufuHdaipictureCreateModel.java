package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AI年画高清图生成
 *
 * @author auto create
 * @since 1.0, 2023-01-05 16:11:16
 */
public class AlipayFundCouponWufuHdaipictureCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5839389551352454896L;

	/**
	 * 支付宝订单ID
	 */
	@ApiField("alipay_order_id")
	private String alipayOrderId;

	/**
	 * 图片ID
	 */
	@ApiField("image_id")
	private String imageId;

	/**
	 * 蚂蚁开放ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 业务订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 场景code
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAlipayOrderId() {
		return this.alipayOrderId;
	}
	public void setAlipayOrderId(String alipayOrderId) {
		this.alipayOrderId = alipayOrderId;
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
