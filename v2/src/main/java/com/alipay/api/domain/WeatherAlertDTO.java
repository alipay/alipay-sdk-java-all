package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-08 12:17:56
 */
public class WeatherAlertDTO extends AlipayObject {

	private static final long serialVersionUID = 4795553537655149882L;

	/**
	 * 平台极端天气预警 code，与外部数据源 eventType.code 一对一映射，用于标识预警事件类型。
	 */
	@ApiField("alert_code")
	private String alertCode;

	/**
	 * 预警唯一 ID，用于唯一标识一条极端天气预警信息。
	 */
	@ApiField("alert_id")
	private String alertId;

	/**
	 * 预警名称，用于描述极端天气预警的名称。
	 */
	@ApiField("alert_name")
	private String alertName;

	/**
	 * 发生确定性，表示预警事件发生的确定程度。
	 */
	@ApiField("certainty")
	private String certainty;

	/**
	 * 预警触发标准，描述该极端天气预警被触发或发布所依据的条件、阈值或规则。
	 */
	@ApiField("criteria")
	private String criteria;

	/**
	 * 预警详情，用于描述极端天气预警的具体内容、影响范围、可能后果及相关提示信息。
	 */
	@ApiField("description")
	private String description;

	/**
	 * 预警生效时间。
	 */
	@ApiField("effective_time")
	private String effectiveTime;

	/**
	 * 预警信息的失效时间，表示该预警在此时间后不再生效。
	 */
	@ApiField("expire_time")
	private String expireTime;

	/**
	 * 预警标题，用于概括展示该极端天气预警的主要内容。
	 */
	@ApiField("headline")
	private String headline;

	/**
	 * 事件预计开始时间，表示预警事件预计开始发生的时间。
	 */
	@ApiField("onset_time")
	private String onsetTime;

	public String getAlertCode() {
		return this.alertCode;
	}
	public void setAlertCode(String alertCode) {
		this.alertCode = alertCode;
	}

	public String getAlertId() {
		return this.alertId;
	}
	public void setAlertId(String alertId) {
		this.alertId = alertId;
	}

	public String getAlertName() {
		return this.alertName;
	}
	public void setAlertName(String alertName) {
		this.alertName = alertName;
	}

	public String getCertainty() {
		return this.certainty;
	}
	public void setCertainty(String certainty) {
		this.certainty = certainty;
	}

	public String getCriteria() {
		return this.criteria;
	}
	public void setCriteria(String criteria) {
		this.criteria = criteria;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getEffectiveTime() {
		return this.effectiveTime;
	}
	public void setEffectiveTime(String effectiveTime) {
		this.effectiveTime = effectiveTime;
	}

	public String getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public String getHeadline() {
		return this.headline;
	}
	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public String getOnsetTime() {
		return this.onsetTime;
	}
	public void setOnsetTime(String onsetTime) {
		this.onsetTime = onsetTime;
	}

}
