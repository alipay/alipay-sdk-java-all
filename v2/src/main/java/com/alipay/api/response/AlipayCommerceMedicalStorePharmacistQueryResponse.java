package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PharmacistVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.store.pharmacist.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-16 10:37:30
 */
public class AlipayCommerceMedicalStorePharmacistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1317552932928517339L;

	/** 
	 * 药师信息列表
	 */
	@ApiListField("pharmacists")
	@ApiField("pharmacist_v_o")
	private List<PharmacistVO> pharmacists;

	/** 
	 * 门店药师总数
	 */
	@ApiField("total")
	private Long total;

	public void setPharmacists(List<PharmacistVO> pharmacists) {
		this.pharmacists = pharmacists;
	}
	public List<PharmacistVO> getPharmacists( ) {
		return this.pharmacists;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
