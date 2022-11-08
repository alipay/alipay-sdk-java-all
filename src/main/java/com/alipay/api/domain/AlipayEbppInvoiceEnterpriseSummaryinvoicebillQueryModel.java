package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询企业汇总开票账单明细
 *
 * @author auto create
 * @since 1.0, 2022-06-20 10:25:35
 */
public class AlipayEbppInvoiceEnterpriseSummaryinvoicebillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5469152919419268541L;

	/**
	 * 汇总开票批次ID
	 */
	@ApiField("batch_id")
	private String batchId;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页行数
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getBatchId() {
		return this.batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
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

}
