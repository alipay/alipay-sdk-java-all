package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 入库单明细模型
 *
 * @author auto create
 * @since 1.0, 2019-05-30 23:23:21
 */
public class StuffStockInOrderItem extends AlipayObject {

	private static final long serialVersionUID = 3663514543278417286L;

	/**
	 * 扩展字段
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 入库单物料数量
	 */
	@ApiField("qty")
	private Long qty;

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

	public Long getQty() {
		return this.qty;
	}
	public void setQty(Long qty) {
		this.qty = qty;
	}

	public String getSkuNo() {
		return this.skuNo;
	}
	public void setSkuNo(String skuNo) {
		this.skuNo = skuNo;
	}

}
