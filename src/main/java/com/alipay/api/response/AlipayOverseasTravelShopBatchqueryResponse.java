package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OverseaShopInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.shop.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-19 13:58:26
 */
public class AlipayOverseasTravelShopBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7772518399333495685L;

	/** 
	 * 店铺信息列表
	 */
	@ApiListField("shops")
	@ApiField("oversea_shop_info")
	private List<OverseaShopInfo> shops;

	/** 
	 * 入参匹配的店铺总数，分页使用
	 */
	@ApiField("total")
	private Long total;

	public void setShops(List<OverseaShopInfo> shops) {
		this.shops = shops;
	}
	public List<OverseaShopInfo> getShops( ) {
		return this.shops;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
