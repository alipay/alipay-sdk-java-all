package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpCoMemberDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.co.members.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-04 17:17:43
 */
public class ZhimaCreditEpCoMembersQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1775449686623192359L;

	/** 
	 * 结果集
	 */
	@ApiField("data")
	private EpCoMemberDataInfo data;

	/** 
	 * 查得标记
	 */
	@ApiField("data_found")
	private Boolean dataFound;

	public void setData(EpCoMemberDataInfo data) {
		this.data = data;
	}
	public EpCoMemberDataInfo getData( ) {
		return this.data;
	}

	public void setDataFound(Boolean dataFound) {
		this.dataFound = dataFound;
	}
	public Boolean getDataFound( ) {
		return this.dataFound;
	}

}
