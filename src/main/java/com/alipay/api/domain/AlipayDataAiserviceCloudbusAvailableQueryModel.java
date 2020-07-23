package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询可用公交od月份
 *
 * @author auto create
 * @since 1.0, 2019-08-07 17:11:24
 */
public class AlipayDataAiserviceCloudbusAvailableQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5838381685119487456L;

	/**
	 * 内部服务接口版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 市
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

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

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

}
