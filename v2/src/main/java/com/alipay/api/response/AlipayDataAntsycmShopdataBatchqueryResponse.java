package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ShopDataDetailDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.antsycm.shopdata.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-02 16:12:55
 */
public class AlipayDataAntsycmShopdataBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8871438552591358569L;

	/** 
	 * 数据列表
	 */
	@ApiListField("data_list")
	@ApiField("shop_data_detail_d_t_o")
	private List<ShopDataDetailDTO> dataList;

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

	public void setDataList(List<ShopDataDetailDTO> dataList) {
		this.dataList = dataList;
	}
	public List<ShopDataDetailDTO> getDataList( ) {
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
