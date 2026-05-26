package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ExaminationSpuInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.examination.cspudetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-20 21:02:50
 */
public class AlipayCommerceMedicalExaminationCspudetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7557622212532988117L;

	/** 
	 * null
	 */
	@ApiListField("spu_info_list")
	@ApiField("examination_spu_info")
	private List<ExaminationSpuInfo> spuInfoList;

	public void setSpuInfoList(List<ExaminationSpuInfo> spuInfoList) {
		this.spuInfoList = spuInfoList;
	}
	public List<ExaminationSpuInfo> getSpuInfoList( ) {
		return this.spuInfoList;
	}

}
