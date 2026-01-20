package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpOweTaxDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.owetax.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-16 13:52:42
 */
public class ZhimaCreditEpDossierOwetaxQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3271556258843983748L;

	/** 
	 * 查询数据结果
	 */
	@ApiField("data")
	private EpOweTaxDataInfo data;

	/** 
	 * 查得标记
	 */
	@ApiField("data_found")
	private Boolean dataFound;

	public void setData(EpOweTaxDataInfo data) {
		this.data = data;
	}
	public EpOweTaxDataInfo getData( ) {
		return this.data;
	}

	public void setDataFound(Boolean dataFound) {
		this.dataFound = dataFound;
	}
	public Boolean getDataFound( ) {
		return this.dataFound;
	}

}
