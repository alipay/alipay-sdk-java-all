package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改券有效期对象
 *
 * @author auto create
 * @since 1.0, 2021-09-18 17:18:35
 */
public class VoucherValidPeriodModify extends AlipayObject {

	private static final long serialVersionUID = 5798786767441264239L;

	/**
	 * 券生效后N天内可以使用。


限制：
type为RELATIVE时可修改。

valid_days_after_receive必须大于0。

修改该时间，只允许延长，不允许缩短。
	 */
	@ApiField("valid_days_after_receive")
	private Long validDaysAfterReceive;

	/**
	 * 券可使用的结束时间。

格式为yyyy-MM-dd HH:mm:ss

限制：
type为ABSOLUTE可修改。

券可使用的结束时间valid_end_time 必须大于 券的发放结束时间
publish_end_time

修改券可使用的结束时间，只能延长，不允许缩短。
	 */
	@ApiField("valid_end_time")
	private Date validEndTime;

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

}
