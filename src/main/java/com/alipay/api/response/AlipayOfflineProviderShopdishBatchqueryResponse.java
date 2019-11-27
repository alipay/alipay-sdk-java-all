package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ShopDishModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.shopdish.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOfflineProviderShopdishBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8836583198713695621L;

	/** 
	 * 总共有多少条菜品信息。可用于计算分页。
	 */
	@ApiField("items")
	private Long items;

	/** 
	 * 菜品数据列表
	 */
	@ApiListField("list")
	@ApiField("shop_dish_model")
	private List<ShopDishModel> list;

	/** 
	 * 当前数据所在的页码数
	 */
	@ApiField("page")
	private Long page;

	/** 
	 * 当前查询结果分页的条数，可用于计算分页
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 当前条件下查询结果总的页码数
	 */
	@ApiField("pages")
	private Long pages;

	public void setItems(Long items) {
		this.items = items;
	}
	public Long getItems( ) {
		return this.items;
	}

	public void setList(List<ShopDishModel> list) {
		this.list = list;
	}
	public List<ShopDishModel> getList( ) {
		return this.list;
	}

	public void setPage(Long page) {
		this.page = page;
	}
	public Long getPage( ) {
		return this.page;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setPages(Long pages) {
		this.pages = pages;
	}
	public Long getPages( ) {
		return this.pages;
	}

}
