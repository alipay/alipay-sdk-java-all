package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付券核销时间修改
 *
 * @author auto create
 * @since 1.0, 2022-02-23 14:18:04
 */
public class PaymentVoucherValidPeriodModify extends AlipayObject {

	private static final long serialVersionUID = 8575132156454879513L;

	/**
	 * 券生效后N天内可以使用。 限制： type为RELATIVE时可修改。 valid_days_after_receive必须大于0。 修改该时间，只允许延长，不允许缩短。
	 */
	@ApiField("valid_days_after_receive")
	private Long validDaysAfterReceive;

	/**
	 * 券可使用的结束时间。 格式为yyyy-MM-dd HH:mm:ss 限制： type为ABSOLUTE可修改。 券可使用的结束时间valid_end_time 必须大于 券的发放结束时间 publish_end_time 修改券可使用的结束时间，只能延长，不允许缩短。
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
