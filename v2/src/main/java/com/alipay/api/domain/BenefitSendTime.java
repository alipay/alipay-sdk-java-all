package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 数字分行权益发放时间
 *
 * @author auto create
 * @since 1.0, 2021-03-25 14:31:27
 */
public class BenefitSendTime extends AlipayObject {

	private static final long serialVersionUID = 5257323251711385652L;

	/**
	 * 代表限定周期时间类型

DAY_OF_WEEK:星期维度
	 */
	@ApiField("cycle_period_type")
	private String cyclePeriodType;

	/**
	 * 代表发放周期类型(cycle_period_type)下具体值。
比如：
cycle_period_type=DAY_OF_WEEK，cycle_period_value=["MON","TUE","WEB"],
代表：周一、周二、周三
	 */
	@ApiField("cycle_period_value")
	private String cyclePeriodValue;

	/**
	 * 红包发放开始时间
	 */
	@ApiField("send_begin_time")
	private Date sendBeginTime;

	/**
	 * 红包发放结束时间
	 */
	@ApiField("send_end_time")
	private Date sendEndTime;

	/**
	 * 代表在周期时间范围下，子周期限定时间类型
SECOND_OF_DAY:一天内具体时间点(秒为单位)
	 */
	@ApiField("sub_cycle_period_type")
	private String subCyclePeriodType;

	/**
	 * 代表发放周期类型(cycle_period_type)下具体值。
比如：
cycle_period_type=SECOND_OF_DAY，cycle_period_value=["01:53:28-02:53:28","05:10:10-08:30:30"],

代表：
子时间段为每天的01点53分28秒到02点53分28秒，05点10分10秒到08点30分30秒
	 */
	@ApiListField("sub_cycle_period_value")
	@ApiField("string")
	private List<String> subCyclePeriodValue;

	public String getCyclePeriodType() {
		return this.cyclePeriodType;
	}
	public void setCyclePeriodType(String cyclePeriodType) {
		this.cyclePeriodType = cyclePeriodType;
	}

	public String getCyclePeriodValue() {
		return this.cyclePeriodValue;
	}
	public void setCyclePeriodValue(String cyclePeriodValue) {
		this.cyclePeriodValue = cyclePeriodValue;
	}

	public Date getSendBeginTime() {
		return this.sendBeginTime;
	}
	public void setSendBeginTime(Date sendBeginTime) {
		this.sendBeginTime = sendBeginTime;
	}

	public Date getSendEndTime() {
		return this.sendEndTime;
	}
	public void setSendEndTime(Date sendEndTime) {
		this.sendEndTime = sendEndTime;
	}

	public String getSubCyclePeriodType() {
		return this.subCyclePeriodType;
	}
	public void setSubCyclePeriodType(String subCyclePeriodType) {
		this.subCyclePeriodType = subCyclePeriodType;
	}

	public List<String> getSubCyclePeriodValue() {
		return this.subCyclePeriodValue;
	}
	public void setSubCyclePeriodValue(List<String> subCyclePeriodValue) {
		this.subCyclePeriodValue = subCyclePeriodValue;
	}

}
