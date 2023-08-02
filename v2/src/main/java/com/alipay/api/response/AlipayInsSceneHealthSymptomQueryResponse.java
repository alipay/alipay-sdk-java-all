package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.HealthSymptom;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.health.symptom.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-07-20 14:57:02
 */
public class AlipayInsSceneHealthSymptomQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7386188877458788116L;

	/** 
	 * 症状列表
	 */
	@ApiListField("symptom_list")
	@ApiField("health_symptom")
	private List<HealthSymptom> symptomList;

	public void setSymptomList(List<HealthSymptom> symptomList) {
		this.symptomList = symptomList;
	}
	public List<HealthSymptom> getSymptomList( ) {
		return this.symptomList;
	}

}
