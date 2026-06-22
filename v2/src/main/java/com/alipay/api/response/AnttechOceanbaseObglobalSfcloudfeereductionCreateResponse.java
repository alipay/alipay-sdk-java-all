package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SaleForceCouponCreateResponseDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obglobal.sfcloudfeereduction.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-15 19:12:55
 */
public class AnttechOceanbaseObglobalSfcloudfeereductionCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1615327973745917333L;

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
