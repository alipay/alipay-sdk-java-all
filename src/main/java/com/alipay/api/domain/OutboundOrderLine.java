package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出库通知单明细对象
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:39:41
 */
public class OutboundOrderLine extends AlipayObject {

	private static final long serialVersionUID = 8842829936571913731L;

	/**
	 * 批次编号
	 */
	@ApiField("batch_code")
	private String batchCode;

	/**
	 * 货品过期日期
	 */
	@ApiField("expire_date")
	private Date expireDate;

	/**
	 * 货品编码
	 */
	@ApiField("goods_code")
	private String goodsCode;

	/**
	 * ZP("正品"),CC("残次"), JS("机损"),XS("箱损"),ZT("在途库存");
	 */
	@ApiField("inventory_type")
	private String inventoryType;

	/**
	 * 计划出库量
	 */
	@ApiField("plan_quantity")
	private Long planQuantity;

	/**
	 * 价格(单位元，保留2为小数)
	 */
	@ApiField("price")
	private String price;

	/**
	 * 货品生产日期
	 */
	@ApiField("product_date")
	private Date productDate;

	/**
	 * 备注信息。
	 */
	@ApiField("remark")
	private String remark;

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

	public Long getPlanQuantity() {
		return this.planQuantity;
	}
	public void setPlanQuantity(Long planQuantity) {
		this.planQuantity = planQuantity;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
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

}
