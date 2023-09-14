package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RatioDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.consum.ratio.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 17:07:19
 */
public class AlipayDataDataserviceConsumRatioQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3425599987677844168L;

	/** 
	 * 占比数据接口返回数据结构
	 */
	@ApiField("ratio_detail")
	private RatioDetail ratioDetail;

	public void setRatioDetail(RatioDetail ratioDetail) {
		this.ratioDetail = ratioDetail;
	}
	public RatioDetail getRatioDetail( ) {
		return this.ratioDetail;
	}

}
