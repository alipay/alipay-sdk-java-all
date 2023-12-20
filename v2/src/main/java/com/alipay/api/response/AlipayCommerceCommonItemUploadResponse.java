package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IndustryItemSkuSyncResultDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.common.item.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-31 15:01:42
 */
public class AlipayCommerceCommonItemUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 5561676494172177752L;

	/** 
	 * 商户侧商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/** 
	 * 支付宝侧商品id
	 */
	@ApiField("platform_item_id")
	private String platformItemId;

	/** 
	 * sku提报结果
	 */
	@ApiListField("sku_result_list")
	@ApiField("industry_item_sku_sync_result_d_t_o")
	private List<IndustryItemSkuSyncResultDTO> skuResultList;

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemId( ) {
		return this.itemId;
	}

	public void setPlatformItemId(String platformItemId) {
		this.platformItemId = platformItemId;
	}
	public String getPlatformItemId( ) {
		return this.platformItemId;
	}

	public void setSkuResultList(List<IndustryItemSkuSyncResultDTO> skuResultList) {
		this.skuResultList = skuResultList;
	}
	public List<IndustryItemSkuSyncResultDTO> getSkuResultList( ) {
		return this.skuResultList;
	}

}
