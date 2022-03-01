package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供货商盘点单明细
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:30:38
 */
public class SupplierReportDetail extends AlipayObject {

	private static final long serialVersionUID = 3714188578198671375L;

	/**
	 * 批次编码
	 */
	@ApiField("batch_code")
	private String batchCode;

	/**
	 * 过期日期
	 */
	@ApiField("expire_date")
	private Date expireDate;

	/**
	 * 货品编码
	 */
	@ApiField("goods_code")
	private String goodsCode;

	/**
	 * 库存类型
	 */
	@ApiField("inventory_type")
	private String inventoryType;

	/**
	 * 价格
	 */
	@ApiField("price")
	private String price;

	/**
	 * 生产日期
	 */
	@ApiField("production_date")
	private Date productionDate;

	/**
	 * 差异数量,为正整数
	 */
	@ApiField("quantity_diff")
	private Long quantityDiff;

	/**
	 * 盘盈/盘亏(increase/reduce)
	 */
	@ApiField("report_type")
	private String reportType;

	/**
	 * 供货商盘点单明细id
	 */
	@ApiField("supplier_report_detail_id")
	private String supplierReportDetailId;

	/**
	 * 供货商盘点单id
	 */
	@ApiField("supplier_report_id")
	private String supplierReportId;

	public String getBatchCode() {
		return this.batchCode;
	}
	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}

	public Date getExpireDate() {
		return this.expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public String getGoodsCode() {
		return this.goodsCode;
	}
	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}

	public String getInventoryType() {
		return this.inventoryType;
	}
	public void setInventoryType(String inventoryType) {
		this.inventoryType = inventoryType;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public Date getProductionDate() {
		return this.productionDate;
	}
	public void setProductionDate(Date productionDate) {
		this.productionDate = productionDate;
	}

	public Long getQuantityDiff() {
		return this.quantityDiff;
	}
	public void setQuantityDiff(Long quantityDiff) {
		this.quantityDiff = quantityDiff;
	}

	public String getReportType() {
		return this.reportType;
	}
	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public String getSupplierReportDetailId() {
		return this.supplierReportDetailId;
	}
	public void setSupplierReportDetailId(String supplierReportDetailId) {
		this.supplierReportDetailId = supplierReportDetailId;
	}

	public String getSupplierReportId() {
		return this.supplierReportId;
	}
	public void setSupplierReportId(String supplierReportId) {
		this.supplierReportId = supplierReportId;
	}

}
