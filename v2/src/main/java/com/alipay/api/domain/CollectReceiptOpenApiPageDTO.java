package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收款单openapi分页DTO
 *
 * @author auto create
 * @since 1.0, 2021-09-24 13:53:01
 */
public class CollectReceiptOpenApiPageDTO extends AlipayObject {

	private static final long serialVersionUID = 8216822554847535923L;

	/**
	 * 当前数据页码
	 */
	@ApiField("current_page")
	private Long currentPage;

	/**
	 * 收款单数据集
	 */
	@ApiField("datas")
	private CollectReceiptOpenApiDTO datas;

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

	public CollectReceiptOpenApiDTO getDatas() {
		return this.datas;
	}
	public void setDatas(CollectReceiptOpenApiDTO datas) {
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
