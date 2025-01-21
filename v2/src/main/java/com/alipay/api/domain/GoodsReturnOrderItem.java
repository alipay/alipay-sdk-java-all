package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退货明细
 *
 * @author auto create
 * @since 1.0, 2019-06-25 17:56:23
 */
public class GoodsReturnOrderItem extends AlipayObject {

	private static final long serialVersionUID = 5188811668423272735L;

	/**
	 * 扩展字段
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 单价，单位：元，没有设置0
	 */
	@ApiField("price")
	private String price;

	/**
	 * 数量
	 */
	@ApiField("qty")
	private String qty;

	/**
	 * sku名称
	 */
	@ApiField("sku_name")
	private String skuName;

	/**
	 * sku号
	 */
	@ApiField("sku_no")
	private String skuNo;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getQty() {
		return this.qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
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

}
