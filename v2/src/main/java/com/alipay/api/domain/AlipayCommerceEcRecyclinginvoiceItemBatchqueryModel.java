package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品库分页商品信息
 *
 * @author auto create
 * @since 1.0, 2025-04-22 15:38:20
 */
public class AlipayCommerceEcRecyclinginvoiceItemBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1362158958318131325L;

	/**
	 * 该企业（商户）成功新增的商品ID
	 */
	@ApiField("company_item_id")
	private String companyItemId;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 调用方传入的外部商品ID
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 当前位置的页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页展示的商品信息条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 企业（商户）税收分类编码，可在税收分类编码分页查询中根据产品ID获取对应税收分类编码
	 */
	@ApiField("tax_code")
	private String taxCode;

	/**
	 * 企业（商户）税号
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
