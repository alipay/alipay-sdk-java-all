package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务扩展
 *
 * @author auto create
 * @since 1.0, 2020-02-21 13:32:47
 */
public class ExtendInfos extends AlipayObject {

	private static final long serialVersionUID = 8722731145853319386L;

	/**
	 * isv_pid
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
