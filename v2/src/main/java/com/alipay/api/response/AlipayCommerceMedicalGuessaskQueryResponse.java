package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.guessask.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-08 14:07:41
 */
public class AlipayCommerceMedicalGuessaskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8254271682138212559L;

	/** 
	 * null
	 */
	@ApiListField("diseases")
	@ApiField("string")
	private List<String> diseases;

	public void setDiseases(List<String> diseases) {
		this.diseases = diseases;
	}
	public List<String> getDiseases( ) {
		return this.diseases;
	}

}
