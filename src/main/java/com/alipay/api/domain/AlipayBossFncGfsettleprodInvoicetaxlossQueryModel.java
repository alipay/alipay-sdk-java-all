package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询发票税损金额
 *
 * @author auto create
 * @since 1.0, 2021-08-05 15:25:47
 */
public class AlipayBossFncGfsettleprodInvoicetaxlossQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7166355988429117857L;

	/**
	 * 账单号
	 */
	@ApiField("bill_nos")
	private String billNos;

	/**
	 * PID
	 */
	@ApiField("settle_ip_role_id")
	private String settleIpRoleId;

	public String getBillNos() {
		return this.billNos;
	}
	public void setBillNos(String billNos) {
		this.billNos = billNos;
	}

	public String getSettleIpRoleId() {
		return this.settleIpRoleId;
	}
	public void setSettleIpRoleId(String settleIpRoleId) {
		this.settleIpRoleId = settleIpRoleId;
	}

}
