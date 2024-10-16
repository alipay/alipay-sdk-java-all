package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝账号入驻开放平台有效性检查
 *
 * @author auto create
 * @since 1.0, 2022-09-19 11:03:58
 */
public class AlipayOpenAppDeveloperCheckdevelopervalidQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8144814583868949188L;

	/**
	 * 支付宝账号
	 */
	@ApiField("logon_id")
	private String logonId;

	public String getLogonId() {
		return this.logonId;
	}
	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

}
