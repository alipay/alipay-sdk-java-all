package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.insurance.fulfillmenttransit.save response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-04 11:22:25
 */
public class AlipayCommerceMedicalInsuranceFulfillmenttransitSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 4438452558626322657L;

	/** 
	 * null
	 */
	@ApiListField("fail_list")
	@ApiField("string")
	private List<String> failList;

	/** 
	 * null
	 */
	@ApiListField("succ_list")
	@ApiField("string")
	private List<String> succList;

	public void setFailList(List<String> failList) {
		this.failList = failList;
	}
	public List<String> getFailList( ) {
		return this.failList;
	}

	public void setSuccList(List<String> succList) {
		this.succList = succList;
	}
	public List<String> getSuccList( ) {
		return this.succList;
	}

}
