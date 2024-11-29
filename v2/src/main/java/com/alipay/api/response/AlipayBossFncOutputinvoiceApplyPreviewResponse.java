package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiInvoiceMixInfoVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.outputinvoice.apply.preview response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-12 10:27:09
 */
public class AlipayBossFncOutputinvoiceApplyPreviewResponse extends AlipayResponse {

	private static final long serialVersionUID = 8376194544865919378L;

	/** 
	 * openApi预览发票混合信息
	 */
	@ApiField("result_set")
	private OpenApiInvoiceMixInfoVO resultSet;

	public void setResultSet(OpenApiInvoiceMixInfoVO resultSet) {
		this.resultSet = resultSet;
	}
	public OpenApiInvoiceMixInfoVO getResultSet( ) {
		return this.resultSet;
	}

}
