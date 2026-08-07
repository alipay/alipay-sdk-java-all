package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询批次单列表
 *
 * @author auto create
 * @since 1.0, 2026-07-29 09:51:22
 */
public class AlipayCommerceEcRecyclinginvoiceDepositQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3873668559436745449L;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页多少条
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 发票产品ID
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 企业税号
	 */
	@ApiField("tax_no")
	private String taxNo;

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

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

}
