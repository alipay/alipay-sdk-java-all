package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BrandInfos;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.search.brand.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-18 14:37:36
 */
public class AlipayOpenSearchBrandBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1437812245787915169L;

	/** 
	 * 品牌详情信息
	 */
	@ApiListField("data")
	@ApiField("brand_infos")
	private List<BrandInfos> data;

	public void setData(List<BrandInfos> data) {
		this.data = data;
	}
	public List<BrandInfos> getData( ) {
		return this.data;
	}

}
