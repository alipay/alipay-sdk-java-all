package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改存储权限
 *
 * @author auto create
 * @since 1.0, 2023-09-18 13:37:48
 */
public class AlipayCloudCloudrunObjectstoragePermissionModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6274724555916875695L;

	/**
	 * 环境ID，唯一，开通小程序云系统会生成环境ID，请从开通页面获取
	 */
	@ApiField("env")
	private String env;

	/**
	 * 实例的读权限
	 */
	@ApiField("read_permission")
	private String readPermission;

	public String getEnv() {
		return this.env;
	}
	public void setEnv(String env) {
		this.env = env;
	}

	public String getReadPermission() {
		return this.readPermission;
	}
	public void setReadPermission(String readPermission) {
		this.readPermission = readPermission;
	}

}
