package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签到规则配置扩展
 *
 * @author auto create
 * @since 1.0, 2025-05-27 18:48:55
 */
public class EduCheckInRuleConfigExt extends AlipayObject {

	private static final long serialVersionUID = 3515692775752449815L;

	/**
	 * 结束分钟
	 */
	@ApiField("end_minutes")
	private Long endMinutes;

	/**
	 * 结束类型
	 */
	@ApiField("end_type")
	private String endType;

	/**
	 * 开始分钟
	 */
	@ApiField("start_minutes")
	private Long startMinutes;

	/**
	 * 开始类型
	 */
	@ApiField("start_type")
	private String startType;

	public Long getEndMinutes() {
		return this.endMinutes;
	}
	public void setEndMinutes(Long endMinutes) {
		this.endMinutes = endMinutes;
	}

	public String getEndType() {
		return this.endType;
	}
	public void setEndType(String endType) {
		this.endType = endType;
	}

	public Long getStartMinutes() {
		return this.startMinutes;
	}
	public void setStartMinutes(Long startMinutes) {
		this.startMinutes = startMinutes;
	}

	public String getStartType() {
		return this.startType;
	}
	public void setStartType(String startType) {
		this.startType = startType;
	}

}
