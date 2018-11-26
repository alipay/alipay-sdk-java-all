package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ExtShopItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.shopitem.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-14 18:19:47
 */
public class KoubeiRetailShopitemBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7521319783623664633L;

	/** 
	 * 店铺商品集合
	 */
	@ApiListField("shopitemlist")
	@ApiField("ext_shop_item")
	private List<ExtShopItem> shopitemlist;

	public void setShopitemlist(List<ExtShopItem> shopitemlist) {
		this.shopitemlist = shopitemlist;
	}
	public List<ExtShopItem> getShopitemlist( ) {
		return this.shopitemlist;
	}

}
