package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MedicalHealthArchiveOptDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.health.archive.save response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-17 17:47:25
 */
public class AlipayCommerceMedicalHealthArchiveSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 5569654285456549797L;

	/** 
	 * 结果数据
	 */
	@ApiField("data")
	private MedicalHealthArchiveOptDTO data;

	public void setData(MedicalHealthArchiveOptDTO data) {
		this.data = data;
	}
	public MedicalHealthArchiveOptDTO getData( ) {
		return this.data;
	}

}
