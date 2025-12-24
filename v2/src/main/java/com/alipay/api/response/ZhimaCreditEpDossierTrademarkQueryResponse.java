package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpTrademarkDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.trademark.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-18 10:07:42
 */
public class ZhimaCreditEpDossierTrademarkQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4564538362776729928L;

	/** 
	 * 企业商标查询内容
	 */
	@ApiField("data")
	private EpTrademarkDataInfo data;

	/** 
	 * 查得标记
	 */
	@ApiField("data_found")
	private Boolean dataFound;

	public void setData(EpTrademarkDataInfo data) {
		this.data = data;
	}
	public EpTrademarkDataInfo getData( ) {
		return this.data;
	}

	public void setDataFound(Boolean dataFound) {
		this.dataFound = dataFound;
	}
	public Boolean getDataFound( ) {
		return this.dataFound;
	}

}
