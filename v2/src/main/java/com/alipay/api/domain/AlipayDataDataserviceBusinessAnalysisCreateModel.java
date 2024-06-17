package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 指定商圈商圈分析任务创建
 *
 * @author auto create
 * @since 1.0, 2024-04-28 17:45:44
 */
public class AlipayDataDataserviceBusinessAnalysisCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7326968755369669751L;

	/**
	 * 商户授权码
	 */
	@ApiField("business_code")
	private String businessCode;

	/**
	 * 商圈ID
	 */
	@ApiField("mall_id")
	private String mallId;

	/**
	 * 0:商圈内
1:商圈内+商圈周边1km
3:商圈内+商圈周边3km
5:商圈内+商圈周边5km
	 */
	@ApiField("mall_range")
	private String mallRange;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 分析周期结束日期；
分析周期开始时间和分析周期结束时间之间的差距不能少于1天并且不能超过92天
	 */
	@ApiField("schedule_end_date")
	private String scheduleEndDate;

	/**
	 * 分析周期开始日期；
分析周期开始时间和分析周期结束时间之间的差距不能少于1天并且不能超过92天
	 */
	@ApiField("schedule_start_date")
	private String scheduleStartDate;

	/**
	 * 分析周期频次类型
	 */
	@ApiField("schedule_type")
	private String scheduleType;

	/**
	 * 任务名称
	 */
	@ApiField("task_name")
	private String taskName;

	public String getBusinessCode() {
		return this.businessCode;
	}
	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
	}

	public String getMallId() {
		return this.mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public String getMallRange() {
		return this.mallRange;
	}
	public void setMallRange(String mallRange) {
		this.mallRange = mallRange;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getScheduleEndDate() {
		return this.scheduleEndDate;
	}
	public void setScheduleEndDate(String scheduleEndDate) {
		this.scheduleEndDate = scheduleEndDate;
	}

	public String getScheduleStartDate() {
		return this.scheduleStartDate;
	}
	public void setScheduleStartDate(String scheduleStartDate) {
		this.scheduleStartDate = scheduleStartDate;
	}

	public String getScheduleType() {
		return this.scheduleType;
	}
	public void setScheduleType(String scheduleType) {
		this.scheduleType = scheduleType;
	}

	public String getTaskName() {
		return this.taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

}
