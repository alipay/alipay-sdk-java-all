package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CorsSetting;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.staticsite.cors.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-14 15:02:54
 */
public class AlipayCloudCloudrunStaticsiteCorsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7131277544616749974L;

	/** 
	 * 跨域配置
	 */
	@ApiField("cors")
	private CorsSetting cors;

	public void setCors(CorsSetting cors) {
		this.cors = cors;
	}
	public CorsSetting getCors( ) {
		return this.cors;
	}

}
