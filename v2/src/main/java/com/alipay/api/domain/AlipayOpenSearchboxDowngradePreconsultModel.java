package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直达降级准入
 *
 * @author auto create
 * @since 1.0, 2023-02-06 11:23:43
 */
public class AlipayOpenSearchboxDowngradePreconsultModel extends AlipayObject {

	private static final long serialVersionUID = 1199315677146479772L;

	/**
	 * 搜索直达boxId
	 */
	@ApiField("box_id")
	private String boxId;

	public String getBoxId() {
		return this.boxId;
	}
	public void setBoxId(String boxId) {
		this.boxId = boxId;
	}

}
