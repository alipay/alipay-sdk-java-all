package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询流程实例操作记录
 *
 * @author auto create
 * @since 1.0, 2025-03-20 16:43:21
 */
public class AlipayBossBaseInstanceOperatetraceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7785319271777377778L;

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
