package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 调整任务周期时间
 *
 * @author auto create
 * @since 1.0, 2026-01-30 10:57:58
 */
public class AlipayOfflineProviderNsalesActivityperiodModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1831694614357412624L;

	/**
	 * UA开头的主任务号
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 外部业务流水号，幂等处理，同一业务流水号只允许修改一次。
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 待修改的子期任务列表
	 */
	@ApiListField("period_list")
	@ApiField("n_sales_sub_activity_modify")
	private List<NSalesSubActivityModify> periodList;

	/**
	 * 本次修改任务周期的原因
	 */
	@ApiField("reason_code")
	private String reasonCode;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

	public List<NSalesSubActivityModify> getPeriodList() {
		return this.periodList;
	}
	public void setPeriodList(List<NSalesSubActivityModify> periodList) {
		this.periodList = periodList;
	}

	public String getReasonCode() {
		return this.reasonCode;
	}
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

}
