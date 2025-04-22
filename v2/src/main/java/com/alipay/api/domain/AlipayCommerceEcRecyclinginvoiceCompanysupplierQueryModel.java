package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应商查询
 *
 * @author auto create
 * @since 1.0, 2025-04-22 15:37:52
 */
public class AlipayCommerceEcRecyclinginvoiceCompanysupplierQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7454576724319187582L;

	/**
	 * 请求方传入的外部供应商ID
	 */
	@ApiField("outer_supplier_id")
	private String outerSupplierId;

	/**
	 * 当前页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页显示数据的条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 新增成功的供应商ID
	 */
	@ApiField("supplier_id")
	private String supplierId;

	/**
	 * 企业（商户）税号
	 */
	@ApiField("tax_no")
	private String taxNo;

	public String getOuterSupplierId() {
		return this.outerSupplierId;
	}
	public void setOuterSupplierId(String outerSupplierId) {
		this.outerSupplierId = outerSupplierId;
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

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

}
