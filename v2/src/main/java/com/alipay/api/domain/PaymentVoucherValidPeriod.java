package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 允许指定券的特殊生效时间规则。
 *
 * @author auto create
 * @since 1.0, 2022-02-23 14:18:08
 */
public class PaymentVoucherValidPeriod extends AlipayObject {

	private static final long serialVersionUID = 3631892281455715129L;

	/**
	 * 券有效期。
枚举值：
ABSOLUTE：绝对时间
RELATIVE：相对时间
	 */
	@ApiField("type")
	private String type;

	/**
	 * 券可使用的开始时间。

格式为：yyyy-MM-dd HH:mm:ss

限制：
type为ABSOLUTE时该字段必填。
	 */
	@ApiField("valid_begin_time")
	private Date validBeginTime;

	/**
	 * 券生效后N天内可以使用。

可以配合wait_days_after_receive字段使用。

限制：
1.type为RELATIVE时必填。
2.valid_days_after_receive必须大于0。
	 */
	@ApiField("valid_days_after_receive")
	private Long validDaysAfterReceive;

	/**
	 * 券可使用的结束时间。

格式为yyyy-MM-dd HH:mm:ss

限制：
1、type为ABSOLUTE必填。
2、券可使用的结束时间valid_end_time必须大于券的发放结束时间publish_end_time
	 */
	@ApiField("valid_end_time")
	private Date validEndTime;

	/**
	 * 用户领券后需要等待N天，券才可以生效。默认用户领券后立刻生效。

限制：
1、type为RELATIVE时可选。
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
