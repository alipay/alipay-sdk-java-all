package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 应付账单
 *
 * @author auto create
 * @since 1.0, 2021-09-28 14:28:46
 */
public class ApSummaryBillPageDTO extends AlipayObject {

	private static final long serialVersionUID = 4268913244875137985L;

	/**
	 * 当前数据页码
	 */
	@ApiField("current_page")
	private Long currentPage;

	/**
	 * 结果
	 */
	@ApiField("datas")
	private ApSummaryBillResponseDTO datas;

	/**
	 * 每页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 数据总条数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public Long getCurrentPage() {
		return this.currentPage;
	}
	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

	public ApSummaryBillResponseDTO getDatas() {
		return this.datas;
	}
	public void setDatas(ApSummaryBillResponseDTO datas) {
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
