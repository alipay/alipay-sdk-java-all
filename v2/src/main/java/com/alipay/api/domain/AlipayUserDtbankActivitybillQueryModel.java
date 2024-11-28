package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询活动账单信息
 *
 * @author auto create
 * @since 1.0, 2024-01-19 15:34:16
 */
public class AlipayUserDtbankActivitybillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2785968459378243429L;

	/**
	 * 银行活动id/解决方案id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 申请查询的账单类型
	 */
	@ApiField("bill_type")
	private String billType;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getBillType() {
		return this.billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
	}

}
