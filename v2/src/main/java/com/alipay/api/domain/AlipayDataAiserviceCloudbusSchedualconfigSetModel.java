package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 排班调度配制接口
 *
 * @author auto create
 * @since 1.0, 2020-10-21 10:36:43
 */
public class AlipayDataAiserviceCloudbusSchedualconfigSetModel extends AlipayObject {

	private static final long serialVersionUID = 4523766981393639262L;

	/**
	 * 接口版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 市
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 配制名称
	 */
	@ApiField("config_name")
	private String configName;

	/**
	 * 公交公司id
	 */
	@ApiField("corp_id")
	private String corpId;

	/**
	 * 日期列表
	 */
	@ApiListField("date")
	@ApiField("string")
	private List<String> date;

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getConfigName() {
		return this.configName;
	}
	public void setConfigName(String configName) {
		this.configName = configName;
	}

	public String getCorpId() {
		return this.corpId;
	}
	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public List<String> getDate() {
		return this.date;
	}
	public void setDate(List<String> date) {
		this.date = date;
	}

}
