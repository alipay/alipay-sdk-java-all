package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开票申请明细查询
 *
 * @author auto create
 * @since 1.0, 2023-08-01 19:09:32
 */
public class AlipayCommerceEcTcnInvoiceapplydetailBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7514212293563627215L;

	/**
	 * 申请ID
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * 页号
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getApplyId() {
		return this.applyId;
	}
	public void setApplyId(String applyId) {
		this.applyId = applyId;
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
