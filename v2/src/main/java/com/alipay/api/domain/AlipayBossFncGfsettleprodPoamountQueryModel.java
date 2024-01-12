package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 统一结算查询PO已付款金额
 *
 * @author auto create
 * @since 1.0, 2021-09-28 14:26:45
 */
public class AlipayBossFncGfsettleprodPoamountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1429583573578939996L;

	/**
	 * PO号
	 */
	@ApiField("arrangement_no")
	private String arrangementNo;

	/**
	 * 供应商蚂蚁2088账号PID
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
