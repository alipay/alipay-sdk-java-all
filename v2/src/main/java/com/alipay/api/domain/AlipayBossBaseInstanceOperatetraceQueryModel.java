package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询流程实例操作记录
 *
 * @author auto create
 * @since 1.0, 2024-07-30 11:36:16
 */
public class AlipayBossBaseInstanceOperatetraceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5243926939926645276L;

	/**
	 * 流程实例全局唯一ID
	 */
	@ApiField("puid")
	private String puid;

	public String getPuid() {
		return this.puid;
	}
	public void setPuid(String puid) {
		this.puid = puid;
	}

}
