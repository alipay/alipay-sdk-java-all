package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 出库物料详情信息
 *
 * @author auto create
 * @since 1.0, 2019-05-30 23:23:40
 */
public class OutStockStuffInfo extends AlipayObject {

	private static final long serialVersionUID = 6494593477734371484L;

	/**
	 * 实出库数量
	 */
	@ApiField("actual_qty")
	private Long actualQty;

	/**
	 * 扩展
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 物料sku
	 */
	@ApiField("sku_no")
	private String skuNo;

	public Long getActualQty() {
		return this.actualQty;
	}
	public void setActualQty(Long actualQty) {
		this.actualQty = actualQty;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getSkuNo() {
		return this.skuNo;
	}
	public void setSkuNo(String skuNo) {
		this.skuNo = skuNo;
	}

}
