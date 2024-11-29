package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MedicalHealthArchiveOptDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.health.archive.delete response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-27 15:22:20
 */
public class AlipayCommerceMedicalHealthArchiveDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 6849314243462714659L;

	/** 
	 * 操作数据
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
