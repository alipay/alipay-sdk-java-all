package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PrscVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.prescription.list.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-17 15:37:32
 */
public class AlipayCommerceMedicalPrescriptionListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2272411392718682456L;

	/** 
	 * 处方信息合集
	 */
	@ApiListField("prsc_list")
	@ApiField("prsc_v_o")
	private List<PrscVO> prscList;

	public void setPrscList(List<PrscVO> prscList) {
		this.prscList = prscList;
	}
	public List<PrscVO> getPrscList( ) {
		return this.prscList;
	}

}
