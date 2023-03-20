package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 搜索直达升级准入
 *
 * @author auto create
 * @since 1.0, 2023-02-06 11:23:27
 */
public class AlipayOpenSearchboxUpgradePreconsultModel extends AlipayObject {

	private static final long serialVersionUID = 3653611451366672193L;

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
