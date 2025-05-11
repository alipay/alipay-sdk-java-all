package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务关键词批量查询
 *
 * @author auto create
 * @since 1.0, 2023-11-15 15:43:35
 */
public class AlipayOpenSearchSubservicekeywordBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7854769742158743186L;

	/**
	 * 分页参数，分页查询时使用
	 */
	@ApiField("page_number")
	private Long pageNumber;

	/**
	 * 分页参数，分页查询时使用
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 审核状态，服务关键词的审核状态，枚举值，不传该字段表示查询所有状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 小程序id
	 */
	@ApiField("target_appid")
	private String targetAppid;

	public Long getPageNumber() {
		return this.pageNumber;
	}
	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTargetAppid() {
		return this.targetAppid;
	}
	public void setTargetAppid(String targetAppid) {
		this.targetAppid = targetAppid;
	}

}
