package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家生活号信息查询
 *
 * @author auto create
 * @since 1.0, 2019-07-12 15:32:57
 */
public class AlipayOpenPublicAppSummaryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7734628727167972588L;

	/**
	 * 登录ID，需要跟登录类别（logon_type，EMAIL:邮箱登陆 MOBILE:手机登录）结合
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
