package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通过租户id查询租户信息
 *
 * @author auto create
 * @since 1.0, 2023-07-10 10:03:23
 */
public class AlipayIserviceIsresourceTenantquerybytntidQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1379876952186281288L;

	/**
	 * 租户id
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	/**
	 * 人力资源id
	 */
	@ApiField("ur_id")
	private String urId;

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

	public String getUrId() {
		return this.urId;
	}
	public void setUrId(String urId) {
		this.urId = urId;
	}

}
