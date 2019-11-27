package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MerchantShop;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.shop.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayMerchantShopGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 4488635929741375158L;

	/** 
	 * 是否有下一页
	 */
	@ApiField("has_next_page")
	private Boolean hasNextPage;

	/** 
	 * 结果集
	 */
	@ApiListField("items")
	@ApiField("merchant_shop")
	private List<MerchantShop> items;

	/** 
	 * 当前页
	 */
	@ApiField("page_no")
	private Long pageNo;

	/** 
	 * 每页显示记录数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总记录数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setHasNextPage(Boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}
	public Boolean getHasNextPage( ) {
		return this.hasNextPage;
	}

	public void setItems(List<MerchantShop> items) {
		this.items = items;
	}
	public List<MerchantShop> getItems( ) {
		return this.items;
	}

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

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
