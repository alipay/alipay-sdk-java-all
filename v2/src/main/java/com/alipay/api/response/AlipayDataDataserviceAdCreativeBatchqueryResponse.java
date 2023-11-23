package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PageCreative;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.creative.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 07:59:50
 */
public class AlipayDataDataserviceAdCreativeBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5312145747666241477L;

	/** 
	 * 创意按条件分页查询结果
	 */
	@ApiField("creative_list")
	private PageCreative creativeList;

	public void setCreativeList(PageCreative creativeList) {
		this.creativeList = creativeList;
	}
	public PageCreative getCreativeList( ) {
		return this.creativeList;
	}

}
