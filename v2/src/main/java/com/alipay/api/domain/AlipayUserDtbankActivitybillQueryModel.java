package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询活动账单信息
 *
 * @author auto create
 * @since 1.0, 2025-01-23 11:03:53
 */
public class AlipayUserDtbankActivitybillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6443347928776896112L;

	/**
	 * 银行活动id/解决方案id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 申请查询的账单类型 当前字段已废弃(该参数已废弃，若继续上传，系统也不会消费该参数，存量业务不受影响)
	 */
	@ApiField("bill_type")
	@Deprecated
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
