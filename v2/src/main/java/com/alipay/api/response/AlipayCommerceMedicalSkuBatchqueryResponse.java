package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItemSkuInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.sku.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-14 11:17:23
 */
public class AlipayCommerceMedicalSkuBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3494524896121421553L;

	/** 
	 * 门店商品sku信息列表，包含skuId,skuCode,spec,upc,price,stock等信息
	 */
	@ApiListField("sku_info_list")
	@ApiField("item_sku_info_d_t_o")
	private List<ItemSkuInfoDTO> skuInfoList;

	public void setSkuInfoList(List<ItemSkuInfoDTO> skuInfoList) {
		this.skuInfoList = skuInfoList;
	}
	public List<ItemSkuInfoDTO> getSkuInfoList( ) {
		return this.skuInfoList;
	}

}
