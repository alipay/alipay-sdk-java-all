package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 阿里云权益订单信息同步
 *
 * @author auto create
 * @since 1.0, 2026-01-22 11:07:02
 */
public class AlipayUserAliyunbenefitOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7633551276285728231L;

	/**
	 * LinkedMall订单号
	 */
	@ApiField("lm_order_id")
	private String lmOrderId;

	/**
	 * 订单状态变更时间
	 */
	@ApiField("modified_time")
	private String modifiedTime;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 积分已支付
	 */
	@ApiField("order_status")
	private Long orderStatus;

	/**
	 * 阿里云侧流水号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 待支付
	 */
	@ApiField("pre_order_status")
	private Long preOrderStatus;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getLmOrderId() {
		return this.lmOrderId;
	}
	public void setLmOrderId(String lmOrderId) {
		this.lmOrderId = lmOrderId;
	}

	public String getModifiedTime() {
		return this.modifiedTime;
	}
	public void setModifiedTime(String modifiedTime) {
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

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public Long getPreOrderStatus() {
		return this.preOrderStatus;
	}
	public void setPreOrderStatus(Long preOrderStatus) {
		this.preOrderStatus = preOrderStatus;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
