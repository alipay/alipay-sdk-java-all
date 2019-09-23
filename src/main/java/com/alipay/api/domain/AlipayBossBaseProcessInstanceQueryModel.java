package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询流程实例
 *
 * @author auto create
 * @since 1.0, 2019-09-06 15:00:11
 */
public class AlipayBossBaseProcessInstanceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4245932237234462781L;

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
