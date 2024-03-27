package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UserTaskDetailResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.water.usertaskdetail.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-02-27 09:53:38
 */
public class AlipayCommerceWaterUsertaskdetailBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4819527471923797451L;

	/** 
	 * 返回列表
	 */
	@ApiListField("data_list")
	@ApiField("user_task_detail_response")
	private List<UserTaskDetailResponse> dataList;

	/** 
	 * 页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/** 
	 * 页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总记录条数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setDataList(List<UserTaskDetailResponse> dataList) {
		this.dataList = dataList;
	}
	public List<UserTaskDetailResponse> getDataList( ) {
		return this.dataList;
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
