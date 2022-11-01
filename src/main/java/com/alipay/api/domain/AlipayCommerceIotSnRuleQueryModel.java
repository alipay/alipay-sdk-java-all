package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询sn申请规则
 *
 * @author auto create
 * @since 1.0, 2021-01-28 19:15:52
 */
public class AlipayCommerceIotSnRuleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2874124568667289948L;

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
