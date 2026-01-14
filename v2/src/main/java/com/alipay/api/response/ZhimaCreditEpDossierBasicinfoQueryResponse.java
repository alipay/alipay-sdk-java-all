package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpBusinessBasicInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.basicinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-18 10:17:43
 */
public class ZhimaCreditEpDossierBasicinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1462333396398828971L;

	/** 
	 * 企业工商基本信息
	 */
	@ApiField("data")
	private EpBusinessBasicInfo data;

	/** 
	 * 查得标记
	 */
	@ApiField("data_found")
	private Boolean dataFound;

	public void setData(EpBusinessBasicInfo data) {
		this.data = data;
	}
	public EpBusinessBasicInfo getData( ) {
		return this.data;
	}

	public void setDataFound(Boolean dataFound) {
		this.dataFound = dataFound;
	}
	public Boolean getDataFound( ) {
		return this.dataFound;
	}

}
