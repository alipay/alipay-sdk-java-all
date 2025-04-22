package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ShopVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.mall.shop.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-03 16:47:29
 */
public class AlipayCloudCloudpromoMallShopBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2445891778363349658L;

	/** 
	 * 页数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 单页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 店铺列表
	 */
	@ApiListField("shop_list")
	@ApiField("shop_v_o")
	private List<ShopVO> shopList;

	/** 
	 * 总量
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}
	public Long getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setShopList(List<ShopVO> shopList) {
		this.shopList = shopList;
	}
	public List<ShopVO> getShopList( ) {
		return this.shopList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
