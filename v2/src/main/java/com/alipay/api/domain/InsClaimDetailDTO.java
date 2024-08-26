package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 理赔详情
 *
 * @author auto create
 * @since 1.0, 2024-07-04 20:02:49
 */
public class InsClaimDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 1882429971467791792L;

	/**
	 * 理赔金额(元)
	 */
	@ApiField("claim_fee")
	private String claimFee;

	/**
	 * 责任编码
	 */
	@ApiField("liability_code")
	private String liabilityCode;

	/**
	 * 责任名称
	 */
	@ApiField("liability_name")
	private String liabilityName;

	/**
	 * 结案原因
	 */
	@ApiField("resolve_reason")
	private String resolveReason;

	public String getClaimFee() {
		return this.claimFee;
	}
	public void setClaimFee(String claimFee) {
		this.claimFee = claimFee;
	}

	public String getLiabilityCode() {
		return this.liabilityCode;
	}
	public void setLiabilityCode(String liabilityCode) {
		this.liabilityCode = liabilityCode;
	}

	public String getLiabilityName() {
		return this.liabilityName;
	}
	public void setLiabilityName(String liabilityName) {
		this.liabilityName = liabilityName;
	}

	public String getResolveReason() {
		return this.resolveReason;
	}
	public void setResolveReason(String resolveReason) {
		this.resolveReason = resolveReason;
	}

}
