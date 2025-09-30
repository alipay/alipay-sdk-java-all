package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量删除商品
 *
 * @author auto create
 * @since 1.0, 2025-03-19 16:42:12
 */
public class AlipayCommerceMedicalItemBatchDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 7554825186196294159L;

	/**
	 * OMS厂商商品编码, 厂商自行维护
	 */
	@ApiListField("item_code_list")
	@ApiField("string")
	private List<String> itemCodeList;

	/**
	 * OMS厂商门店编码, 厂商自行维护
	 */
	@ApiField("store_code")
	private String storeCode;

	public List<String> getItemCodeList() {
		return this.itemCodeList;
	}
	public void setItemCodeList(List<String> itemCodeList) {
		this.itemCodeList = itemCodeList;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

}
