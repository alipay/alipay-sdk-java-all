package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 路线元数据检索
 *
 * @author auto create
 * @since 1.0, 2023-10-27 14:13:11
 */
public class AlipayUserSportsplayPathBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8575383615155747228L;

	/**
	 * 路线id
	 */
	@ApiField("path_id")
	private String pathId;

	public String getPathId() {
		return this.pathId;
	}
	public void setPathId(String pathId) {
		this.pathId = pathId;
	}

}
