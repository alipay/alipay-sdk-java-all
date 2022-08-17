package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询单个租户实例（数据权限）
 *
 * @author auto create
 * @since 1.0, 2020-12-10 14:24:37
 */
public class AlipayIserviceCcmInstanceGetModel extends AlipayObject {

	private static final long serialVersionUID = 3681359391986112361L;

	/**
	 * 外部id
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 部门id（即租户实例ID、数据权限ID）
	 */
	@ApiField("id")
	private String id;

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
