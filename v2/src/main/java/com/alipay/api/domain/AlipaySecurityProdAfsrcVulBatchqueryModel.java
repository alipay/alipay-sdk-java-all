package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 白帽子漏洞批量查询接口
 *
 * @author auto create
 * @since 1.0, 2022-09-29 11:44:18
 */
public class AlipaySecurityProdAfsrcVulBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6498375534864127823L;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
