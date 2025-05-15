package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 搜索直达升级准入
 *
 * @author auto create
 * @since 1.0, 2023-06-12 16:39:34
 */
public class AlipayOpenSearchboxUpgradePreconsultModel extends AlipayObject {

	private static final long serialVersionUID = 7163868428851468215L;

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
