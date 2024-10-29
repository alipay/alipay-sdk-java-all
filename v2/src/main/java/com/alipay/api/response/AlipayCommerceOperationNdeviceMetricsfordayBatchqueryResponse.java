package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.NDeviceMetricsListForDayResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.ndevice.metricsforday.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-25 14:17:10
 */
public class AlipayCommerceOperationNdeviceMetricsfordayBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8659587356617491494L;

	/** 
	 * 数据总数
	 */
	@ApiField("count")
	private Long count;

	/** 
	 * 设备明细列表
	 */
	@ApiField("list")
	private NDeviceMetricsListForDayResponse list;

	/** 
	 * 数据页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	public void setCount(Long count) {
		this.count = count;
	}
	public Long getCount( ) {
		return this.count;
	}

	public void setList(NDeviceMetricsListForDayResponse list) {
		this.list = list;
	}
	public NDeviceMetricsListForDayResponse getList( ) {
		return this.list;
	}

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

}
