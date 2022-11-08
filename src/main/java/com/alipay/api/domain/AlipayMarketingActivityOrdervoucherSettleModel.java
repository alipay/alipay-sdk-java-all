package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家券兑换券发起结算
 *
 * @author auto create
 * @since 1.0, 2022-09-08 11:07:52
 */
public class AlipayMarketingActivityOrdervoucherSettleModel extends AlipayObject {

	private static final long serialVersionUID = 5164838931216828164L;

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
	 * 外部业务单号，用作幂等控制。 注：针对同一次结算请求，如果调用接口失败或异常了，重试时需要保证结算请求号不能变更，防止该笔交易重复结算。支付宝会保证同样的结算请求号多次请求只会一次。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

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

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
