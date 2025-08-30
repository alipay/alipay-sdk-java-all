package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数据查询任务创建的拓展字段
 *
 * @author auto create
 * @since 1.0, 2023-07-17 11:26:52
 */
public class CreateExtInfo extends AlipayObject {

	private static final long serialVersionUID = 1619758995667722481L;

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

	/**
	 * 豆沙包信息
	 */
	@ApiField("dowsure")
	private Dowsure dowsure;

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

	public Dowsure getDowsure() {
		return this.dowsure;
	}
	public void setDowsure(Dowsure dowsure) {
		this.dowsure = dowsure;
	}

}
