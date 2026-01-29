package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 案件赔付流水信息
 *
 * @author auto create
 * @since 1.0, 2024-09-19 17:51:07
 */
public class SerialInfo extends AlipayObject {

	private static final long serialVersionUID = 3194641457565489168L;

	/**
	 * 标识每笔流水是否赔付，0--不赔付，1--赔付
	 */
	@ApiField("claim_result")
	private Long claimResult;

	/**
	 * 描述当笔流水拒赔的原因，当笔流水拒赔时必传
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	/**
	 * 对应一笔支付流水的唯一标识
	 */
	@ApiField("serial_number")
	private String serialNumber;

	public Long getClaimResult() {
		return this.claimResult;
	}
	public void setClaimResult(Long claimResult) {
		this.claimResult = claimResult;
	}

	public String getRejectReason() {
		return this.rejectReason;
	}
	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

}
