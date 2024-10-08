package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EcShopDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.shoppool.activityshop.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-11 10:37:06
 */
public class AlipayCommerceEcShoppoolActivityshopQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4573489551945153685L;

	/** 
	 * 门店列表信息
	 */
	@ApiListField("shop_info_list")
	@ApiField("ec_shop_detail")
	private List<EcShopDetail> shopInfoList;

	/** 
	 * 门店总个数
	 */
	@ApiField("total_num")
	private Long totalNum;

	public void setShopInfoList(List<EcShopDetail> shopInfoList) {
		this.shopInfoList = shopInfoList;
	}
	public List<EcShopDetail> getShopInfoList( ) {
		return this.shopInfoList;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}
	public Long getTotalNum( ) {
		return this.totalNum;
	}

}
