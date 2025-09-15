package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EcShopDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.shoppool.shop.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-06 17:07:01
 */
public class AlipayCommerceEcShoppoolShopGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2858527112284238759L;

	/** 
	 * 企业码门店信息列表
	 */
	@ApiListField("shop_info_list")
	@ApiField("ec_shop_detail")
	private List<EcShopDetail> shopInfoList;

	public void setShopInfoList(List<EcShopDetail> shopInfoList) {
		this.shopInfoList = shopInfoList;
	}
	public List<EcShopDetail> getShopInfoList( ) {
		return this.shopInfoList;
	}

}
