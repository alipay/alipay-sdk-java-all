package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益生效时间
 *
 * @author auto create
 * @since 1.0, 2022-11-14 16:18:12
 */
public class BenefitValidPeriodDTO extends AlipayObject {

	private static final long serialVersionUID = 1889728363259156952L;

	/**
	 * 当type为 RELATIVE时，该字段必填
0代表立即生效
3600代表1小时后开始生效
	 */
	@ApiField("active_seconds_after_receive")
	private Long activeSecondsAfterReceive;

	/**
	 * 权益生效时间，ISO8601格式,当type为ABSOLUTE时必填
0时区: "2022-09-01T12:08:56Z"
	 */
	@ApiField("active_time")
	private String activeTime;

	/**
	 * 当type为ABSOLUTE时必填
0时区: "2022-09-30T12:08:56Z"
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 当type为RELATIVE时,该字段必填
领取权益后多少秒开始失效，该值一定要比
activeSeconds大
	 */
	@ApiField("expire_seconds_after_receive")
	private Long expireSecondsAfterReceive;

	/**
	 * ABSOLUTE ：绝对时间区间类型;RELATIVE ： 相对领取时间类型
	 */
	@ApiField("type")
	private String type;

	public Long getActiveSecondsAfterReceive() {
		return this.activeSecondsAfterReceive;
	}
	public void setActiveSecondsAfterReceive(Long activeSecondsAfterReceive) {
		this.activeSecondsAfterReceive = activeSecondsAfterReceive;
	}

	public String getActiveTime() {
		return this.activeTime;
	}
	public void setActiveTime(String activeTime) {
		this.activeTime = activeTime;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Long getExpireSecondsAfterReceive() {
		return this.expireSecondsAfterReceive;
	}
	public void setExpireSecondsAfterReceive(Long expireSecondsAfterReceive) {
		this.expireSecondsAfterReceive = expireSecondsAfterReceive;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
