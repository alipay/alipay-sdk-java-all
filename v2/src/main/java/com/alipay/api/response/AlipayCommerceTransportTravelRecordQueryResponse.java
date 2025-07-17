package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TravelRecord;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.travel.record.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-25 11:03:51
 */
public class AlipayCommerceTransportTravelRecordQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6686766183814346365L;

	/** 
	 * 用户乘车记录数据，按日期分类
	 */
	@ApiListField("data")
	@ApiField("travel_record")
	private List<TravelRecord> data;

	public void setData(List<TravelRecord> data) {
		this.data = data;
	}
	public List<TravelRecord> getData( ) {
		return this.data;
	}

}
