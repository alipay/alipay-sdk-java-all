package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 充值金回滚
 *
 * @author auto create
 * @since 1.0, 2024-11-28 11:57:31
 */
public class AlipayCommerceAcommunicationPointRollbackModel extends AlipayObject {

	private static final long serialVersionUID = 6329438659214399692L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 等待回滚订单的状态
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 本次调用的外部订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 等待回滚的积分订单ID
	 */
	@ApiField("to_roll_back_order_id")
	private String toRollBackOrderId;

	/**
	 * 等待回滚的外部订单号，需要和to_roll_back_order_id是同一个订单
	 */
	@ApiField("to_roll_back_out_biz_no")
	private String toRollBackOutBizNo;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getToRollBackOrderId() {
		return this.toRollBackOrderId;
	}
	public void setToRollBackOrderId(String toRollBackOrderId) {
		this.toRollBackOrderId = toRollBackOrderId;
	}

	public String getToRollBackOutBizNo() {
		return this.toRollBackOutBizNo;
	}
	public void setToRollBackOutBizNo(String toRollBackOutBizNo) {
		this.toRollBackOutBizNo = toRollBackOutBizNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
