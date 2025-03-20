package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-03-19 14:12:27
 */
public class RecycleQcReportCheckItem extends AlipayObject {

	private static final long serialVersionUID = 2586251753711354834L;

	/**
	 * 是否和用户反馈一致
	 */
	@ApiField("is_consistent")
	private Boolean isConsistent;

	/**
	 * 商户质检结果
	 */
	@ApiField("merchant_check_result")
	private RecycleQcReportResult merchantCheckResult;

	/**
	 * 用户质检结果
	 */
	@ApiField("user_self_check_result")
	private RecycleQcReportResult userSelfCheckResult;

	public Boolean getIsConsistent() {
		return this.isConsistent;
	}
	public void setIsConsistent(Boolean isConsistent) {
		this.isConsistent = isConsistent;
	}

	public RecycleQcReportResult getMerchantCheckResult() {
		return this.merchantCheckResult;
	}
	public void setMerchantCheckResult(RecycleQcReportResult merchantCheckResult) {
		this.merchantCheckResult = merchantCheckResult;
	}

	public RecycleQcReportResult getUserSelfCheckResult() {
		return this.userSelfCheckResult;
	}
	public void setUserSelfCheckResult(RecycleQcReportResult userSelfCheckResult) {
		this.userSelfCheckResult = userSelfCheckResult;
	}

}
