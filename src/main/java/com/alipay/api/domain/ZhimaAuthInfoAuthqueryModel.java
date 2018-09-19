package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询是否授权的接口
 *
 * @author auto create
 * @since 1.0, 2017-10-19 18:38:54
 */
public class ZhimaAuthInfoAuthqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7353178424359334318L;

	/**
	 * json格式的内容,包含userId,userId为支付宝用户id,用户授权后商户可以拿到这个支付宝userId
	 */
	@ApiField("identity_param")
	private String identityParam;

	public String getIdentityParam() {
		return this.identityParam;
	}
	public void setIdentityParam(String identityParam) {
		this.identityParam = identityParam;
	}

}
