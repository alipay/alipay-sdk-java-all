package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ShopDataDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.morse.marketing.shop.data.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:29:17
 */
public class AnttechMorseMarketingShopDataBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8136966432169856429L;

	/** 
	 * 数据列表
	 */
	@ApiListField("data_list")
	@ApiField("shop_data_detail")
	private List<ShopDataDetail> dataList;

	/** 
	 * 任务状态
	 */
	@ApiField("task_status")
	private String taskStatus;

	/** 
	 * 总数，用于分页
	 */
	@ApiField("total")
	private Long total;

	public void setDataList(List<ShopDataDetail> dataList) {
		this.dataList = dataList;
	}
	public List<ShopDataDetail> getDataList( ) {
		return this.dataList;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
	public String getTaskStatus( ) {
		return this.taskStatus;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
