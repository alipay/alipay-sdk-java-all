package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券使用时间规则
 *
 * @author auto create
 * @since 1.0, 2021-07-22 15:25:26
 */
public class VoucherTimeRule extends AlipayObject {

	private static final long serialVersionUID = 1835333384349145688L;

	/**
	 * 天数：
如果time_type=DAY，则格式为表示具体日期yyyy-MM-dd且逗号分隔的字符串；如果time_type=WEEK，则格式为表示星期几的1-7的数字且逗号分隔的字符串
	 */
	@ApiField("days")
	private String days;

	/**
	 * 结束时间：格式为HH:mm:ss
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 开始时间：格式为HH:mm:ss
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 时间类型：
天（DAY），
周（WEEK）
	 */
	@ApiField("time_type")
	private String timeType;

	public String getDays() {
		return this.days;
	}
	public void setDays(String days) {
		this.days = days;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getTimeType() {
		return this.timeType;
	}
	public void setTimeType(String timeType) {
		this.timeType = timeType;
	}

}
