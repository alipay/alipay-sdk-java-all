package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EnterpriseTitleInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.enterpriseexctrl.employertitle.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-18 14:02:35
 */
public class AlipayEbppInvoiceEnterpriseexctrlEmployertitleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4818388258693557342L;

	/** 
	 * 返回码
10000-成功
其他都是失败
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 返回消息
	 */
	@ApiField("msg")
	private String msg;

	/** 
	 * 抬头编码
	 */
	@ApiField("title_code")
	private String titleCode;

	/** 
	 * 企业抬头信息
	 */
	@ApiField("title_info")
	private EnterpriseTitleInfo titleInfo;

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

	public void setTitleCode(String titleCode) {
		this.titleCode = titleCode;
	}
	public String getTitleCode( ) {
		return this.titleCode;
	}

	public void setTitleInfo(EnterpriseTitleInfo titleInfo) {
		this.titleInfo = titleInfo;
	}
	public EnterpriseTitleInfo getTitleInfo( ) {
		return this.titleInfo;
	}

}
