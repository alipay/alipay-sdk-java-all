package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益有效期信息对象
 *
 * @author auto create
 * @since 1.0, 2019-01-08 09:38:56
 */
public class MEquityValidInfo extends AlipayObject {

	private static final long serialVersionUID = 7425119659768638492L;

	/**
	 * 延迟生效时间(单位分钟)；延迟生效时间取值范围1~99999的整数，注意：仅当effect_type=DELAY时，该值起作用
	 */
	@ApiField("delay_minutes")
	private Long delayMinutes;

	/**
	 * 券生效方式，当券有效期为绝对时间（FIXED）时，只能设置IMMEDIATELY，枚举取值：立即生效：IMMEDIATELY，延迟生效：DELAY
	 */
	@ApiField("effect_type")
	private String effectType;

	/**
	 * 权益结束时间，有效期类型valid_type为FIXED绝对方式时必填且仅当FIXED类型，该值可用，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 描述了券相对领取后多少分钟有效，取值必须1~99999的整数，有效期类型valid_type为RELATIVE时必填且仅当RELATIVE值时该值起作用
	 */
	@ApiField("relative_minutes")
	private Long relativeMinutes;

	/**
	 * 权益开始时间，有效期类型valid_type为FIXED绝对方式时必填且仅当FIXED类型，该值可用，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 有效期类型，支持枚举值：绝对方式：FIXED、相对方式：RELATIVE
	 */
	@ApiField("valid_type")
	private String validType;

	public Long getDelayMinutes() {
		return this.delayMinutes;
	}
	public void setDelayMinutes(Long delayMinutes) {
		this.delayMinutes = delayMinutes;
	}

	public String getEffectType() {
		return this.effectType;
	}
	public void setEffectType(String effectType) {
		this.effectType = effectType;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Long getRelativeMinutes() {
		return this.relativeMinutes;
	}
	public void setRelativeMinutes(Long relativeMinutes) {
		this.relativeMinutes = relativeMinutes;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getValidType() {
		return this.validType;
	}
	public void setValidType(String validType) {
		this.validType = validType;
	}

}
