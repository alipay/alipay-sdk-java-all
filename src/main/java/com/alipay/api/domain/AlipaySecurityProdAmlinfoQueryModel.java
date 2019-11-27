package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 反洗钱风险标签数据服务输出
 *
 * @author auto create
 * @since 1.0, 2019-03-08 00:55:47
 */
public class AlipaySecurityProdAmlinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6469649374288649844L;

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
