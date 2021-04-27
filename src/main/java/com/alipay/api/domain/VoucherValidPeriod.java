package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 日期区间内可以使用优惠
 *
 * @author auto create
 * @since 1.0, 2021-04-24 14:48:33
 */
public class VoucherValidPeriod extends AlipayObject {

	private static final long serialVersionUID = 1165969879135568538L;

	/**
	 * 券有效期。有两种类型：

绝对时间：
ABSOLUTE



相对时间：
RELATIVE
	 */
	@ApiField("type")
	private String type;

	/**
	 * type为ABSOLUTE必填。

券可使用的开始时间。

格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("valid_begin_time")
	private Date validBeginTime;

	/**
	 * type为RELATIVE必填。



券生效后N天内可以使用。



可以配合waitDaysAfterReceive使用。
	 */
	@ApiField("valid_days_after_receive")
	private Long validDaysAfterReceive;

	/**
	 * type为ABSOLUTE必填。



券可使用的结束时间。该时间不能早于

publish_end_time，券的发放时间。

格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("valid_end_time")
	private Date validEndTime;

	/**
	 * type为RELATIVE可选。



用户领券后需要等待N天，券生效。
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
