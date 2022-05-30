package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 作业明细模型
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:33:37
 */
public class WorkDetail extends AlipayObject {

	private static final long serialVersionUID = 4476197259582299327L;

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
	 * 扩展字段，json格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 货品编号
	 */
	@ApiField("goods_code")
	private String goodsCode;

	/**
	 * 库存类型，ZP=正品, CC=残次, JS=机损, XS=箱损, 默认为ZP
	 */
	@ApiField("inventory_type")
	private String inventoryType;

	/**
	 * 价格，单位元，两位小数
	 */
	@ApiField("price")
	private String price;

	/**
	 * 货品生产日期
	 */
	@ApiField("production_date")
	private Date productionDate;

	/**
	 * 实际作业数量
	 */
	@ApiField("quantity")
	private Long quantity;

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

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
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

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

}
