package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.QueryProvCityInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.prodmode.provcity.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-31 19:04:45
 */
public class AlipayEbppProdmodeProvcityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8165671449785923169L;

	/** 
	 * 返回省市下拉列表数据
	 */
	@ApiListField("data_list")
	@ApiField("query_prov_city_info")
	private List<QueryProvCityInfo> dataList;

	public void setDataList(List<QueryProvCityInfo> dataList) {
		this.dataList = dataList;
	}
	public List<QueryProvCityInfo> getDataList( ) {
		return this.dataList;
	}

}
