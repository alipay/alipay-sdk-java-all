package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 总代发货单明细
 *
 * @author auto create
 * @since 1.0, 2025-08-28 16:21:37
 */
public class FxiaoInvoiceDetail extends AlipayObject {

	private static final long serialVersionUID = 1541672374496783364L;

	/**
	 * 验收数量（次）
	 */
	@ApiField("acceptance_count")
	private String acceptanceCount;

	/**
	 * 验收时间
	 */
	@ApiField("acceptance_date")
	private Date acceptanceDate;

	/**
	 * 验收情况
	 */
	@ApiField("acceptance_status")
	private String acceptanceStatus;

	/**
	 * 商品编码
	 */
	@ApiField("commodity_code")
	private String commodityCode;

	/**
	 * 数量
	 */
	@ApiField("commodity_count")
	private String commodityCount;

	/**
	 * 商品名称
	 */
	@ApiField("commodity_name")
	private String commodityName;

	/**
	 * 首年维保结束时间
	 */
	@ApiField("first_year_warranty_end_date")
	private Date firstYearWarrantyEndDate;

	/**
	 * 首年维保开始时间
	 */
	@ApiField("first_year_warranty_start_date")
	private Date firstYearWarrantyStartDate;

	/**
	 * 关联【总代发货单】
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 发货单明细自增编号
	 */
	@ApiField("name")
	private String name;

	/**
	 * 节点数
	 */
	@ApiField("node_count")
	private String nodeCount;

	/**
	 * 价格含税元
	 */
	@ApiField("price")
	private String price;

	/**
	 * 商品类目
	 */
	@ApiField("product_category")
	private String productCategory;

	/**
	 * 产品名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 售卖单位
	 */
	@ApiField("selling_unit")
	private String sellingUnit;

	/**
	 * SKU名称
	 */
	@ApiField("sku_name")
	private String skuName;

	/**
	 * SKU编码
	 */
	@ApiField("sku_no")
	private String skuNo;

	/**
	 * 税率
	 */
	@ApiField("tax_rate")
	private String taxRate;

	/**
	 * 使用年限
	 */
	@ApiField("years_count")
	private String yearsCount;

	public String getAcceptanceCount() {
		return this.acceptanceCount;
	}
	public void setAcceptanceCount(String acceptanceCount) {
		this.acceptanceCount = acceptanceCount;
	}

	public Date getAcceptanceDate() {
		return this.acceptanceDate;
	}
	public void setAcceptanceDate(Date acceptanceDate) {
		this.acceptanceDate = acceptanceDate;
	}

	public String getAcceptanceStatus() {
		return this.acceptanceStatus;
	}
	public void setAcceptanceStatus(String acceptanceStatus) {
		this.acceptanceStatus = acceptanceStatus;
	}

	public String getCommodityCode() {
		return this.commodityCode;
	}
	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
	}

	public String getCommodityCount() {
		return this.commodityCount;
	}
	public void setCommodityCount(String commodityCount) {
		this.commodityCount = commodityCount;
	}

	public String getCommodityName() {
		return this.commodityName;
	}
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}

	public Date getFirstYearWarrantyEndDate() {
		return this.firstYearWarrantyEndDate;
	}
	public void setFirstYearWarrantyEndDate(Date firstYearWarrantyEndDate) {
		this.firstYearWarrantyEndDate = firstYearWarrantyEndDate;
	}

	public Date getFirstYearWarrantyStartDate() {
		return this.firstYearWarrantyStartDate;
	}
	public void setFirstYearWarrantyStartDate(Date firstYearWarrantyStartDate) {
		this.firstYearWarrantyStartDate = firstYearWarrantyStartDate;
	}

	public String getInvoiceNo() {
		return this.invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNodeCount() {
		return this.nodeCount;
	}
	public void setNodeCount(String nodeCount) {
		this.nodeCount = nodeCount;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getProductCategory() {
		return this.productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getSellingUnit() {
		return this.sellingUnit;
	}
	public void setSellingUnit(String sellingUnit) {
		this.sellingUnit = sellingUnit;
	}

	public String getSkuName() {
		return this.skuName;
	}
	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}

	public String getSkuNo() {
		return this.skuNo;
	}
	public void setSkuNo(String skuNo) {
		this.skuNo = skuNo;
	}

	public String getTaxRate() {
		return this.taxRate;
	}
	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}

	public String getYearsCount() {
		return this.yearsCount;
	}
	public void setYearsCount(String yearsCount) {
		this.yearsCount = yearsCount;
	}

}
