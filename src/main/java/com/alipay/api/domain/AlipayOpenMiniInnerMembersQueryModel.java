package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内部链路查询开发成员
 *
 * @author auto create
 * @since 1.0, 2022-09-05 11:02:35
 */
public class AlipayOpenMiniInnerMembersQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5778488546157189215L;

	/**
	 * 业务来源
	 */
	@ApiField("app_origin")
	private String appOrigin;

	/**
	 * 业务小程序id
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	public String getAppOrigin() {
		return this.appOrigin;
	}
	public void setAppOrigin(String appOrigin) {
		this.appOrigin = appOrigin;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

}
