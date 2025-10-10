package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.function.log.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:20
 */
public class AlipayCloudCloudbaseFunctionLogQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5489633148412376437L;

	/** 
	 * 云函数执行日志记录
	 */
	@ApiListField("logs")
	@ApiField("string")
	private List<String> logs;

	/** 
	 * 页码
	 */
	@ApiField("page_index")
	private String pageIndex;

	/** 
	 * 每页数量
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 总数
	 */
	@ApiField("total")
	private Long total;

	public void setLogs(List<String> logs) {
		this.logs = logs;
	}
	public List<String> getLogs( ) {
		return this.logs;
	}

	public void setPageIndex(String pageIndex) {
		this.pageIndex = pageIndex;
	}
	public String getPageIndex( ) {
		return this.pageIndex;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
