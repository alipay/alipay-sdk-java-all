package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * ISV商户门店摘要信息批量查询接口
 *
 * @author auto create
 * @since 1.0, 2022-06-27 11:18:43
 */
public class KoubeiMarketingDataIsvShopQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2482367327548197546L;

	/**
	 * 门店ID列表（单次最多查询100个门店）
	 */
	@ApiListField("shop_ids")
	@ApiField("string")
	private List<String> shopIds;

	public List<String> getShopIds() {
		return this.shopIds;
	}
	public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}

}
