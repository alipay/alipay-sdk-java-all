package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改开票申请状态
 *
 * @author auto create
 * @since 1.0, 2023-08-01 19:10:22
 */
public class AlipayCommerceEcTcnInvoiceapplyModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8748376159791334538L;

	/**
	 * 开票申请ID
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * 申请状态
	 */
	@ApiField("apply_status")
	private String applyStatus;

	/**
	 * 开票失败原因
	 */
	@ApiField("failed_reason")
	private String failedReason;

	/**
	 * 快递公司编码
	 */
	@ApiField("logistics_company_code")
	private String logisticsCompanyCode;

	/**
	 * 快递单号
	 */
	@ApiField("logistics_no")
	private String logisticsNo;

	public String getApplyId() {
		return this.applyId;
	}
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

	public String getApplyStatus() {
		return this.applyStatus;
	}
	public void setApplyStatus(String applyStatus) {
		this.applyStatus = applyStatus;
	}

	public String getFailedReason() {
		return this.failedReason;
	}
	public void setFailedReason(String failedReason) {
		this.failedReason = failedReason;
	}

	public String getLogisticsCompanyCode() {
		return this.logisticsCompanyCode;
	}
	public void setLogisticsCompanyCode(String logisticsCompanyCode) {
		this.logisticsCompanyCode = logisticsCompanyCode;
	}

	public String getLogisticsNo() {
		return this.logisticsNo;
	}
	public void setLogisticsNo(String logisticsNo) {
		this.logisticsNo = logisticsNo;
	}

}
