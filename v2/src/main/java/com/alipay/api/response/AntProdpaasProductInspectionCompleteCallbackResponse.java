package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.prodpaas.product.inspection.complete.callback response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-15 16:27:39
 */
public class AntProdpaasProductInspectionCompleteCallbackResponse extends AlipayResponse {

	private static final long serialVersionUID = 8174695949558187822L;

	/** 
	 * 自检单据编号
	 */
	@ApiField("quality_inspection_no")
	private String qualityInspectionNo;

	public void setQualityInspectionNo(String qualityInspectionNo) {
		this.qualityInspectionNo = qualityInspectionNo;
	}
	public String getQualityInspectionNo( ) {
		return this.qualityInspectionNo;
	}

}
