package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.NDeviceMetricsListForDayResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.ndevice.metricsforday.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-11 17:44:56
 */
public class AlipayCommerceOperationNdeviceMetricsfordayBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8573355422518788692L;

	/** 
	 * 数据总数
	 */
	@ApiField("count")
	private Long count;

	/** 
	 * 设备明细列表
	 */
	@ApiListField("data")
	@ApiField("n_device_metrics_list_for_day_response")
	private List<NDeviceMetricsListForDayResponse> data;

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

	public void setData(List<NDeviceMetricsListForDayResponse> data) {
		this.data = data;
	}
	public List<NDeviceMetricsListForDayResponse> getData( ) {
		return this.data;
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
