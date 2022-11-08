package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电商理赔报案取消
 *
 * @author auto create
 * @since 1.0, 2022-08-29 16:22:28
 */
public class AlipayInsSceneEcommerceClaimCancelModel extends AlipayObject {

	private static final long serialVersionUID = 6247646834567977991L;

	/**
	 * 取消原因
	 */
	@ApiField("cancel_reason")
	private String cancelReason;

	/**
	 * 报案单号
	 */
	@ApiField("claim_report_no")
	private String claimReportNo;

	/**
	 * 合作商标识
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	public String getCancelReason() {
		return this.cancelReason;
	}
	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

	public String getClaimReportNo() {
		return this.claimReportNo;
	}
	public void setClaimReportNo(String claimReportNo) {
		this.claimReportNo = claimReportNo;
	}

	public String getPartnerOrgId() {
		return this.partnerOrgId;
	}
	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
	}

}
