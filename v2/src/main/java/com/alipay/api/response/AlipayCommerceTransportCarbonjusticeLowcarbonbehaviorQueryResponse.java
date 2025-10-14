package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CarbonJusticeQueryOpenapiDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.carbonjustice.lowcarbonbehavior.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-30 00:22:21
 */
public class AlipayCommerceTransportCarbonjusticeLowcarbonbehaviorQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1861177114947885142L;

	/** 
	 * 碳权益查询结果列表
	 */
	@ApiListField("carbon_justice_model_list")
	@ApiField("carbon_justice_query_openapi_d_t_o")
	private List<CarbonJusticeQueryOpenapiDTO> carbonJusticeModelList;

	public void setCarbonJusticeModelList(List<CarbonJusticeQueryOpenapiDTO> carbonJusticeModelList) {
		this.carbonJusticeModelList = carbonJusticeModelList;
	}
	public List<CarbonJusticeQueryOpenapiDTO> getCarbonJusticeModelList( ) {
		return this.carbonJusticeModelList;
	}

}
