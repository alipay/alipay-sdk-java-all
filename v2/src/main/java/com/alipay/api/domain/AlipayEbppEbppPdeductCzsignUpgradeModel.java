package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 充值协议升级接口
 *
 * @author auto create
 * @since 1.0, 2022-12-20 12:11:00
 */
public class AlipayEbppEbppPdeductCzsignUpgradeModel extends AlipayObject {

	private static final long serialVersionUID = 5258849779915277715L;

	/**
	 * 行业代扣协议ID
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/**
	 * 修复的金额数字
	 */
	@ApiField("fix_amount")
	private Long fixAmount;

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

	public Long getFixAmount() {
		return this.fixAmount;
	}
	public void setFixAmount(Long fixAmount) {
		this.fixAmount = fixAmount;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

}
