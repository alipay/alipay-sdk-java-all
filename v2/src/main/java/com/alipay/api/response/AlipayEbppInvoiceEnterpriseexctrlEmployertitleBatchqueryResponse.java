package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EnterpriseTitleInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.enterpriseexctrl.employertitle.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-24 19:37:26
 */
public class AlipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3887172749898773548L;

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
	 * 企业抬头信息
	 */
	@ApiListField("title_info_list")
	@ApiField("enterprise_title_info")
	private List<EnterpriseTitleInfo> titleInfoList;

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

	public void setTitleInfoList(List<EnterpriseTitleInfo> titleInfoList) {
		this.titleInfoList = titleInfoList;
	}
	public List<EnterpriseTitleInfo> getTitleInfoList( ) {
		return this.titleInfoList;
	}

}
