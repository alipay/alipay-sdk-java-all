package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * linkedmall下单前置咨询
 *
 * @author auto create
 * @since 1.0, 2025-09-17 15:08:48
 */
public class AlipaySocialAntiepLinkedmallenergyConsultModel extends AlipayObject {

	private static final long serialVersionUID = 1127176619485397658L;

	/**
	 * 跳转商品链接时传递，有就透传回来，没有不用传
	 */
	@ApiField("biz_context")
	private String bizContext;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 场景码，如：antforest（蚂蚁森林）
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * sku的id
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizContext() {
		return this.bizContext;
	}
	public void setBizContext(String bizContext) {
		this.bizContext = bizContext;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
