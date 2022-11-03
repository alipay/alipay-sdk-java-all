package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SimpleShopInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.shop.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-22 00:26:33
 */
public class AntMerchantExpandShopBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1319389332643881162L;

	/** 
	 * 当前页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/** 
	 * 分页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 线下门店的列表;有可能为空
	 */
	@ApiListField("shops")
	@ApiField("simple_shop_info")
	private List<SimpleShopInfo> shops;

	/** 
	 * 按照分页数量拆分，分解出来的页数
	 */
	@ApiField("total_page")
	private Long totalPage;

	/** 
	 * 所有线下门店数量
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public Long getPageNo( ) {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setShops(List<SimpleShopInfo> shops) {
		this.shops = shops;
	}
	public List<SimpleShopInfo> getShops( ) {
		return this.shops;
	}

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}
	public Long getTotalPage( ) {
		return this.totalPage;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
