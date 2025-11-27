package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * linkedmall 支付森林能量
 *
 * @author auto create
 * @since 1.0, 2025-09-17 16:58:33
 */
public class AlipaySocialAntiepLinkedmallenergyPayModel extends AlipayObject {

	private static final long serialVersionUID = 2617887499883798226L;

	/**
	 * 跳转商品链接时传递，有就透传回来，没有不用传
	 */
	@ApiField("biz_context")
	private String bizContext;

	/**
	 * LinkedMall入驻的业务ID
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 请求发起的时间，时间格式：yyyyMMddHHmmssSSS
	 */
	@ApiField("deducted_date")
	private String deductedDate;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private Long itemId;

	/**
	 * LinkedMall的订单ID
	 */
	@ApiField("lm_order_id")
	private Long lmOrderId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 本次下单需要扣减的能量数
	 */
	@ApiField("point")
	private Long point;

	/**
	 * 请求ID
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 权益id
	 */
	@ApiField("right_id")
	private String rightId;

	/**
	 * 场景码，如：antforest（蚂蚁森林）
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * sku_id
	 */
	@ApiField("sku_id")
	private Long skuId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizContext() {
		return this.bizContext;
	}
	public void setBizContext(String bizContext) {
		this.bizContext = bizContext;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getDeductedDate() {
		return this.deductedDate;
	}
	public void setDeductedDate(String deductedDate) {
		this.deductedDate = deductedDate;
	}

	public Long getItemId() {
		return this.itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getLmOrderId() {
		return this.lmOrderId;
	}
	public void setLmOrderId(Long lmOrderId) {
		this.lmOrderId = lmOrderId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Long getPoint() {
		return this.point;
	}
	public void setPoint(Long point) {
		this.point = point;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRightId() {
		return this.rightId;
	}
	public void setRightId(String rightId) {
		this.rightId = rightId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public Long getSkuId() {
		return this.skuId;
	}
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
