package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 藏品铸造查询
 *
 * @author auto create
 * @since 1.0, 2026-03-11 15:46:25
 */
public class AnttechNftSkuCastQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3741842981888571849L;

	/**
	 * 申请单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

}
