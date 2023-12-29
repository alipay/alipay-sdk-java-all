package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 排班调度任务列表查询
 *
 * @author auto create
 * @since 1.0, 2020-10-21 10:36:49
 */
public class AlipayDataAiserviceCloudbusScheduletasklistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4135114934467595582L;

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
	 * 公交公司id
	 */
	@ApiField("corp_id")
	private String corpId;

	/**
	 * 任务类型： 枚举： 0：客流接口  1： 时刻表接口 2：排班接口 3：轮班接口
	 */
	@ApiField("type")
	private Long type;

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

	public String getCorpId() {
		return this.corpId;
	}
	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public Long getType() {
		return this.type;
	}
	public void setType(Long type) {
		this.type = type;
	}

}
