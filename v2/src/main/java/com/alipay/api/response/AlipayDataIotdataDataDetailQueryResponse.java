package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SummaryData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.iotdata.data.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-29 15:07:30
 */
public class AlipayDataIotdataDataDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3156685183419993333L;

	/** 
	 * 感知数据列表
	 */
	@ApiListField("data")
	@ApiField("summary_data")
	private List<SummaryData> data;

	public void setData(List<SummaryData> data) {
		this.data = data;
	}
	public List<SummaryData> getData( ) {
		return this.data;
	}

}
