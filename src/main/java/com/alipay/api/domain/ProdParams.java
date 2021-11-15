package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签约产品属性
 *
 * @author auto create
 * @since 1.0, 2017-07-11 14:32:07
 */
public class ProdParams extends AlipayObject {

	private static final long serialVersionUID = 5327722231823572944L;

	/**
	 * 预授权业务信息
	 */
	@ApiField("auth_biz_params")
	private String authBizParams;

	public String getAuthBizParams() {
		return this.authBizParams;
	}
	public void setAuthBizParams(String authBizParams) {
		this.authBizParams = authBizParams;
	}

}
