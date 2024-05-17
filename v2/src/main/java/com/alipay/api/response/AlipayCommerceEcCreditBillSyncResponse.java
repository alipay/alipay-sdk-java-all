package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.credit.bill.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-10 15:06:45
 */
public class AlipayCommerceEcCreditBillSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5165279695142385516L;

	/** 
	 * 结果
成功: SUCCESS
失败: FAIL
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
