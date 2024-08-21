package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 库存变更记录
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:33:27
 */
public class InventoryRecord extends AlipayObject {

	private static final long serialVersionUID = 2334459837714916483L;

	/**
	 * 可用库存变更之后
	 */
	@ApiField("after_modify_lock_quantity")
	private Long afterModifyLockQuantity;

	/**
	 * 可用库存变更之后
	 */
	@ApiField("after_modify_quantity")
	private Long afterModifyQuantity;

	/**
	 * 批次号
	 */
	@ApiField("batch_code")
	private String batchCode;

	/**
	 * 占用库存变更之前
	 */
	@ApiField("before_modify_lock_quantity")
	private String beforeModifyLockQuantity;

	/**
	 * 可用库存变更之前
	 */
	@ApiField("before_modify_quantity")
	private Long beforeModifyQuantity;

	/**
	 * 占用库存
	 */
	@ApiField("diff_lock_quantity")
	private Long diffLockQuantity;

	/**
	 * 可用库存变化量
	 */
	@ApiField("diff_quantity")
	private Long diffQuantity;

	/**
	 * 过期日期
	 */
	@ApiField("expire_date")
	private Date expireDate;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 商品编码
	 */
	@ApiField("goods_code")
	private String goodsCode;

	/**
	 * 库存类型（ZP=正品, CC=残次,JS=机损, XS= 箱损, ZT=在途库存）
	 */
	@ApiField("inventory_type")
	private String inventoryType;

	/**
	 * 操作类型（INBOUND＝入库
OUTBOUND＝出库）
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 外部订单号
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 生产日期
	 */
	@ApiField("product_date")
	private Date productDate;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 仓库编码
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

	public Long getAfterModifyLockQuantity() {
		return this.afterModifyLockQuantity;
	}
	public void setAfterModifyLockQuantity(Long afterModifyLockQuantity) {
		this.afterModifyLockQuantity = afterModifyLockQuantity;
	}

	public Long getAfterModifyQuantity() {
		return this.afterModifyQuantity;
	}
	public void setAfterModifyQuantity(Long afterModifyQuantity) {
		this.afterModifyQuantity = afterModifyQuantity;
	}

	public String getBatchCode() {
		return this.batchCode;
	}
	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}

	public String getBeforeModifyLockQuantity() {
		return this.beforeModifyLockQuantity;
	}
	public void setBeforeModifyLockQuantity(String beforeModifyLockQuantity) {
		this.beforeModifyLockQuantity = beforeModifyLockQuantity;
	}

	public Long getBeforeModifyQuantity() {
		return this.beforeModifyQuantity;
	}
	public void setBeforeModifyQuantity(Long beforeModifyQuantity) {
		this.beforeModifyQuantity = beforeModifyQuantity;
	}

	public Long getDiffLockQuantity() {
		return this.diffLockQuantity;
	}
	public void setDiffLockQuantity(Long diffLockQuantity) {
		this.diffLockQuantity = diffLockQuantity;
	}

	public Long getDiffQuantity() {
		return this.diffQuantity;
	}
	public void setDiffQuantity(Long diffQuantity) {
		this.diffQuantity = diffQuantity;
	}

	public Date getExpireDate() {
		return this.expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
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

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

	public Date getProductDate() {
		return this.productDate;
	}
	public void setProductDate(Date productDate) {
		this.productDate = productDate;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getWarehouseCode() {
		return this.warehouseCode;
	}
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

}
