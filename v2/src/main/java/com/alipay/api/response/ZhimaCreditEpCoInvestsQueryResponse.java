package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpCoInvestDataInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.co.invests.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-04 17:17:43
 */
public class ZhimaCreditEpCoInvestsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4659948583167413487L;

	/** 
	 * 数据集
	 */
	@ApiField("data")
	private EpCoInvestDataInfo data;

	/** 
	 * 查得标记
	 */
	@ApiField("data_found")
	private Boolean dataFound;

	public void setData(EpCoInvestDataInfo data) {
		this.data = data;
	}
	public EpCoInvestDataInfo getData( ) {
		return this.data;
	}

	public void setDataFound(Boolean dataFound) {
		this.dataFound = dataFound;
	}
	public Boolean getDataFound( ) {
		return this.dataFound;
	}

}
