package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MedicalServiceMagaDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.service.maga.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-28 10:40:59
 */
public class AlipayCommerceMedicalServiceMagaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3899197666286733411L;

	/** 
	 * 服务投放数据实体
	 */
	@ApiField("data")
	private MedicalServiceMagaDTO data;

	public void setData(MedicalServiceMagaDTO data) {
		this.data = data;
	}
	public MedicalServiceMagaDTO getData( ) {
		return this.data;
	}

}
