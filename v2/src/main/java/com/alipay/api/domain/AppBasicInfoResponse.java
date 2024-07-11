package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 应用的基础信息
 *
 * @author auto create
 * @since 1.0, 2019-07-26 17:25:05
 */
public class AppBasicInfoResponse extends AlipayObject {

	private static final long serialVersionUID = 3174778252571896218L;

	/**
	 * 应用id
	 */
	@ApiField("open_app_id")
	private String openAppId;

	/**
	 * 应用的名称
	 */
	@ApiField("open_app_name")
	private String openAppName;

	/**
	 * 应用类型
	 */
	@ApiField("open_app_type")
	private String openAppType;

	public String getOpenAppId() {
		return this.openAppId;
	}
	public void setOpenAppId(String openAppId) {
		this.openAppId = openAppId;
	}

	public String getOpenAppName() {
		return this.openAppName;
	}
	public void setOpenAppName(String openAppName) {
		this.openAppName = openAppName;
	}

	public String getOpenAppType() {
		return this.openAppType;
	}
	public void setOpenAppType(String openAppType) {
		this.openAppType = openAppType;
	}

}
