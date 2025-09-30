package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 库存信息
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:30:33
 */
public class Inventory extends AlipayObject {

	private static final long serialVersionUID = 5775634412792455535L;

	/**
	 * 批次编号
	 */
	@ApiField("batch_code")
	private String batchCode;

	/**
	 * 过期时间
	 */
	@ApiField("expire_date")
	private Date expireDate;

	/**
	 * 扩展字段，json格式
	 */
	@ApiField("extend_props")
	private String extendProps;

	/**
	 * 创建日期
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改日期
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 货品编码
	 */
	@ApiField("goods_code")
	private String goodsCode;

	/**
	 * 货品类型：ZP("正品"), CC("残次"), JS("机损"),  XS("箱损"),ZT("在途库存")
	 */
	@ApiField("inventory_type")
	private String inventoryType;

	/**
	 * 锁定数量
	 */
	@ApiField("lock_quantity")
	private Long lockQuantity;

	/**
	 * 生产日期
	 */
	@ApiField("product_date")
	private Date productDate;

	/**
	 * 可用数量
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 实际数量
	 */
	@ApiField("real_quantity")
	private Long realQuantity;

	/**
	 * 仓库编码
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

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

	public String getExtendProps() {
		return this.extendProps;
	}
	public void setExtendProps(String extendProps) {
		this.extendProps = extendProps;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
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

	public Long getLockQuantity() {
		return this.lockQuantity;
	}
	public void setLockQuantity(Long lockQuantity) {
		this.lockQuantity = lockQuantity;
	}

	public Date getProductDate() {
		return this.productDate;
	}
	public void setProductDate(Date productDate) {
		this.productDate = productDate;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getRealQuantity() {
		return this.realQuantity;
	}
	public void setRealQuantity(Long realQuantity) {
		this.realQuantity = realQuantity;
	}

	public String getWarehouseCode() {
		return this.warehouseCode;
	}
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

}
