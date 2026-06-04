package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 理赔销案
 *
 * @author auto create
 * @since 1.0, 2026-03-04 16:04:52
 */
public class AlipayInsSceneClaimCancelModel extends AlipayObject {

	private static final long serialVersionUID = 4721564839492339239L;

	/**
	 * 销案原因,业务自定义输入,无需枚举
	 */
	@ApiField("cancel_reason")
	private String cancelReason;

	/**
	 * 蚂蚁返回的报案单号
	 */
	@ApiField("claim_report_no")
	private String claimReportNo;

	/**
	 * 外部订单id,业务自行传入
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 约定的合作商id
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

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getPartnerOrgId() {
		return this.partnerOrgId;
	}
	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
	}

}
