package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 检测项信息
 *
 * @author auto create
 * @since 1.0, 2026-09-14 16:08:39
 */
public class CheckItemData extends AlipayObject {

	private static final long serialVersionUID = 3332299562359483155L;

	/**
	 * 就检状态：TO_CHECK：项目待就检；CHECKED：项目已就检
	 */
	@ApiField("check_status")
	private String checkStatus;

	/**
	 * 检测项名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 外部商品编码
	 */
	@ApiField("sku_code")
	private String skuCode;

	public String getCheckStatus() {
		return this.checkStatus;
	}
	public void setCheckStatus(String checkStatus) {
		this.checkStatus = checkStatus;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getSkuCode() {
		return this.skuCode;
	}
	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

}
