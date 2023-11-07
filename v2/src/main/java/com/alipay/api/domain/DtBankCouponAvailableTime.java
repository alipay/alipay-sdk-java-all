package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 红包有效时间
 *
 * @author auto create
 * @since 1.0, 2023-06-20 18:17:19
 */
public class DtBankCouponAvailableTime extends AlipayObject {

	private static final long serialVersionUID = 4256769226248451243L;

	/**
	 * 红包有效期开始时间(绝对时间)，time_type取值为ABSOLUTELY时，此参数有值。
	 */
	@ApiField("absolutely_begin_time")
	private Date absolutelyBeginTime;

	/**
	 * 红包有效期结束时间(绝对时间)，time_type取值为ABSOLUTELY时，此参数有值。
	 */
	@ApiField("absolutely_end_time")
	private Date absolutelyEndTime;

	/**
	 * 红包有效期时长，单位天，time_type取值为RELATIVE时，此参数有值。
	 */
	@ApiField("relative_available_time")
	private Long relativeAvailableTime;

	/**
	 * 红包有效期开始时间类型，time_type取值为RELATIVE时，此参数有值。
	 */
	@ApiField("relative_begin_time_type")
	private String relativeBeginTimeType;

	/**
	 * 红包有效时间类型
	 */
	@ApiField("time_type")
	private String timeType;

	public Date getAbsolutelyBeginTime() {
		return this.absolutelyBeginTime;
	}
	public void setAbsolutelyBeginTime(Date absolutelyBeginTime) {
		this.absolutelyBeginTime = absolutelyBeginTime;
	}

	public Date getAbsolutelyEndTime() {
		return this.absolutelyEndTime;
	}
	public void setAbsolutelyEndTime(Date absolutelyEndTime) {
		this.absolutelyEndTime = absolutelyEndTime;
	}

	public Long getRelativeAvailableTime() {
		return this.relativeAvailableTime;
	}
	public void setRelativeAvailableTime(Long relativeAvailableTime) {
		this.relativeAvailableTime = relativeAvailableTime;
	}

	public String getRelativeBeginTimeType() {
		return this.relativeBeginTimeType;
	}
	public void setRelativeBeginTimeType(String relativeBeginTimeType) {
		this.relativeBeginTimeType = relativeBeginTimeType;
	}

	public String getTimeType() {
		return this.timeType;
	}
	public void setTimeType(String timeType) {
		this.timeType = timeType;
	}

}
