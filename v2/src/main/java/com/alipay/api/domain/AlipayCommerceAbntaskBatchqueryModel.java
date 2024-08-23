package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家任务批量查询接口
 *
 * @author auto create
 * @since 1.0, 2020-09-11 10:56:57
 */
public class AlipayCommerceAbntaskBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2558362348251535592L;

	/**
	 * 结束时间，yyyy-MM-dd HH:mm:ss格式字符串，不传默认为当前时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 当前页码，不传默认为1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页数据量，正整数，不传默认为1000，超过1000也认定为1000
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 开始时间，yyyy-MM-dd HH:mm:ss格式字符串，不传默认为end_time往前推30天
	 */
	@ApiField("start_time")
	private String startTime;

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
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

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
