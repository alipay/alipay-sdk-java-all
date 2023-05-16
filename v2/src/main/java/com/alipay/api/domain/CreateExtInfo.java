package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数据查询任务创建的拓展字段
 *
 * @author auto create
 * @since 1.0, 2023-03-17 12:49:34
 */
public class CreateExtInfo extends AlipayObject {

	private static final long serialVersionUID = 3777387662484995595L;

	/**
	 * 信用等级无授权场景
	 */
	@ApiField("cr_no_auth")
	private CreditRateNoAuth crNoAuth;

	/**
	 * 信用等级部分授权场景
	 */
	@ApiField("cr_partial_auth")
	private CreditRatePartialAuth crPartialAuth;

	public CreditRateNoAuth getCrNoAuth() {
		return this.crNoAuth;
	}
	public void setCrNoAuth(CreditRateNoAuth crNoAuth) {
		this.crNoAuth = crNoAuth;
	}

	public CreditRatePartialAuth getCrPartialAuth() {
		return this.crPartialAuth;
	}
	public void setCrPartialAuth(CreditRatePartialAuth crPartialAuth) {
		this.crPartialAuth = crPartialAuth;
	}

}
