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
 * @since 1.0, 2023-05-29 20:27:12
 */
public class AlipayInsDataDiseaseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2525392988999875821L;

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
