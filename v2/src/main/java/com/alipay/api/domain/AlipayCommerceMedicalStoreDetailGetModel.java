package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量获取门店详细信息
 *
 * @author auto create
 * @since 1.0, 2025-03-19 16:22:36
 */
public class AlipayCommerceMedicalStoreDetailGetModel extends AlipayObject {

	private static final long serialVersionUID = 3265475852486942627L;

	/**
	 * 支持传多个门店批量查询，一次调用可上传100个门店id，可通过接口alipay.commerce.medical.store.codelist.get获取商家入驻成功的所有门店编码
	 */
	@ApiListField("store_codes")
	@ApiField("string")
	private List<String> storeCodes;

	public List<String> getStoreCodes() {
		return this.storeCodes;
	}
	public void setStoreCodes(List<String> storeCodes) {
		this.storeCodes = storeCodes;
	}

}
