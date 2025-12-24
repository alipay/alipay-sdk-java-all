package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpAdminLicenseDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.adminlicense.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-18 10:07:42
 */
public class ZhimaCreditEpDossierAdminlicenseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5334392945611983861L;

	/** 
	 * 企业行政许可内容
	 */
	@ApiField("data")
	private EpAdminLicenseDataInfo data;

	/** 
	 * 查得标记
	 */
	@ApiField("data_found")
	private Boolean dataFound;

	public void setData(EpAdminLicenseDataInfo data) {
		this.data = data;
	}
	public EpAdminLicenseDataInfo getData( ) {
		return this.data;
	}

	public void setDataFound(Boolean dataFound) {
		this.dataFound = dataFound;
	}
	public Boolean getDataFound( ) {
		return this.dataFound;
	}

}
