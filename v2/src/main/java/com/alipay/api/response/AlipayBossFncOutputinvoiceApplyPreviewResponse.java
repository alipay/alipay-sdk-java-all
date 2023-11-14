package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiInvoiceMixInfoVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.outputinvoice.apply.preview response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-12 20:46:45
 */
public class AlipayBossFncOutputinvoiceApplyPreviewResponse extends AlipayResponse {

	private static final long serialVersionUID = 7196855898128139614L;

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
