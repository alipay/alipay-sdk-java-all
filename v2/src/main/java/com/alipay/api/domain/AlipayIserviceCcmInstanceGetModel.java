package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询单个租户实例（数据权限）
 *
 * @author auto create
 * @since 1.0, 2022-11-09 11:19:38
 */
public class AlipayIserviceCcmInstanceGetModel extends AlipayObject {

	private static final long serialVersionUID = 1133843662249974697L;

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
