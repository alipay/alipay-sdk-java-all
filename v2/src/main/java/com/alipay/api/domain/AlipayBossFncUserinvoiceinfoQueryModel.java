package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据PID获取相关的开票资料
 *
 * @author auto create
 * @since 1.0, 2024-01-22 09:39:28
 */
public class AlipayBossFncUserinvoiceinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5137797227144657698L;

	/**
	 * 开票pid/mid/ou，唯一标识商户信息/集团用户信息的ID
	 */
	@ApiField("pid")
	private String pid;

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

}
