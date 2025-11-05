package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租赁sku信息
 *
 * @author auto create
 * @since 1.0, 2025-10-22 10:59:42
 */
public class RentSkuInfo extends AlipayObject {

	private static final long serialVersionUID = 8534516967585916354L;

	/**
	 * sku属性信息
	 */
	@ApiListField("attrs")
	@ApiField("rent_sku_attr_info")
	private List<RentSkuAttrInfo> attrs;

	/**
	 * 商家侧SKUID
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 平台SPUID
	 */
	@ApiField("spu_id")
	private String spuId;

	public List<RentSkuAttrInfo> getAttrs() {
		return this.attrs;
	}
	public void setAttrs(List<RentSkuAttrInfo> attrs) {
		this.attrs = attrs;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

	public String getSpuId() {
		return this.spuId;
	}
	public void setSpuId(String spuId) {
		this.spuId = spuId;
	}

}
