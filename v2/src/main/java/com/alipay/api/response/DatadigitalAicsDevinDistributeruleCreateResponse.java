package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.aics.devin.distributerule.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-10 15:45:13
 */
public class DatadigitalAicsDevinDistributeruleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1336324254472182661L;

	/** 
	 * 新增分派规则数据ID，与 data.value 同值
	 */
	@ApiField("id")
	private Long id;

	public void setId(Long id) {
		this.id = id;
	}
	public Long getId( ) {
		return this.id;
	}

}
