package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直达降级准入
 *
 * @author auto create
 * @since 1.0, 2023-06-12 16:19:22
 */
public class AlipayOpenSearchboxDowngradePreconsultModel extends AlipayObject {

	private static final long serialVersionUID = 4377834433386418724L;

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
