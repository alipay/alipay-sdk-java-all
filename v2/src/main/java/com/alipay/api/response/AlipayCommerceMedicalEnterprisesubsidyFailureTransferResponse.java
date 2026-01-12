package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.enterprisesubsidy.failure.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-04 10:42:36
 */
public class AlipayCommerceMedicalEnterprisesubsidyFailureTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 7361353183181194383L;

	/** 
	 * 不代表转账成功/失败，转账最终结果通过【同步转账结果】接口告知
	 */
	@ApiField("data")
	private Boolean data;

	public void setData(Boolean data) {
		this.data = data;
	}
	public Boolean getData( ) {
		return this.data;
	}

}
