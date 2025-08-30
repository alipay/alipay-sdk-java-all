package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询应用的基本信息
 *
 * @author auto create
 * @since 1.0, 2021-06-01 14:33:20
 */
public class AlipayOpenMiniAppinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7158336833586361258L;

	/**
	 * 登录ID
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 应用类型（MINIAPP-小程序，LIEFAPP-生活号）
	 */
	@ApiField("open_app_type")
	private String openAppType;

	public String getLogonId() {
		return this.logonId;
	}
	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

	public String getOpenAppType() {
		return this.openAppType;
	}
	public void setOpenAppType(String openAppType) {
		this.openAppType = openAppType;
	}

}
