package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BizFlowInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.ecny.bizflow.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-23 17:07:57
 */
public class MybankEcnyBizflowBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2491464935666247561L;

	/** 
	 * null
	 */
	@ApiListField("data_list")
	@ApiField("biz_flow_info")
	private List<BizFlowInfo> dataList;

	/** 
	 * 第一次查询为空，翻页查询取最后条记录的FlowNo
	 */
	@ApiField("next_cursor")
	private String nextCursor;

	/** 
	 * 每页数量为10
	 */
	@ApiField("page_size")
	private Long pageSize;

	public void setDataList(List<BizFlowInfo> dataList) {
		this.dataList = dataList;
	}
	public List<BizFlowInfo> getDataList( ) {
		return this.dataList;
	}

	public void setNextCursor(String nextCursor) {
		this.nextCursor = nextCursor;
	}
	public String getNextCursor( ) {
		return this.nextCursor;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

}
