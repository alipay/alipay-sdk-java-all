package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询流程实例
 *
 * @author auto create
 * @since 1.0, 2021-08-26 10:03:09
 */
public class AlipayBossBaseProcessInstanceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5227151697116746431L;

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
