package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.report.categorytext.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-22 11:42:57
 */
public class AlipayCommerceMedicalReportCategorytextQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6611548581337377637L;

	/** 
	 * null
	 */
	@ApiListField("texts")
	@ApiField("string")
	private List<String> texts;

	public void setTexts(List<String> texts) {
		this.texts = texts;
	}
	public List<String> getTexts( ) {
		return this.texts;
	}

}
