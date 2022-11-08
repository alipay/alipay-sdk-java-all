package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IoTDeliveryPlan;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.iotdelivery.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-01 17:11:51
 */
public class AlipayMarketingActivityIotdeliveryBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4688572642842463438L;

	/** 
	 * 当前页码，从1开始计算
	 */
	@ApiField("current_page")
	private Long currentPage;

	/** 
	 * 每页条数
	 */
	@ApiField("items_page")
	private Long itemsPage;

	/** 
	 * 投放计划列表
	 */
	@ApiListField("plan_list")
	@ApiField("io_t_delivery_plan")
	private List<IoTDeliveryPlan> planList;

	/** 
	 * 查询到的总结果数
	 */
	@ApiField("total_items")
	private Long totalItems;

	/** 
	 * 总页数
	 */
	@ApiField("total_pages")
	private Long totalPages;

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}
	public Long getCurrentPage( ) {
		return this.currentPage;
	}

	public void setItemsPage(Long itemsPage) {
		this.itemsPage = itemsPage;
	}
	public Long getItemsPage( ) {
		return this.itemsPage;
	}

	public void setPlanList(List<IoTDeliveryPlan> planList) {
		this.planList = planList;
	}
	public List<IoTDeliveryPlan> getPlanList( ) {
		return this.planList;
	}

	public void setTotalItems(Long totalItems) {
		this.totalItems = totalItems;
	}
	public Long getTotalItems( ) {
		return this.totalItems;
	}

	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}
	public Long getTotalPages( ) {
		return this.totalPages;
	}

}
