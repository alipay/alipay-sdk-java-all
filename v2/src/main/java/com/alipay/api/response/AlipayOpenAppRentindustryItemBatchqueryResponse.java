package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MerchantSpuQueryResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.rentindustry.item.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-20 19:12:42
 */
public class AlipayOpenAppRentindustryItemBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7326519291551774881L;

	/** 
	 * null
	 */
	@ApiListField("data")
	@ApiField("merchant_spu_query_result")
	private List<MerchantSpuQueryResult> data;

	/** 
	 * 数量
	 */
	@ApiField("size")
	private Long size;

	public void setData(List<MerchantSpuQueryResult> data) {
		this.data = data;
	}
	public List<MerchantSpuQueryResult> getData( ) {
		return this.data;
	}

	public void setSize(Long size) {
		this.size = size;
	}
	public Long getSize( ) {
		return this.size;
	}

}
