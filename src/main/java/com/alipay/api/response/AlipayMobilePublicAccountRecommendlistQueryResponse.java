package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PublicAccountInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.account.recommendlist.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayMobilePublicAccountRecommendlistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8465794356566884426L;

	/** 
	 * 服务窗推荐列表
	 */
	@ApiListField("app_account_infos")
	@ApiField("public_account_info")
	private List<PublicAccountInfo> appAccountInfos;

	/** 
	 * 200 成功 1001 无效参数
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 失败原因或者成功
	 */
	@ApiField("msg")
	private String msg;

	public void setAppAccountInfos(List<PublicAccountInfo> appAccountInfos) {
		this.appAccountInfos = appAccountInfos;
	}
	public List<PublicAccountInfo> getAppAccountInfos( ) {
		return this.appAccountInfos;
	}

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

}
