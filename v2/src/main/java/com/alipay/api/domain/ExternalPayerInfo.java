package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部付款人信息
 *
 * @author auto create
 * @since 1.0, 2026-01-29 21:32:46
 */
public class ExternalPayerInfo extends AlipayObject {

	private static final long serialVersionUID = 1579614474132974259L;

	/**
	 * 机构卡信息
	 */
	@ApiField("out_inst_card_no")
	private String outInstCardNo;

	/**
	 * 机构编码
	 */
	@ApiField("out_inst_payer_inst_id")
	private String outInstPayerInstId;

	/**
	 * 代理企业支付中，企业的名称
	 */
	@ApiField("out_payer_account_name")
	private String outPayerAccountName;

	public String getOutInstCardNo() {
		return this.outInstCardNo;
	}
	public void setOutInstCardNo(String outInstCardNo) {
		this.outInstCardNo = outInstCardNo;
	}

	public String getOutInstPayerInstId() {
		return this.outInstPayerInstId;
	}
	public void setOutInstPayerInstId(String outInstPayerInstId) {
		this.outInstPayerInstId = outInstPayerInstId;
	}

	public String getOutPayerAccountName() {
		return this.outPayerAccountName;
	}
	public void setOutPayerAccountName(String outPayerAccountName) {
		this.outPayerAccountName = outPayerAccountName;
	}

}
