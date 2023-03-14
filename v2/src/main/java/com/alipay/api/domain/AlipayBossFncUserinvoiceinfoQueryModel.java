package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据PID获取相关的开票资料
 *
 * @author auto create
 * @since 1.0, 2022-12-13 11:27:06
 */
public class AlipayBossFncUserinvoiceinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7288175155737973927L;

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
