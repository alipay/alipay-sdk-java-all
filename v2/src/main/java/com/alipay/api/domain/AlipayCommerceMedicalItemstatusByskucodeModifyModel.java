package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 通过skuCode批量上下架商品
 *
 * @author auto create
 * @since 1.0, 2025-05-30 15:08:24
 */
public class AlipayCommerceMedicalItemstatusByskucodeModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4199115327354625135L;

	/**
	 * 要操作上下架的商品, skuCode和操作类型信息
	 */
	@ApiListField("sku_info_list")
	@ApiField("sku_code_status_param")
	private List<SkuCodeStatusParam> skuInfoList;

	/**
	 * OMS厂商门店编码，用于标识定位要操作商品的指定门店, 创建门店时设置的值
	 */
	@ApiField("store_code")
	private String storeCode;

	public List<SkuCodeStatusParam> getSkuInfoList() {
		return this.skuInfoList;
	}
	public void setSkuInfoList(List<SkuCodeStatusParam> skuInfoList) {
		this.skuInfoList = skuInfoList;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

}
