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
 * @since 1.0, 2026-04-10 20:32:45
 */
public class AlipayCommerceMedicalPrescriptionListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1263737554452478362L;

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
