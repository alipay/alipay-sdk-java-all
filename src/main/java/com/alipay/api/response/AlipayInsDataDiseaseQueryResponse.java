package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DiseaseDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.data.disease.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 01:41:15
 */
public class AlipayInsDataDiseaseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5537555478732683847L;

	/** 
	 * 匹配的疾病
	 */
	@ApiListField("disease_list")
	@ApiField("disease_d_t_o")
	private List<DiseaseDTO> diseaseList;

	public void setDiseaseList(List<DiseaseDTO> diseaseList) {
		this.diseaseList = diseaseList;
	}
	public List<DiseaseDTO> getDiseaseList( ) {
		return this.diseaseList;
	}

}
