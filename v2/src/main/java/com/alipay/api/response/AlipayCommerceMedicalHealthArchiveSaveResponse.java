package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MedicalHealthArchiveOptDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.health.archive.save response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-27 15:22:20
 */
public class AlipayCommerceMedicalHealthArchiveSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 8454965731731179265L;

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
