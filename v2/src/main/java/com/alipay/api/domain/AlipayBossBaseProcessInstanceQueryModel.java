package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询流程实例
 *
 * @author auto create
 * @since 1.0, 2024-07-30 11:36:28
 */
public class AlipayBossBaseProcessInstanceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1164266584917714384L;

	/**
	 * 流程全局唯一ID
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
