package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 组织架构查询
 *
 * @author auto create
 * @since 1.0, 2023-07-10 10:04:36
 */
public class AlipayIserviceIsresourceOrganizationqueryallQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3342161473573121672L;

	/**
	 * 租户id
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
