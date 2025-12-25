package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ZmepDossierBackgroundDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.background.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-16 13:52:41
 */
public class ZhimaCreditEpDossierBackgroundQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2687729796343918212L;

	/** 
	 * 数据结果
	 */
	@ApiField("data")
	private ZmepDossierBackgroundDataInfo data;

	/** 
	 * 查得标记
	 */
	@ApiField("data_found")
	private Boolean dataFound;

	public void setData(ZmepDossierBackgroundDataInfo data) {
		this.data = data;
	}
	public ZmepDossierBackgroundDataInfo getData( ) {
		return this.data;
	}

	public void setDataFound(Boolean dataFound) {
		this.dataFound = dataFound;
	}
	public Boolean getDataFound( ) {
		return this.dataFound;
	}

}
