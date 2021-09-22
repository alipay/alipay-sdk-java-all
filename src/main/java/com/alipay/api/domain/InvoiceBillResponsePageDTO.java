package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票关联的账单
 *
 * @author auto create
 * @since 1.0, 2021-08-02 19:27:06
 */
public class InvoiceBillResponsePageDTO extends AlipayObject {

	private static final long serialVersionUID = 6821737466463329581L;

	/**
	 * 当前数据页码
	 */
	@ApiField("current_page")
	private Long currentPage;

	/**
	 * 发票关联的账单
	 */
	@ApiField("datas")
	private InvoiceBillResponseDTO datas;

	/**
	 * 每页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 总记录
	 */
	@ApiField("total_count")
	private Long totalCount;

	public Long getCurrentPage() {
		return this.currentPage;
	}
	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

	public InvoiceBillResponseDTO getDatas() {
		return this.datas;
	}
	public void setDatas(InvoiceBillResponseDTO datas) {
		this.datas = datas;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

}
