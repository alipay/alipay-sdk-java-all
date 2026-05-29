package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AcquirePayFlow;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.acquire.base.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-06 10:07:49
 */
public class ZhimaCreditEpAcquireBaseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5143954611811384384L;

	/** 
	 * 数据集
	 */
	@ApiField("data")
	private AcquirePayFlow data;

	/** 
	 * 查得标记：true，false
	 */
	@ApiField("data_found")
	private Boolean dataFound;

	public void setData(AcquirePayFlow data) {
		this.data = data;
	}
	public AcquirePayFlow getData( ) {
		return this.data;
	}

	public void setDataFound(Boolean dataFound) {
		this.dataFound = dataFound;
	}
	public Boolean getDataFound( ) {
		return this.dataFound;
	}

}
