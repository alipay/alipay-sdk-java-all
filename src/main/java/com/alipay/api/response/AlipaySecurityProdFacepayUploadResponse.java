package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.facepay.upload response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipaySecurityProdFacepayUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 1272662632595781529L;

	/** 
	 * 人脸支付token。即商户在本接口提交的用户人脸图片对应的token，通过此token串联后续调用
	 */
	@ApiField("ftoken")
	private String ftoken;

	/** 
	 * 用户标识提示。例如提示用户输入手机号时，可返回用户手机号的前7位。当此项为空时，说明在热点人脸库中没有搜索成功，需要用户填写其标识的全部位；当此项不为空时，说明在热点人脸库中成功匹配，客户端需要给用户展示标识提示位，由用户补全剩余位
	 */
	@ApiField("user_auth_id_hint")
	private String userAuthIdHint;

	/** 
	 * 用户标识类型。目前支持手机号码，即mobile
	 */
	@ApiField("user_auth_id_type")
	private String userAuthIdType;

	public void setFtoken(String ftoken) {
		this.ftoken = ftoken;
	}
	public String getFtoken( ) {
		return this.ftoken;
	}

	public void setUserAuthIdHint(String userAuthIdHint) {
		this.userAuthIdHint = userAuthIdHint;
	}
	public String getUserAuthIdHint( ) {
		return this.userAuthIdHint;
	}

	public void setUserAuthIdType(String userAuthIdType) {
		this.userAuthIdType = userAuthIdType;
	}
	public String getUserAuthIdType( ) {
		return this.userAuthIdType;
	}

}
