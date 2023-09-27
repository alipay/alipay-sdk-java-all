package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KbdishVirtualDishInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.virtualdish.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 17:24:26
 */
public class KoubeiCateringDishVirtualdishQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8765851454872771217L;

	/** 
	 * 门店下虚拟类目下的菜品id列表
	 */
	@ApiListField("dish_list")
	@ApiField("kbdish_virtual_dish_info")
	private List<KbdishVirtualDishInfo> dishList;

	/** 
	 * 口碑侧门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	public void setDishList(List<KbdishVirtualDishInfo> dishList) {
		this.dishList = dishList;
	}
	public List<KbdishVirtualDishInfo> getDishList( ) {
		return this.dishList;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopId( ) {
		return this.shopId;
	}

}
