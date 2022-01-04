package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除客服接口
 *
 * @author auto create
 * @since 1.0, 2020-12-10 14:22:24
 */
public class AlipayIserviceCcmAgentDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2196863337183447232L;

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
