package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.embenefit.masterdata.employee.sync response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-27 10:57:57
 */
public class AlipayDigitalmgmtEmbenefitMasterdataEmployeeSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8716425466785439118L;

	/** 
	 * 本次导入人员信息失败总量
	 */
	@ApiField("fail_count")
	private Long failCount;

	/** 
	 * 本次导入人员信息成功总量
	 */
	@ApiField("success_count")
	private Long successCount;

	/** 
	 * 本次导入人员信息总量
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setFailCount(Long failCount) {
		this.failCount = failCount;
	}
	public Long getFailCount( ) {
		return this.failCount;
	}

	public void setSuccessCount(Long successCount) {
		this.successCount = successCount;
	}
	public Long getSuccessCount( ) {
		return this.successCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
