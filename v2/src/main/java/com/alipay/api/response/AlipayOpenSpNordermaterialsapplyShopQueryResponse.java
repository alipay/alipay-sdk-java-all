package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ShopDeliveryInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.nordermaterialsapply.shop.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-18 16:12:28
 */
public class AlipayOpenSpNordermaterialsapplyShopQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2135998969654726539L;

	/** 
	 * 该门店（收货地）下物料数量
	 */
	@ApiField("materials_num")
	private Long materialsNum;

	/** 
	 * 门店的物流信息
	 */
	@ApiListField("shop_delivery_info")
	@ApiField("shop_delivery_info")
	private List<ShopDeliveryInfo> shopDeliveryInfo;

	public void setMaterialsNum(Long materialsNum) {
		this.materialsNum = materialsNum;
	}
	public Long getMaterialsNum( ) {
		return this.materialsNum;
	}

	public void setShopDeliveryInfo(List<ShopDeliveryInfo> shopDeliveryInfo) {
		this.shopDeliveryInfo = shopDeliveryInfo;
	}
	public List<ShopDeliveryInfo> getShopDeliveryInfo( ) {
		return this.shopDeliveryInfo;
	}

}
