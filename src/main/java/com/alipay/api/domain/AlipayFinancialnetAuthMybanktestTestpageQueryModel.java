package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询支付宝用户鉴权信息
 *
 * @author auto create
 * @since 1.0, 2019-04-26 19:00:00
 */
public class AlipayFinancialnetAuthMybanktestTestpageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7326432385751755928L;

	/**
	 * 姓名
	 */
	@ApiField("user_name")
	private String userName;

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
