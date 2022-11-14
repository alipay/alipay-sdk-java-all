package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerapp.service.publish response.
 * 
 * @author auto create
 * @since 1.0, 2020-02-14 09:44:46
 */
public class AlipayOpenMiniInnerappServicePublishResponse extends AlipayResponse {

	private static final long serialVersionUID = 5355657219792664625L;

	/** 
	 * 服务ID
	 */
	@ApiField("merchandise_id")
	private String merchandiseId;

	public void setMerchandiseId(String merchandiseId) {
		this.merchandiseId = merchandiseId;
	}
	public String getMerchandiseId( ) {
		return this.merchandiseId;
	}

}
