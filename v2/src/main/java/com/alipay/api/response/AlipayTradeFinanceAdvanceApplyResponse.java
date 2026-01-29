package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.finance.advance.apply response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-23 09:52:41
 */
public class AlipayTradeFinanceAdvanceApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6255286945813484788L;

	/** 
	 * 扩展字段用于返回资金机构（例如保司等）的单号
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 处理结果，如果是ACCEPT_SUCCESS，表示系统受理成功 异步处理中，需要接入垫资结果通知消息
	 */
	@ApiField("result_code")
	private String resultCode;

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

}
