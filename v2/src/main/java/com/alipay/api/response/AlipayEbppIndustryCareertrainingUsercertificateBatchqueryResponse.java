package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.UsercertificateObject;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.careertraining.usercertificate.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-18 14:27:37
 */
public class AlipayEbppIndustryCareertrainingUsercertificateBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4343361322332219667L;

	/** 
	 * 数据列表
	 */
	@ApiField("list")
	private UsercertificateObject list;

	/** 
	 * 证书总个数
	 */
	@ApiField("total")
	private String total;

	public void setList(UsercertificateObject list) {
		this.list = list;
	}
	public UsercertificateObject getList( ) {
		return this.list;
	}

	public void setTotal(String total) {
		this.total = total;
	}
	public String getTotal( ) {
		return this.total;
	}

}
