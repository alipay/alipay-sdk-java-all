package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 失效商品
 *
 * @author auto create
 * @since 1.0, 2025-04-15 14:33:47
 */
public class AlipayMarketingBusinessbillGoodsDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 5372671728221558124L;

	/**
	 * 支付宝分配的场景编码
	 */
	@ApiField("activity_scene")
	private String activityScene;

	/**
	 * 失效商品id，定位商品的唯一凭证
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getActivityScene() {
		return this.activityScene;
	}
	public void setActivityScene(String activityScene) {
		this.activityScene = activityScene;
	}

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
