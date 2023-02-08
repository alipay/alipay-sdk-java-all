package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除客服接口
 *
 * @author auto create
 * @since 1.0, 2022-11-09 11:17:43
 */
public class AlipayIserviceCcmAgentDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 3151323123293357823L;

	/**
	 * 客服id
	 */
	@ApiField("id")
	private String id;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
