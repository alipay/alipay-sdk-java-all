package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LeaseSkuOfferDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lease.enroll.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 20:41:42
 */
public class AlipayCommerceLeaseEnrollGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5775496144826362251L;

	/** 
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/** 
	 * 租赁商sku报价信息
	 */
	@ApiListField("sku_offer_list")
	@ApiField("lease_sku_offer_d_t_o")
	private List<LeaseSkuOfferDTO> skuOfferList;

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemId( ) {
		return this.itemId;
	}

	public void setSkuOfferList(List<LeaseSkuOfferDTO> skuOfferList) {
		this.skuOfferList = skuOfferList;
	}
	public List<LeaseSkuOfferDTO> getSkuOfferList( ) {
		return this.skuOfferList;
	}

}
