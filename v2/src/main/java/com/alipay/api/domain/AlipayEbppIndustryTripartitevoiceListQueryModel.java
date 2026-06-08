package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 一网通办客诉分页查询
 *
 * @author auto create
 * @since 1.0, 2026-05-29 10:47:50
 */
public class AlipayEbppIndustryTripartitevoiceListQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2536972328417281299L;

	/**
	 * 格式 yyyy-MM-dd，只能查 1 天的数据，不允许跨天
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * 页码，默认 1，从 1 开始
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 每页条数，默认 100，最大 1000
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 状态过滤；不传=查全部；多状态用半角逗号分隔（如 INIT,QUESTION_COMPLETED）
	 */
	@ApiField("process_status")
	private String processStatus;

	public String getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

	public String getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getProcessStatus() {
		return this.processStatus;
	}
	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
	}

}
