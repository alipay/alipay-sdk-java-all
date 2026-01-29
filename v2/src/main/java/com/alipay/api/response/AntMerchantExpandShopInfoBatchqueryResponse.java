package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ShopPageQueryDetailVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.shop.info.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-26 10:32:43
 */
public class AntMerchantExpandShopInfoBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5692559476822454531L;

	/** 
	 * 当前页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页记录数，最大值：100
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * null
	 */
	@ApiListField("shop_infos")
	@ApiField("shop_page_query_detail_v_o")
	private List<ShopPageQueryDetailVO> shopInfos;

	/** 
	 * 总页数
	 */
	@ApiField("total_pages")
	private Long totalPages;

	/** 
	 * 总记录数
	 */
	@ApiField("total_size")
	private Long totalSize;

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

	public void setShopInfos(List<ShopPageQueryDetailVO> shopInfos) {
		this.shopInfos = shopInfos;
	}
	public List<ShopPageQueryDetailVO> getShopInfos( ) {
		return this.shopInfos;
	}

	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}
	public Long getTotalPages( ) {
		return this.totalPages;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
