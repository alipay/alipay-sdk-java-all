package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 妊娠史
 *
 * @author auto create
 * @since 1.0, 2025-11-03 15:32:13
 */
public class HDFGestationStr extends AlipayObject {

	private static final long serialVersionUID = 3724848156167393831L;

	/**
	 * 添加时间
	 */
	@ApiField("add_time")
	private String addTime;

	/**
	 * 预产期
	 */
	@ApiField("expected_date")
	private String expectedDate;

	/**
	 * 妊娠史描述
	 */
	@ApiField("gestation_str")
	private String gestationStr;

	/**
	 * 是否孕期（是/否)
	 */
	@ApiField("is_gestation")
	private String isGestation;

	public String getAddTime() {
		return this.addTime;
	}
	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}

	public String getExpectedDate() {
		return this.expectedDate;
	}
	public void setExpectedDate(String expectedDate) {
		this.expectedDate = expectedDate;
	}

	public String getGestationStr() {
		return this.gestationStr;
	}
	public void setGestationStr(String gestationStr) {
		this.gestationStr = gestationStr;
	}

	public String getIsGestation() {
		return this.isGestation;
	}
	public void setIsGestation(String isGestation) {
		this.isGestation = isGestation;
	}

}
