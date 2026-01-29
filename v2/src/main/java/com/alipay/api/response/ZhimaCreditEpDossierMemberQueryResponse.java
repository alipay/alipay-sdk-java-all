package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpMemberDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.member.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-18 10:12:42
 */
public class ZhimaCreditEpDossierMemberQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5592581824184551715L;

	/** 
	 * 企业成员查询返回内容
	 */
	@ApiField("data")
	private EpMemberDataInfo data;

	/** 
	 * 查得标记
	 */
	@ApiField("data_found")
	private Boolean dataFound;

	public void setData(EpMemberDataInfo data) {
		this.data = data;
	}
	public EpMemberDataInfo getData( ) {
		return this.data;
	}

	public void setDataFound(Boolean dataFound) {
		this.dataFound = dataFound;
	}
	public Boolean getDataFound( ) {
		return this.dataFound;
	}

}
