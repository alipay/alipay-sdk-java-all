package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合约参与者选择器，根据参与者查询合约编号
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class ArrangementInvolvedPartyQuerier extends AlipayObject {

	private static final long serialVersionUID = 2636817872237449129L;

	/**
	 * 参与者id
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 用户uid/参与者角色id
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 参与者角色类型，为空时表示所有类型都查询.
可选值：01 甲方 11 乙方 21丙方
	 */
	@ApiField("ip_type")
	private String ipType;

	public String getIpId() {
		return this.ipId;
	}
	public void setIpId(String ipId) {
		this.ipId = ipId;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getIpType() {
		return this.ipType;
	}
	public void setIpType(String ipType) {
		this.ipType = ipType;
	}

}
