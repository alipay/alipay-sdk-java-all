package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.crossborder.merchant.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 00:31:41
 */
public class AlipayFincoreComplianceCrossborderMerchantBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5438222211264362581L;

	/** 
	 * 处理结果文字说明
	 */
	@ApiField("memo")
	private String memo;

	/** 
	 * out_biz_no
	 */
	@ApiField("result")
	private String result;

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo( ) {
		return this.memo;
	}

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
