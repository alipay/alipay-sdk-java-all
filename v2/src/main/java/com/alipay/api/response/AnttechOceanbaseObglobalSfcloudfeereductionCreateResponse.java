package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SaleForceCouponCreateResponseDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obglobal.sfcloudfeereduction.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-17 21:07:49
 */
public class AnttechOceanbaseObglobalSfcloudfeereductionCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2185391287157266145L;

	/** 
	 * 结果对象
	 */
	@ApiField("result")
	private SaleForceCouponCreateResponseDTO result;

	public void setResult(SaleForceCouponCreateResponseDTO result) {
		this.result = result;
	}
	public SaleForceCouponCreateResponseDTO getResult( ) {
		return this.result;
	}

}
