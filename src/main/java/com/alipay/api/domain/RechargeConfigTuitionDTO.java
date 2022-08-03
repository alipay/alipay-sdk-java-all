package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学费码充值配置对象
 *
 * @author auto create
 * @since 1.0, 2020-10-26 13:20:19
 */
public class RechargeConfigTuitionDTO extends AlipayObject {

	private static final long serialVersionUID = 2263143451536142874L;

	/**
	 * 外部传入扩展字段，系统不管控该字段内容
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 第一期打款时间
	 */
	@ApiField("first_payment_time")
	private Date firstPaymentTime;

	/**
	 * 每期的时间间隔，和周期类型相关。月类型情况下，数字1表示间隔一个月，依次类推
	 */
	@ApiField("interval")
	private Long interval;

	/**
	 * 最后一期打款时间
	 */
	@ApiField("last_payment_time")
	private Date lastPaymentTime;

	/**
	 * DAY("天"), MONTH("月"), YEAR("年");
	 */
	@ApiField("period_type")
	private String periodType;

	/**
	 * 分期数
	 */
	@ApiField("periods")
	private Long periods;

	/**
	 * 总金额，格式为0.00
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public Date getFirstPaymentTime() {
		return this.firstPaymentTime;
	}
	public void setFirstPaymentTime(Date firstPaymentTime) {
		this.firstPaymentTime = firstPaymentTime;
	}

	public Long getInterval() {
		return this.interval;
	}
	public void setInterval(Long interval) {
		this.interval = interval;
	}

	public Date getLastPaymentTime() {
		return this.lastPaymentTime;
	}
	public void setLastPaymentTime(Date lastPaymentTime) {
		this.lastPaymentTime = lastPaymentTime;
	}

	public String getPeriodType() {
		return this.periodType;
	}
	public void setPeriodType(String periodType) {
		this.periodType = periodType;
	}

	public Long getPeriods() {
		return this.periods;
	}
	public void setPeriods(Long periods) {
		this.periods = periods;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
