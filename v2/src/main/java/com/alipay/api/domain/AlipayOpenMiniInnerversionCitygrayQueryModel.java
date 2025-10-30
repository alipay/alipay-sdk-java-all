package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序城市灰度规则查询
 *
 * @author auto create
 * @since 1.0, 2023-02-14 16:28:11
 */
public class AlipayOpenMiniInnerversionCitygrayQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7146753934318895553L;

	/**
	 * 操作类型
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 来源类型，新接入方需要向支付宝申请专用来源，否则不予接入，申请方式请参见接入手册。
	 */
	@ApiField("app_origin")
	private String appOrigin;

	/**
	 * 端信息
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 城市名称
	 */
	@ApiField("city_name")
	private String cityName;

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getAppOrigin() {
		return this.appOrigin;
	}
	public void setAppOrigin(String appOrigin) {
		this.appOrigin = appOrigin;
	}

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

}
