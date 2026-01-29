package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 追偿结果查询
 *
 * @author auto create
 * @since 1.0, 2025-10-23 21:16:13
 */
public class AlipayInsSceneClaimOverdueQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8222228484988288136L;

	/**
	 * 赔案单号
	 */
	@ApiField("claim_no")
	private String claimNo;

	/**
	 * 外部订单单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 追偿单号
	 */
	@ApiField("overdue_no")
	private String overdueNo;

	/**
	 * 合作商标识
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	public String getClaimNo() {
		return this.claimNo;
	}
	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getOverdueNo() {
		return this.overdueNo;
	}
	public void setOverdueNo(String overdueNo) {
		this.overdueNo = overdueNo;
	}

	public String getPartnerOrgId() {
		return this.partnerOrgId;
	}
	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
	}

}
