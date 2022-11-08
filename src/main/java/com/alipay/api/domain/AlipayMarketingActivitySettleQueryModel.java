package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单券结算查询
 *
 * @author auto create
 * @since 1.0, 2022-09-08 11:07:38
 */
public class AlipayMarketingActivitySettleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4148445931367835684L;

	/**
	 * 优惠券活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 购买商家兑换券的营销订单号。
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 兑换券发起结算之后返回的结算单号，用于查询对应的结算明细
	 */
	@ApiField("settle_no")
	private String settleNo;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getSettleNo() {
		return this.settleNo;
	}
	public void setSettleNo(String settleNo) {
		this.settleNo = settleNo;
	}

}
