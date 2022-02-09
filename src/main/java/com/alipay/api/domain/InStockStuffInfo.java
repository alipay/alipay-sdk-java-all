package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物料入库详情对象
 *
 * @author auto create
 * @since 1.0, 2019-05-30 23:23:46
 */
public class InStockStuffInfo extends AlipayObject {

	private static final long serialVersionUID = 8138327631854788988L;

	/**
	 * 实收数量
	 */
	@ApiField("actual_qty")
	private String actualQty;

	/**
	 * 扩展字段
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 计划数量
	 */
	@ApiField("plan_qty")
	private Long planQty;

	/**
	 * 物料sku
	 */
	@ApiField("sku_no")
	private String skuNo;

	public String getActualQty() {
		return this.actualQty;
	}
	public void setActualQty(String actualQty) {
		this.actualQty = actualQty;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public Long getPlanQty() {
		return this.planQty;
	}
	public void setPlanQty(Long planQty) {
		this.planQty = planQty;
	}

	public String getSkuNo() {
		return this.skuNo;
	}
	public void setSkuNo(String skuNo) {
		this.skuNo = skuNo;
	}

}
