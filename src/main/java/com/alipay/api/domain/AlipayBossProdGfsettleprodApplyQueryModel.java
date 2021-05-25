package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁统一结算付款申请单查询
 *
 * @author auto create
 * @since 1.0, 2021-01-29 15:43:17
 */
public class AlipayBossProdGfsettleprodApplyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4459268474383469531L;

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

}
