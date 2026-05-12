package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车辆估值查询来报
 *
 * @author auto create
 * @since 1.0, 2026-05-06 10:57:44
 */
public class XingheLendassistCarfinValuationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1115699955881662893L;

	/**
	 * 申请单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 机构申请单号
	 */
	@ApiField("out_apply_no")
	private String outApplyNo;

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public String getOutApplyNo() {
		return this.outApplyNo;
	}
	public void setOutApplyNo(String outApplyNo) {
		this.outApplyNo = outApplyNo;
	}

}
