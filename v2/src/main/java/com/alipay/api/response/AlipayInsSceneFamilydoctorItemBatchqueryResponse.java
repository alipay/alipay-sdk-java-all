package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.HealthServiceFamilyDoctorDrugDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.familydoctor.item.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 23:02:41
 */
public class AlipayInsSceneFamilydoctorItemBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2467199174415832246L;

	/** 
	 * 药品列表
	 */
	@ApiListField("drugs")
	@ApiField("health_service_family_doctor_drug_d_t_o")
	private List<HealthServiceFamilyDoctorDrugDTO> drugs;

	public void setDrugs(List<HealthServiceFamilyDoctorDrugDTO> drugs) {
		this.drugs = drugs;
	}
	public List<HealthServiceFamilyDoctorDrugDTO> getDrugs( ) {
		return this.drugs;
	}

}
