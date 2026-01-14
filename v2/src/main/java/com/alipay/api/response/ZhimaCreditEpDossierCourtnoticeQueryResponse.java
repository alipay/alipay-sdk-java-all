package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpCourtNoticeDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.courtnotice.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-18 10:17:42
 */
public class ZhimaCreditEpDossierCourtnoticeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6725553687467167669L;

	/** 
	 * 企业开庭公告返回内容
	 */
	@ApiField("data")
	private EpCourtNoticeDataInfo data;

	/** 
	 * 查得标记
	 */
	@ApiField("data_found")
	private Boolean dataFound;

	public void setData(EpCourtNoticeDataInfo data) {
		this.data = data;
	}
	public EpCourtNoticeDataInfo getData( ) {
		return this.data;
	}

	public void setDataFound(Boolean dataFound) {
		this.dataFound = dataFound;
	}
	public Boolean getDataFound( ) {
		return this.dataFound;
	}

}
