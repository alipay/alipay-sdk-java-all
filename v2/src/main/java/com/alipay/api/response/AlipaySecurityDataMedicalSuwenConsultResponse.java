package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RcMedConsultResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.data.medical.suwen.consult response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-23 16:37:34
 */
public class AlipaySecurityDataMedicalSuwenConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 4554758222641296754L;

	/** 
	 * 素问医疗信息咨询结果列表
	 */
	@ApiListField("consult_result_list")
	@ApiField("rc_med_consult_result")
	private List<RcMedConsultResult> consultResultList;

	public void setConsultResultList(List<RcMedConsultResult> consultResultList) {
		this.consultResultList = consultResultList;
	}
	public List<RcMedConsultResult> getConsultResultList( ) {
		return this.consultResultList;
	}

}
