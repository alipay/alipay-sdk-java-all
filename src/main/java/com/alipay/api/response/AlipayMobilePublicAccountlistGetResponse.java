package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.accountlist.get response.
 * 
 * @author auto create
 * @since 1.0, 2020-04-02 16:28:22
 */
public class AlipayMobilePublicAccountlistGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5688388539473273216L;

	/** 
	 * 服务窗列表
	 */
	@ApiField("account_list")
	private String accountList;

	/** 
	 * 响应码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 服务窗列表总数
	 */
	@ApiField("count")
	private Long count;

	/** 
	 * 结果描述
	 */
	@ApiField("msg")
	private String msg;

	public void setAccountList(String accountList) {
		this.accountList = accountList;
	}
	public String getAccountList( ) {
		return this.accountList;
	}

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setCount(Long count) {
		this.count = count;
	}
	public Long getCount( ) {
		return this.count;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

}
