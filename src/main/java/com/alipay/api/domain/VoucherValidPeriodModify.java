package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改券有效期对象
 *
 * @author auto create
 * @since 1.0, 2022-02-25 10:43:58
 */
public class VoucherValidPeriodModify extends AlipayObject {

	private static final long serialVersionUID = 4394554392986392848L;

	/**
	 * 券可使用的开始时间。 格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("valid_begin_time")
	private Date validBeginTime;

	/**
	 * 券生效后N天内可以使用。


限制：
1、创建活动时传入时间类型type为RELATIVE时可修改。
2、valid_days_after_receive必须大于0。
3、修改该时间，只允许延长，不允许缩短。
	 */
	@ApiField("valid_days_after_receive")
	private Long validDaysAfterReceive;

	/**
	 * 券可使用的结束时间。

格式为yyyy-MM-dd HH:mm:ss

限制：
1、创建活动时传入时间类型type为ABSOLUTE才能修改。
2、券可使用的结束时间valid_end_time 必须大于 券的发放结束时间publish_end_time
3、修改券可使用的结束时间，只能延长，不允许缩短。
	 */
	@ApiField("valid_end_time")
	private Date validEndTime;

	/**
	 * 用户领券后需要等待N天，券才可以生效。
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
