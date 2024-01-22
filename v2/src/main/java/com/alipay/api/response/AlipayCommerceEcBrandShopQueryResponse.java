package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EcShop;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.brand.shop.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 04:46:41
 */
public class AlipayCommerceEcBrandShopQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1228161582114345264L;

	/** 
	 * 页数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 分页大小
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 门店信息列表
	 */
	@ApiListField("shop_info_list")
	@ApiField("ec_shop")
	private List<EcShop> shopInfoList;

	/** 
	 * 总页数
	 */
	@ApiField("total_page_count")
	private Long totalPageCount;

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}
	public Long getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

	public void setShopInfoList(List<EcShop> shopInfoList) {
		this.shopInfoList = shopInfoList;
	}
	public List<EcShop> getShopInfoList( ) {
		return this.shopInfoList;
	}

	public void setTotalPageCount(Long totalPageCount) {
		this.totalPageCount = totalPageCount;
	}
	public Long getTotalPageCount( ) {
		return this.totalPageCount;
	}

}
