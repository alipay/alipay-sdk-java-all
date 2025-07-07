package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量更新sku编码
 *
 * @author auto create
 * @since 1.0, 2025-02-13 23:23:31
 */
public class AlipayCommerceMedicalSkuCodeModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2899568754426399645L;

	/**
	 * 商家需要修改的旧sku店内码&新sku店内码组合列表
	 */
	@ApiListField("sku_code_mapping_list")
	@ApiField("sku_code_mapping_param")
	private List<SkuCodeMappingParam> skuCodeMappingList;

	/**
	 * app方门店编码, 用于标识定位要操作商品的指定门店, 创建门店时设置的值
	 */
	@ApiField("store_code")
	private String storeCode;

	public List<SkuCodeMappingParam> getSkuCodeMappingList() {
		return this.skuCodeMappingList;
	}
	public void setSkuCodeMappingList(List<SkuCodeMappingParam> skuCodeMappingList) {
		this.skuCodeMappingList = skuCodeMappingList;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

}
