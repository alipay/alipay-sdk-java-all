package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页商品查询
 *
 * @author auto create
 * @since 1.0, 2025-07-07 14:30:03
 */
public class AlipayCommerceEcIndustryinvoiceItemBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3424675492531565994L;

	/**
	 * 企业商品ID
	 */
	@ApiField("company_item_id")
	private String companyItemId;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 外部商品ID
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 用于传入查询的当前页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 用于设置查询的每页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 商品税收分类编码
	 */
	@ApiField("tax_code")
	private String taxCode;

	/**
	 * 企业税号
	 */
	@ApiField("tax_no")
	private String taxNo;

	public String getCompanyItemId() {
		return this.companyItemId;
	}
	public void setCompanyItemId(String companyItemId) {
		this.companyItemId = companyItemId;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
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

	public String getTaxCode() {
		return this.taxCode;
	}
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

}
