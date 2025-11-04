package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 通过itemCode批量查询商品详情
 *
 * @author auto create
 * @since 1.0, 2025-02-13 23:23:35
 */
public class AlipayCommerceMedicalItemBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1679395216243276455L;

	/**
	 * OMS厂商商品编码列表
	 */
	@ApiListField("item_code_list")
	@ApiField("string")
	private List<String> itemCodeList;

	/**
	 * OMS厂商门店编码, 录入门店时填写的值, 厂商自行维护
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
