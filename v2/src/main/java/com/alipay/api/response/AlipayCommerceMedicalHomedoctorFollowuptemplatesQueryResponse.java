package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TemplateInfoResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.homedoctor.followuptemplates.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-14 14:17:49
 */
public class AlipayCommerceMedicalHomedoctorFollowuptemplatesQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4667458511193481234L;

	/** 
	 * null
	 */
	@ApiListField("template_list")
	@ApiField("template_info_response")
	private List<TemplateInfoResponse> templateList;

	public void setTemplateList(List<TemplateInfoResponse> templateList) {
		this.templateList = templateList;
	}
	public List<TemplateInfoResponse> getTemplateList( ) {
		return this.templateList;
	}

}
