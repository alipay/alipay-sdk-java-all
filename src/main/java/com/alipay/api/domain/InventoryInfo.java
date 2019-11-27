package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 押品资产信息描述
 *
 * @author auto create
 * @since 1.0, 2018-04-03 17:33:32
 */
public class InventoryInfo extends AlipayObject {

	private static final long serialVersionUID = 8436335887568236267L;

	/**
	 * 资产扩展参数
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 资产数量
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 资产类型id编号
	 */
	@ApiField("sku_id")
	private String skuId;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}
