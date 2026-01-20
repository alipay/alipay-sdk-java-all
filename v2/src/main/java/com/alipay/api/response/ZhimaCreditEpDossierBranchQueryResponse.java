package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpBranchDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.branch.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-18 10:17:42
 */
public class ZhimaCreditEpDossierBranchQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7761664318698449729L;

	/** 
	 * 企业分支机构返回内容
	 */
	@ApiField("data")
	private EpBranchDataInfo data;

	/** 
	 * 查得标记
	 */
	@ApiField("data_found")
	private Boolean dataFound;

	public void setData(EpBranchDataInfo data) {
		this.data = data;
	}
	public EpBranchDataInfo getData( ) {
		return this.data;
	}

	public void setDataFound(Boolean dataFound) {
		this.dataFound = dataFound;
	}
	public Boolean getDataFound( ) {
		return this.dataFound;
	}

}
