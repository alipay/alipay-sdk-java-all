package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * linkedmall返还蚂蚁森林能量
 *
 * @author auto create
 * @since 1.0, 2024-08-21 10:51:58
 */
public class AlipaySocialAntiepLinkedmallenergyReturnModel extends AlipayObject {

	private static final long serialVersionUID = 5747278626569721552L;

	/**
	 * LinkedMall分配的业务ID
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 原始扣减积分的请求ID
	 */
	@ApiField("deducted_request_id")
	private String deductedRequestId;

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
	 * 请求ID
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 场景码，如：antforest（蚂蚁森林）
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getDeductedRequestId() {
		return this.deductedRequestId;
	}
	public void setDeductedRequestId(String deductedRequestId) {
		this.deductedRequestId = deductedRequestId;
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

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
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
