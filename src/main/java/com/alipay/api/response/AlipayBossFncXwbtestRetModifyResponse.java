package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.XwbTestData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.xwbtest.ret.modify response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayBossFncXwbtestRetModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1793864848919375575L;

	/** 
	 * 1
	 */
	@ApiListField("complex_id")
	@ApiField("xwb_test_data")
	private List<XwbTestData> complexId;

	/** 
	 * 1
	 */
	@ApiField("wb")
	private String wb;

	public void setComplexId(List<XwbTestData> complexId) {
		this.complexId = complexId;
	}
	public List<XwbTestData> getComplexId( ) {
		return this.complexId;
	}

	public void setWb(String wb) {
		this.wb = wb;
	}
	public String getWb( ) {
		return this.wb;
	}

}
