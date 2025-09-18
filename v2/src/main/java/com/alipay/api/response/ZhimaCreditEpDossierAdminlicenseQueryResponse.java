package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpAdminLicenseDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.adminlicense.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-24 14:32:22
 */
public class ZhimaCreditEpDossierAdminlicenseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6852449915392571739L;

	/** 
	 * 企业行政许可内容
	 */
	@ApiField("data")
	private EpAdminLicenseDataInfo data;

	public void setData(EpAdminLicenseDataInfo data) {
		this.data = data;
	}
	public EpAdminLicenseDataInfo getData( ) {
		return this.data;
	}

}
