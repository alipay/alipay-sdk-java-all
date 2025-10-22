package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.point.work.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-24 16:12:33
 */
public class AlipayCommerceLogisticsPointWorkCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3547755294791996989L;

	/** 
	 * 特定点位的作业单ID
	 */
	@ApiField("logistics_point_work_id")
	private String logisticsPointWorkId;

	public void setLogisticsPointWorkId(String logisticsPointWorkId) {
		this.logisticsPointWorkId = logisticsPointWorkId;
	}
	public String getLogisticsPointWorkId( ) {
		return this.logisticsPointWorkId;
	}

}
