package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券绝对核销周期
 *
 * @author auto create
 * @since 1.0, 2025-06-17 16:18:31
 */
public class VoucherAbsolutePeriodInfo extends AlipayObject {

	private static final long serialVersionUID = 6729249637347873475L;

	/**
	 * 核销时间限制
	 */
	@ApiField("time_restrict_info")
	private TimeRestrictInfo timeRestrictInfo;

	/**
	 * 券可使用的开始时间。 格式为：yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("valid_begin_time")
	private Date validBeginTime;

	/**
	 * 券可使用的结束时间。 格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("valid_end_time")
	private Date validEndTime;

	public TimeRestrictInfo getTimeRestrictInfo() {
		return this.timeRestrictInfo;
	}
	public void setTimeRestrictInfo(TimeRestrictInfo timeRestrictInfo) {
		this.timeRestrictInfo = timeRestrictInfo;
	}

	public Date getValidBeginTime() {
		return this.validBeginTime;
	}
	public void setValidBeginTime(Date validBeginTime) {
		this.validBeginTime = validBeginTime;
	}

	public Date getValidEndTime() {
		return this.validEndTime;
	}
	public void setValidEndTime(Date validEndTime) {
		this.validEndTime = validEndTime;
	}

}
