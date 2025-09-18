package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量查询sku信息
 *
 * @author auto create
 * @since 1.0, 2025-02-13 23:23:34
 */
public class AlipayCommerceMedicalSkuBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5545591687818719363L;

	/**
	 * 商家自定义店内码/货号列表，店内码门店内唯一
	 */
	@ApiListField("sku_code_list")
	@ApiField("string")
	private List<String> skuCodeList;

	/**
	 * OMS厂商门店编码, 录入门店时填写的值, 厂商自行维护
	 */
	@ApiField("store_code")
	private String storeCode;

	public List<String> getSkuCodeList() {
		return this.skuCodeList;
	}
	public void setSkuCodeList(List<String> skuCodeList) {
		this.skuCodeList = skuCodeList;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

}
