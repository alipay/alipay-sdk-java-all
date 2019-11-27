package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户还款分期
 *
 * @author auto create
 * @since 1.0, 2016-09-22 09:43:28
 */
public class Installment extends AlipayObject {

	private static final long serialVersionUID = 3223292644696333871L;

	/**
	 * 账期描述，描述状态或逾期天数
	 */
	@ApiField("installment_desc")
	private String installmentDesc;

	/**
	 * 客户在合作伙伴处的某一个分期id，由合作伙伴根据自身业务定义
	 */
	@ApiField("installment_id")
	private String installmentId;

	/**
	 * 用户在合作伙伴处的某一分期状态:
WATING_REPAY:待还款
OVERDUE:已逾期
REPAID_WAITING_CONFIRM:已还款，待商户确认
CONFIRM_COMPLETE:已销账
CONFIRM_FAILED:销账失败
	 */
	@ApiField("installment_status")
	private String installmentStatus;

	public String getInstallmentDesc() {
		return this.installmentDesc;
	}
	public void setInstallmentDesc(String installmentDesc) {
		this.installmentDesc = installmentDesc;
	}

	public String getInstallmentId() {
		return this.installmentId;
	}
	public void setInstallmentId(String installmentId) {
		this.installmentId = installmentId;
	}

	public String getInstallmentStatus() {
		return this.installmentStatus;
	}
	public void setInstallmentStatus(String installmentStatus) {
		this.installmentStatus = installmentStatus;
	}

}
