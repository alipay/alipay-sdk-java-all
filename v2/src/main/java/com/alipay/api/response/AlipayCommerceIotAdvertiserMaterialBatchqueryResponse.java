package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AdMaterialInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.advertiser.material.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-10 14:01:17
 */
public class AlipayCommerceIotAdvertiserMaterialBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7421833698367622843L;

	/** 
	 * 物料列表
	 */
	@ApiListField("material_infos")
	@ApiField("ad_material_info")
	private List<AdMaterialInfo> materialInfos;

	/** 
	 * 总大小
	 */
	@ApiField("total")
	private Long total;

	public void setMaterialInfos(List<AdMaterialInfo> materialInfos) {
		this.materialInfos = materialInfos;
	}
	public List<AdMaterialInfo> getMaterialInfos( ) {
		return this.materialInfos;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
