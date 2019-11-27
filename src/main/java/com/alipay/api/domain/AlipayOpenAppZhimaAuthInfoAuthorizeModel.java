package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 页面授权接口
 *
 * @author auto create
 * @since 1.0, 2015-12-24 14:46:52
 */
public class AlipayOpenAppZhimaAuthInfoAuthorizeModel extends AlipayObject {

	private static final long serialVersionUID = 6196278256195665859L;

	/**
	 * 业务扩展字段，json字符串的key-value格式
	 */
	@ApiField("biz_params")
	private String bizParams;

	/**
	 * 不同身份类型的参数列表，json字符串的key-value格式：
如：identityType =0 identityParam ={"openId":"268801234567890123456"}如：identityType =1 identityParam ={"mobileNo":"13588888888"}
	 */
	@ApiField("identity_param")
	private String identityParam;

	/**
	 * 身份标识类型（后续可以扩展） 0：芝麻信用开放账号ID 1：按照手机号进行授权 2: 按照身份证+姓名进行授权
	 */
	@ApiField("identity_type")
	private String identityType;

	public String getBizParams() {
		return this.bizParams;
	}
	public void setBizParams(String bizParams) {
		this.bizParams = bizParams;
	}

	public String getIdentityParam() {
		return this.identityParam;
	}
	public void setIdentityParam(String identityParam) {
		this.identityParam = identityParam;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

}
