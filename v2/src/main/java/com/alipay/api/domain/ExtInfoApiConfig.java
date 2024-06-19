package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 拓展字段，规定具体的key进行传入
 *
 * @author auto create
 * @since 1.0, 2024-03-11 15:17:02
 */
public class ExtInfoApiConfig extends AlipayObject {

	private static final long serialVersionUID = 4847399358996763767L;

	/**
	 * 经营的小程序id
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 主体Pid
	 */
	@ApiField("sub_pid")
	private String subPid;

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getSubPid() {
		return this.subPid;
	}
	public void setSubPid(String subPid) {
		this.subPid = subPid;
	}

}
