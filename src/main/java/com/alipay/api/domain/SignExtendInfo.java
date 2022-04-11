package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻Go页面签约扩展字段
 *
 * @author auto create
 * @since 1.0, 2021-02-24 16:56:34
 */
public class SignExtendInfo extends AlipayObject {

	private static final long serialVersionUID = 1115965598265745264L;

	/**
	 * isv 商户id
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 场景
	 */
	@ApiField("scene")
	private String scene;

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
