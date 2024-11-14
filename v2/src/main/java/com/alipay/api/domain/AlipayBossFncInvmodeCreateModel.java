package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 财务开票模式同步
 *
 * @author auto create
 * @since 1.0, 2020-08-31 21:14:23
 */
public class AlipayBossFncInvmodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2869782167434683381L;

	/**
	 * 合同id
	 */
	@ApiField("ar_no")
	private String arNo;

	/**
	 * 所属ou
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 开票模式
01：实收开票（先款后票）
02：应收开票（先票后款）
	 */
	@ApiField("invoice_mode")
	private String invoiceMode;

	/**
	 * 商户pid
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	public String getArNo() {
		return this.arNo;
	}
	public void setArNo(String arNo) {
		this.arNo = arNo;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getInvoiceMode() {
		return this.invoiceMode;
	}
	public void setInvoiceMode(String invoiceMode) {
		this.invoiceMode = invoiceMode;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

}
