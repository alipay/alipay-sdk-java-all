package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询流程实例所有的任务列表
 *
 * @author auto create
 * @since 1.0, 2022-10-18 19:30:11
 */
public class AlipayBossBaseProcessTicketQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3712321427631758888L;

	/**
	 * 流程实例Id
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
