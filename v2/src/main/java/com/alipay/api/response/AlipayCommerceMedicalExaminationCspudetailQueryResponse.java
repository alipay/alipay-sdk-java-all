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
 * @since 1.0, 2026-04-23 16:12:45
 */
public class AlipayCommerceMedicalExaminationCspudetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6377671275787863133L;

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
