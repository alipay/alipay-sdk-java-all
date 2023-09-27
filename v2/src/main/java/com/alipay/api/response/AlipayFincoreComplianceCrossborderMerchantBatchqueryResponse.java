package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.crossborder.merchant.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 21:32:14
 */
public class AlipayFincoreComplianceCrossborderMerchantBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1323453975375534184L;

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
