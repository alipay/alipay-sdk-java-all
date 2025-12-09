package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpBranchDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.branch.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-04 19:04:41
 */
public class ZhimaCreditEpDossierBranchQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4275925696516251439L;

	/** 
	 * 企业分支机构返回内容
	 */
	@ApiField("data")
	private EpBranchDataInfo data;

	public void setData(EpBranchDataInfo data) {
		this.data = data;
	}
	public EpBranchDataInfo getData( ) {
		return this.data;
	}

}
