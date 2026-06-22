package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpCoOverviewInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.co.overview.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-04 17:47:43
 */
public class ZhimaCreditEpCoOverviewQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7412892778528751758L;

	/** 
	 * 数据集
	 */
	@ApiField("data")
	private EpCoOverviewInfo data;

	/** 
	 * 查得标记
	 */
	@ApiField("data_found")
	private Boolean dataFound;

	public void setData(EpCoOverviewInfo data) {
		this.data = data;
	}
	public EpCoOverviewInfo getData( ) {
		return this.data;
	}

	public void setDataFound(Boolean dataFound) {
		this.dataFound = dataFound;
	}
	public Boolean getDataFound( ) {
		return this.dataFound;
	}

}
