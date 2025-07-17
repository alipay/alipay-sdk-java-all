package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 还款计划变更通知接口
 *
 * @author auto create
 * @since 1.0, 2024-07-25 17:58:46
 */
public class XingheLendassistCarfinRepayplanchangeNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 3827719484722936758L;

	/**
	 * 星河申请单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 机构侧申请单号
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
