package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 配制结果返回
 *
 * @author auto create
 * @since 1.0, 2020-03-02 16:19:31
 */
public class ScheduleConfigItem extends AlipayObject {

	private static final long serialVersionUID = 4849255826265976966L;

	/**
	 * 配制名称
	 */
	@ApiField("config_name")
	private String configName;

	/**
	 * 日期列表
	 */
	@ApiField("date")
	private String date;

	/**
	 * id
	 */
	@ApiField("id")
	private String id;

	public String getConfigName() {
		return this.configName;
	}
	public void setConfigName(String configName) {
		this.configName = configName;
	}

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
