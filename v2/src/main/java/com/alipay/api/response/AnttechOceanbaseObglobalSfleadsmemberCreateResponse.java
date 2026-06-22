package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SaleForceLeadsMemberCreateDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obglobal.sfleadsmember.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-15 16:12:46
 */
public class AnttechOceanbaseObglobalSfleadsmemberCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3565925617841335797L;

	/** 
	 * 响应结果
	 */
	@ApiField("result")
	private SaleForceLeadsMemberCreateDTO result;

	public void setResult(SaleForceLeadsMemberCreateDTO result) {
		this.result = result;
	}
	public SaleForceLeadsMemberCreateDTO getResult( ) {
		return this.result;
	}

}
