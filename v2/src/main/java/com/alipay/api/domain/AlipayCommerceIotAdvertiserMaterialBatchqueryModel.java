package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物料批量查询
 *
 * @author auto create
 * @since 1.0, 2021-06-16 16:43:17
 */
public class AlipayCommerceIotAdvertiserMaterialBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1434558275714426276L;

	/**
	 * 查询总数
	 */
	@ApiField("only_total")
	private Boolean onlyTotal;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 页大小(<=50)
	 */
	@ApiField("page_size")
	private Long pageSize;

	public Boolean getOnlyTotal() {
		return this.onlyTotal;
	}
	public void setOnlyTotal(Boolean onlyTotal) {
		this.onlyTotal = onlyTotal;
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
