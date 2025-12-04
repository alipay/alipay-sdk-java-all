package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取支付宝会员AIGC高清图片
 *
 * @author auto create
 * @since 1.0, 2023-08-03 21:09:33
 */
public class AlipayUserAigcAipictureQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2382966899126768944L;

	/**
	 * 支付宝AIGC订单id
	 */
	@ApiField("alipay_order_id")
	private String alipayOrderId;

	/**
	 * afts图片ID
	 */
	@ApiField("image_id")
	private String imageId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商家侧业务订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 同一笔流水，请求高清图生成的重试次数，默认0
	 */
	@ApiField("retry_count")
	private Long retryCount;

	/**
	 * 支付宝生成的traceId，由前端跳转携带，用于问题追溯
	 */
	@ApiField("trace_id")
	private String traceId;

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

	public Long getRetryCount() {
		return this.retryCount;
	}
	public void setRetryCount(Long retryCount) {
		this.retryCount = retryCount;
	}

	public String getTraceId() {
		return this.traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
