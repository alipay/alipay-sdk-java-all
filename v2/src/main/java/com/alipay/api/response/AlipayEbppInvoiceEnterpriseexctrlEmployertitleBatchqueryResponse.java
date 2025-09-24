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
 * @since 1.0, 2025-08-18 14:02:35
 */
public class AlipayEbppInvoiceEnterpriseexctrlEmployertitleBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2414357233324748981L;

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

	public void setTitleCode(String titleCode) {
		this.titleCode = titleCode;
	}
	public String getTitleCode( ) {
		return this.titleCode;
	}

	public void setTitleInfoList(List<EnterpriseTitleInfo> titleInfoList) {
		this.titleInfoList = titleInfoList;
	}
	public List<EnterpriseTitleInfo> getTitleInfoList( ) {
		return this.titleInfoList;
	}

}
