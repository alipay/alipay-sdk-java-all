package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.open.red.create response.
 * 
 * @author auto create
 * @since 1.0, 2020-07-10 21:12:55
 */
public class AlipayEbppInvoiceOpenRedCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6121876888575931714L;

	/** 
	 * 发票生成的开票申请流水id，查询开票结果使用改值
	 */
	@ApiField("apply_id")
	private String applyId;

	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}
	public String getApplyId( ) {
		return this.applyId;
	}

}
