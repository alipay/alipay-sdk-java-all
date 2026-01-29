package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小二人工结算信息通知
 *
 * @author auto create
 * @since 1.0, 2025-10-23 16:08:16
 */
public class AlipayMsaasMediarecogMmtcaftscvInnermanualinfoNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 5685569996935636447L;

	/**
	 * 外部原因
	 */
	@ApiField("external_reason")
	private String externalReason;

	/**
	 * 人工类型
	 */
	@ApiField("manual_type")
	private String manualType;

	/**
	 * 交易号
	 */
	@ApiField("transaction_id")
	private String transactionId;

	public String getExternalReason() {
		return this.externalReason;
	}
	public void setExternalReason(String externalReason) {
		this.externalReason = externalReason;
	}

	public String getManualType() {
		return this.manualType;
	}
	public void setManualType(String manualType) {
		this.manualType = manualType;
	}

	public String getTransactionId() {
		return this.transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

}
