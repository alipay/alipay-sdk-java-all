package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AirticketPriceQueryInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.airticket.tobprice.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-21 17:24:47
 */
public class AlipayCommerceTransportAirticketTobpriceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2242511448628769929L;

	/** 
	 * 机票价格信息
	 */
	@ApiListField("data")
	@ApiField("airticket_price_query_info")
	private List<AirticketPriceQueryInfo> data;

	/** 
	 * 外部订单号，与请求中的保持一致
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setData(List<AirticketPriceQueryInfo> data) {
		this.data = data;
	}
	public List<AirticketPriceQueryInfo> getData( ) {
		return this.data;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

}
