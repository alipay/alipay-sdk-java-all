package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直达降级准入
 *
 * @author auto create
 * @since 1.0, 2023-07-24 09:52:54
 */
public class AlipayOpenSearchboxDowngradePreconsultModel extends AlipayObject {

	private static final long serialVersionUID = 3745427369335417542L;

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
