package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询支付宝账号基础信息
 *
 * @author auto create
 * @since 1.0, 2022-08-22 17:11:36
 */
public class AlipayOpenMiniUserinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1817969812266416558L;

	/**
	 * 支付宝账号
	 */
	@ApiField("logonid")
	private String logonid;

	public String getLogonid() {
		return this.logonid;
	}
	public void setLogonid(String logonid) {
		this.logonid = logonid;
	}

}
