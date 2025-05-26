package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量更新sku信息
 *
 * @author auto create
 * @since 1.0, 2025-02-13 23:23:33
 */
public class AlipayCommerceMedicalSkuModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5847452113652866611L;

	/**
	 * 需要修改的sku信息列表，包括店内码，价格，货架码，重量，体积
	 */
	@ApiListField("sku_list")
	@ApiField("sku_simple_info_param")
	private List<SkuSimpleInfoParam> skuList;

	/**
	 * OMS厂商门店编码, 录入门店时填写的值, 厂商自行维护
	 */
	@ApiField("store_code")
	private String storeCode;

	public List<SkuSimpleInfoParam> getSkuList() {
		return this.skuList;
	}
	public void setSkuList(List<SkuSimpleInfoParam> skuList) {
		this.skuList = skuList;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

}
