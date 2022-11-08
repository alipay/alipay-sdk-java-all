package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构产品信息同步
 *
 * @author auto create
 * @since 1.0, 2022-07-06 19:42:22
 */
public class AntfortuneStockProductSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6694828656925324122L;

	/**
	 * 扩展信息
	 */
	@ApiField("extension")
	private Kv extension;

	/**
	 * 库存状态；
FULL - 充足，TIGHT - 即将售罄，SOLD_OUT - 售罄
	 */
	@ApiField("inventory_state")
	private String inventoryState;

	/**
	 * 机构定义的产品代码
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 产品类型；ELN - 收益凭证
	 */
	@ApiField("prod_type")
	private String prodType;

	/**
	 * 库存剩余金额
	 */
	@ApiField("remain_inventory_amt")
	private String remainInventoryAmt;

	/**
	 * 库存剩余人数
	 */
	@ApiField("remain_inventory_num")
	private Long remainInventoryNum;

	public Kv getExtension() {
		return this.extension;
	}
	public void setExtension(Kv extension) {
		this.extension = extension;
	}

	public String getInventoryState() {
		return this.inventoryState;
	}
	public void setInventoryState(String inventoryState) {
		this.inventoryState = inventoryState;
	}

	public String getProdCode() {
		return this.prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getProdType() {
		return this.prodType;
	}
	public void setProdType(String prodType) {
		this.prodType = prodType;
	}

	public String getRemainInventoryAmt() {
		return this.remainInventoryAmt;
	}
	public void setRemainInventoryAmt(String remainInventoryAmt) {
		this.remainInventoryAmt = remainInventoryAmt;
	}

	public Long getRemainInventoryNum() {
		return this.remainInventoryNum;
	}
	public void setRemainInventoryNum(Long remainInventoryNum) {
		this.remainInventoryNum = remainInventoryNum;
	}

}
