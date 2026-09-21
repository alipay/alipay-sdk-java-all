package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.item.upcexist.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-14 15:12:56
 */
public class AlipayCommerceMedicalItemUpcexistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4387442493544338683L;

	/** 
	 * null
	 */
	@ApiListField("upc_list")
	@ApiField("string")
	private List<String> upcList;

	public void setUpcList(List<String> upcList) {
		this.upcList = upcList;
	}
	public List<String> getUpcList( ) {
		return this.upcList;
	}

}
