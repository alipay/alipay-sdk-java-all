package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 追加支付券预算
 *
 * @author auto create
 * @since 1.0, 2021-09-07 22:43:21
 */
public class AlipayMarketingActivityVoucherAppendModel extends AlipayObject {

	private static final long serialVersionUID = 1659821941669858212L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 外部业务单号，用作幂等控制。

幂等作用：
参数不变的情况下，再次请求返回与上一次相同的结果。

外部接入方需保证业务单号唯一。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 券总预算值。 限制： 券总预算<= 99999999 特别说明： 该字段的含义是追加到的数量。 不可减少，只能增加。
	 */
	@ApiField("voucher_quantity")
	private Long voucherQuantity;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public Long getVoucherQuantity() {
		return this.voucherQuantity;
	}
	public void setVoucherQuantity(Long voucherQuantity) {
		this.voucherQuantity = voucherQuantity;
	}

}
