package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ZmepCertificateDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.certificate.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-05 10:02:40
 */
public class ZhimaCreditEpDossierCertificateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5179148483932415652L;

	/** 
	 * 数据结果
	 */
	@ApiField("data")
	private ZmepCertificateDataInfo data;

	public void setData(ZmepCertificateDataInfo data) {
		this.data = data;
	}
	public ZmepCertificateDataInfo getData( ) {
		return this.data;
	}

}
