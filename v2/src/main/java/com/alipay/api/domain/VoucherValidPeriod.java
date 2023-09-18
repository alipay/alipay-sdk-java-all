package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 日期区间内可以使用优惠
 *
 * @author auto create
 * @since 1.0, 2022-08-24 14:43:12
 */
public class VoucherValidPeriod extends AlipayObject {

	private static final long serialVersionUID = 7717259958933584434L;

	/**
	 * 券有效期类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 券可使用的开始时间。格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("valid_begin_time")
	private Date validBeginTime;

	/**
	 * 券生效后N天内可以使用。可以配合wait_days_after_receive字段使用。
	 */
	@ApiField("valid_days_after_receive")
	private Long validDaysAfterReceive;

	/**
	 * 券可使用的结束时间。格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("valid_end_time")
	private Date validEndTime;

	/**
	 * 用户领券后需要等待N天，券才可以生效。如果该字段填入0或者不填写，则用户领券后立刻生效。
	 */
	@ApiField("wait_days_after_receive")
	private Long waitDaysAfterReceive;

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

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
