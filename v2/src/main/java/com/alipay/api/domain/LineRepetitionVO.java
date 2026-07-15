package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 线路重复度对象返回值
 *
 * @author auto create
 * @since 1.0, 2026-07-06 11:40:49
 */
public class LineRepetitionVO extends AlipayObject {

	private static final long serialVersionUID = 7841763235771355479L;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 线路重复度日期
	 */
	@ApiField("dt")
	private Date dt;

	/**
	 * 线路key
	 */
	@ApiField("line_key")
	private String lineKey;

	/**
	 * 重复度数据,单位:次
	 */
	@ApiField("repetition")
	private String repetition;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public Date getDt() {
		return this.dt;
	}
	public void setDt(Date dt) {
		this.dt = dt;
	}

	public String getLineKey() {
		return this.lineKey;
	}
	public void setLineKey(String lineKey) {
		this.lineKey = lineKey;
	}

	public String getRepetition() {
		return this.repetition;
	}
	public void setRepetition(String repetition) {
		this.repetition = repetition;
	}

}
