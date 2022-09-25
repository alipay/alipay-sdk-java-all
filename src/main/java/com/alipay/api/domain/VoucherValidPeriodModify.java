package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改券有效期对象
 *
 * @author auto create
 * @since 1.0, 2022-08-24 14:45:48
 */
public class VoucherValidPeriodModify extends AlipayObject {

	private static final long serialVersionUID = 5218867661768536672L;

	/**
	 * 券可使用的开始时间。格式为：yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("valid_begin_time")
	private Date validBeginTime;

	/**
	 * 券生效后 N 天内可以使用。
	 */
	@ApiField("valid_days_after_receive")
	private Long validDaysAfterReceive;

	/**
	 * 券可使用的结束时间。格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("valid_end_time")
	private Date validEndTime;

	/**
	 * 用户领券后需要等待 N 天，券才可以生效。
	 */
	@ApiField("wait_days_after_receive")
	private Long waitDaysAfterReceive;

	public Date getValidBeginTime() {
		return this.validBeginTime;
	}
	public void setValidBeginTime(Date validBeginTime) {
		this.validBeginTime = validBeginTime;
	}

	public Long getValidDaysAfterReceive() {
		return this.validDaysAfterReceive;
	}
	public void setValidDaysAfterReceive(Long validDaysAfterReceive) {
		this.validDaysAfterReceive = validDaysAfterReceive;
	}

	public Date getValidEndTime() {
		return this.validEndTime;
	}
	public void setValidEndTime(Date validEndTime) {
		this.validEndTime = validEndTime;
	}

	public Long getWaitDaysAfterReceive() {
		return this.waitDaysAfterReceive;
	}
	public void setWaitDaysAfterReceive(Long waitDaysAfterReceive) {
		this.waitDaysAfterReceive = waitDaysAfterReceive;
	}

}
