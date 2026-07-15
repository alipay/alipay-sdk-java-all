package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 农户删除接口
 *
 * @author auto create
 * @since 1.0, 2026-06-16 16:50:36
 */
public class AlipayCommerceEcRecyclinginvoiceFarmerDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 8848894986332258976L;

	/**
	 * 农户ID
	 */
	@ApiField("farmer_id")
	private String farmerId;

	public String getFarmerId() {
		return this.farmerId;
	}
	public void setFarmerId(String farmerId) {
		this.farmerId = farmerId;
	}

}
