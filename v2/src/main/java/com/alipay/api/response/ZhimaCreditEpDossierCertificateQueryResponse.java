package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ZmepCertificateDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.certificate.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-16 13:42:42
 */
public class ZhimaCreditEpDossierCertificateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6485136576615583545L;

	/** 
	 * 数据结果
	 */
	@ApiField("data")
	private ZmepCertificateDataInfo data;

	/** 
	 * 查得标记
	 */
	@ApiField("data_found")
	private Boolean dataFound;

	public void setData(ZmepCertificateDataInfo data) {
		this.data = data;
	}
	public ZmepCertificateDataInfo getData( ) {
		return this.data;
	}

	public void setDataFound(Boolean dataFound) {
		this.dataFound = dataFound;
	}
	public Boolean getDataFound( ) {
		return this.dataFound;
	}

}
