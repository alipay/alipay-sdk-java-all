package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.Qualification;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.qualification.consult response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-15 21:29:22
 */
public class AlipayMarketingQualificationConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 8747367849546713974L;

	/** 
	 * null
	 */
	@ApiListField("qualifications")
	@ApiField("qualification")
	private List<Qualification> qualifications;

	public void setQualifications(List<Qualification> qualifications) {
		this.qualifications = qualifications;
	}
	public List<Qualification> getQualifications( ) {
		return this.qualifications;
	}

}
