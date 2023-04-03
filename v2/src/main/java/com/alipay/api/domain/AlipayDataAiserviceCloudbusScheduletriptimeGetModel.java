package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 排班调度-单程时间获取接口
 *
 * @author auto create
 * @since 1.0, 2020-10-21 10:33:47
 */
public class AlipayDataAiserviceCloudbusScheduletriptimeGetModel extends AlipayObject {

	private static final long serialVersionUID = 8441224899432398471L;

	/**
	 * mean/max/pert_95
	 */
	@ApiField("aggregate_type")
	private String aggregateType;

	/**
	 * 接口版本
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 市
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 配制id
	 */
	@ApiField("config_id")
	private String configId;

	/**
	 * 公交公司id
	 */
	@ApiField("corp_id")
	private String corpId;

	/**
	 * 5/10/15/20/30/60   Long 时间粒度(单位分钟)
	 */
	@ApiField("time_span")
	private Long timeSpan;

	public String getAggregateType() {
		return this.aggregateType;
	}
	public void setAggregateType(String aggregateType) {
		this.aggregateType = aggregateType;
	}

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

	public String getConfigId() {
		return this.configId;
	}
	public void setConfigId(String configId) {
		this.configId = configId;
	}

	public String getCorpId() {
		return this.corpId;
	}
	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public Long getTimeSpan() {
		return this.timeSpan;
	}
	public void setTimeSpan(Long timeSpan) {
		this.timeSpan = timeSpan;
	}

}
