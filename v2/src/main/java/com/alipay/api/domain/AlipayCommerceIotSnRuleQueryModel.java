package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询sn申请规则
 *
 * @author auto create
 * @since 1.0, 2023-07-05 14:48:49
 */
public class AlipayCommerceIotSnRuleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8614211296642719751L;

	/**
	 * 厂商id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 厂商id
	 */
	@ApiField("supplier_id")
	private String supplierId;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

}
