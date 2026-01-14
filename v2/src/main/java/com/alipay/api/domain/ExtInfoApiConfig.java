package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 拓展字段，规定具体的key进行传入
 *
 * @author auto create
 * @since 1.0, 2024-10-23 14:57:19
 */
public class ExtInfoApiConfig extends AlipayObject {

	private static final long serialVersionUID = 7172365317344383981L;

	/**
	 * 经营的小程序id
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 主体Pid，用于更新时传入 当前字段已废弃(本字段在接口中已同步到上一层)
	 */
	@ApiField("sub_pid")
	@Deprecated
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
