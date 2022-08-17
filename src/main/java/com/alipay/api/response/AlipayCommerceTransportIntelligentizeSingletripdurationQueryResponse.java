package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SingleTripDurationQueryOpenapiResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.intelligentize.singletripduration.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-01-10 10:42:38
 */
public class AlipayCommerceTransportIntelligentizeSingletripdurationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5623399853665826225L;

	/** 
	 * 扩展信息，json格式，由双方约定取值
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 查询结果集合
	 */
	@ApiListField("result")
	@ApiField("single_trip_duration_query_openapi_result")
	private List<SingleTripDurationQueryOpenapiResult> result;

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setResult(List<SingleTripDurationQueryOpenapiResult> result) {
		this.result = result;
	}
	public List<SingleTripDurationQueryOpenapiResult> getResult( ) {
		return this.result;
	}

}
