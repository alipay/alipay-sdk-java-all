package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁统一结算付款申请单查询
 *
 * @author auto create
 * @since 1.0, 2021-09-28 14:24:27
 */
public class AlipayBossProdGfsettleprodApplyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7864662255895411622L;

	/**
	 * 合约号，等同于集采PO号
	 */
	@ApiField("arrangement_no")
	private String arrangementNo;

	/**
	 * 供应商支付宝2088账号
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 单据类型
	 */
	@ApiField("type")
	private String type;

	public String getArrangementNo() {
		return this.arrangementNo;
	}
	public void setArrangementNo(String arrangementNo) {
		this.arrangementNo = arrangementNo;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
