package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-29 17:52:53
 */
public class MedicalHmDailySleepRecord extends AlipayObject {

	private static final long serialVersionUID = 3172773199146863937L;

	/**
	 * 睡眠数据类型
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 睡眠日期yyyyMMdd
	 */
	@ApiField("sleep_date")
	private String sleepDate;

	/**
	 * 睡眠数据集合
	 */
	@ApiField("sleepdata")
	private String sleepdata;

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getSleepDate() {
		return this.sleepDate;
	}
	public void setSleepDate(String sleepDate) {
		this.sleepDate = sleepDate;
	}

	public String getSleepdata() {
		return this.sleepdata;
	}
	public void setSleepdata(String sleepdata) {
		this.sleepdata = sleepdata;
	}

}
