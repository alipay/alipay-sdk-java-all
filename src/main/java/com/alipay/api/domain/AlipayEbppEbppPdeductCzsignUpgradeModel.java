package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 充值协议升级接口
 *
 * @author auto create
 * @since 1.0, 2020-06-23 14:18:49
 */
public class AlipayEbppEbppPdeductCzsignUpgradeModel extends AlipayObject {

	private static final long serialVersionUID = 3544421858683823162L;

	/**
	 * 行业代扣协议ID
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/**
	 * 机构PID
	 */
	@ApiField("pid")
	private String pid;

	public String getAgreementId() {
		return this.agreementId;
	}
	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

}
