package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * N设备日维度明细数据查询
 *
 * @author auto create
 * @since 1.0, 2025-08-21 13:45:03
 */
public class AlipayCommerceOperationNdeviceMetricsfordayBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5165638899857236318L;

	/**
	 * 数据统计时间，具体到某年某月某天，2024年09月19日
	 */
	@ApiField("metrics_date")
	private String metricsDate;

	/**
	 * 第几页，分页参数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 一页多少，分页参数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 设备sn号
	 */
	@ApiListField("sn_list")
	@ApiField("string")
	private List<String> snList;

	/**
	 * 外部门店号
	 */
	@ApiField("store_id")
	private String storeId;

	public String getMetricsDate() {
		return this.metricsDate;
	}
	public void setMetricsDate(String metricsDate) {
		this.metricsDate = metricsDate;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<String> getSnList() {
		return this.snList;
	}
	public void setSnList(List<String> snList) {
		this.snList = snList;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
