package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * linkedmall订单信息同步
 *
 * @author auto create
 * @since 1.0, 2025-09-17 14:49:55
 */
public class AlipaySocialAntiepLinkedmallenergySyncModel extends AlipayObject {

	private static final long serialVersionUID = 1736895921469441784L;

	/**
	 * 订单金额,单位分
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 跳转商品链接时传递，有就透传回来，没有不用传
	 */
	@ApiField("biz_context")
	private String bizContext;

	/**
	 * 商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * LinkedMall的订单ID
	 */
	@ApiField("lm_order_id")
	private Long lmOrderId;

	/**
	 * 数据库变化时间戳，用户付款时间
	 */
	@ApiField("modified_time")
	private Long modifiedTime;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 1=创单开始，12=创单完成，待支付，2=已支付，4=已退款关闭，6=交易成功，8=被淘宝关闭
	 */
	@ApiField("order_status")
	private Long orderStatus;

	/**
	 * 原订单状态
	 */
	@ApiField("pre_order_status")
	private Long preOrderStatus;

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

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

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

	public Long getLmOrderId() {
		return this.lmOrderId;
	}
	public void setLmOrderId(Long lmOrderId) {
		this.lmOrderId = lmOrderId;
	}

	public Long getModifiedTime() {
		return this.modifiedTime;
	}
	public void setModifiedTime(Long modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Long getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(Long orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Long getPreOrderStatus() {
		return this.preOrderStatus;
	}
	public void setPreOrderStatus(Long preOrderStatus) {
		this.preOrderStatus = preOrderStatus;
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
