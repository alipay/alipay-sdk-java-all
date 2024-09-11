package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ShopQueryOpenApiVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.shop.page.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-02 13:48:24
 */
public class AntMerchantExpandShopPageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6869193393113496429L;

	/** 
	 * 门店地址库 ID，按照一定的平台规则识别出的线下真实存在、真实经营的蚂蚁门店地址库 ID，将作用于服务商的返佣激励、商品/券等权益的公域分发。如平台未返回alipay_poiid，请在确认门店信息真实有效后，稍后再进行查询
	 */
	@ApiField("alipay_poiid")
	private String alipayPoiid;

	/** 
	 * 门店详情
	 */
	@ApiListField("shop_infos")
	@ApiField("shop_query_open_api_v_o")
	private List<ShopQueryOpenApiVO> shopInfos;

	/** 
	 * 总页数
	 */
	@ApiField("total_pages")
	private Long totalPages;

	public void setAlipayPoiid(String alipayPoiid) {
		this.alipayPoiid = alipayPoiid;
	}
	public String getAlipayPoiid( ) {
		return this.alipayPoiid;
	}

	public void setShopInfos(List<ShopQueryOpenApiVO> shopInfos) {
		this.shopInfos = shopInfos;
	}
	public List<ShopQueryOpenApiVO> getShopInfos( ) {
		return this.shopInfos;
	}

	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}
	public Long getTotalPages( ) {
		return this.totalPages;
	}

}
