package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 理赔案件信息查询
 *
 * @author auto create
 * @since 1.0, 2020-04-27 16:16:56
 */
public class AlipayInsUnderwriteClaimReportQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6189282719611597125L;

	/**
	 * 理赔申请报案号，通过理赔申请【alipay.ins.scene.claim.apply】接口的返回字段claim_report_no获取
	 */
	@ApiField("claim_report_no")
	private String claimReportNo;

	public String getClaimReportNo() {
		return this.claimReportNo;
	}
	public void setClaimReportNo(String claimReportNo) {
		this.claimReportNo = claimReportNo;
	}

}
