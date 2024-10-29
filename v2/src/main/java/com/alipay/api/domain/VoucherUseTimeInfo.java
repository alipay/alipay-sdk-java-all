package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券核销时间
 *
 * @author auto create
 * @since 1.0, 2024-09-02 17:16:57
 */
public class VoucherUseTimeInfo extends AlipayObject {

	private static final long serialVersionUID = 6645226672915599896L;

	/**
	 * 券绝对时间可用。
	 */
	@ApiField("absolute_period_info")
	private VoucherAbsolutePeriodInfo absolutePeriodInfo;

	/**
	 * 券有效期。
	 */
	@ApiField("period_type")
	private String periodType;

	/**
	 * 券相对时间。
	 */
	@ApiField("relative_period_info")
	private VoucherRelativePeriodInfo relativePeriodInfo;

	public VoucherAbsolutePeriodInfo getAbsolutePeriodInfo() {
		return this.absolutePeriodInfo;
	}
	public void setAbsolutePeriodInfo(VoucherAbsolutePeriodInfo absolutePeriodInfo) {
		this.absolutePeriodInfo = absolutePeriodInfo;
	}

	public String getPeriodType() {
		return this.periodType;
	}
	public void setPeriodType(String periodType) {
		this.periodType = periodType;
	}

	public VoucherRelativePeriodInfo getRelativePeriodInfo() {
		return this.relativePeriodInfo;
	}
	public void setRelativePeriodInfo(VoucherRelativePeriodInfo relativePeriodInfo) {
		this.relativePeriodInfo = relativePeriodInfo;
	}

}
