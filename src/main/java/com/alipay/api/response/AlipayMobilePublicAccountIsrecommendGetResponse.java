package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.account.isrecommend.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayMobilePublicAccountIsrecommendGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8273947973523727874L;

	/** 
	 * 200 成功 1001 无效参数
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 是否需要公众号推荐
	 */
	@ApiField("is_need_recommand")
	private Boolean isNeedRecommand;

	/** 
	 * 失败原因或者成功
	 */
	@ApiField("msg")
	private String msg;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setIsNeedRecommand(Boolean isNeedRecommand) {
		this.isNeedRecommand = isNeedRecommand;
	}
	public Boolean getIsNeedRecommand( ) {
		return this.isNeedRecommand;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

}
