package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 反洗钱制裁扫描风险筛查
 *
 * @author auto create
 * @since 1.0, 2025-12-15 15:12:41
 */
public class AlipaySecurityRiskSanctionWatchlistCheckModel extends AlipayObject {

	private static final long serialVersionUID = 7737336149553775134L;

	/**
	 * null
	 */
	@ApiListField("pbc_scan_params")
	@ApiField("p_b_c_scan_param")
	private List<PBCScanParam> pbcScanParams;

	public List<PBCScanParam> getPbcScanParams() {
		return this.pbcScanParams;
	}
	public void setPbcScanParams(List<PBCScanParam> pbcScanParams) {
		this.pbcScanParams = pbcScanParams;
	}

}
