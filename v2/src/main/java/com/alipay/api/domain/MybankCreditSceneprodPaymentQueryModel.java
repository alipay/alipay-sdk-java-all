package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景金融代收付结果查询
 *
 * @author auto create
 * @since 1.0, 2023-01-09 17:28:58
 */
public class MybankCreditSceneprodPaymentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4243898888449855581L;

	/**
	 * 网商内部代收付申请单编号，外部机构根据此编号查询申请状态。
	 */
	@ApiField("in_apply_no")
	private String inApplyNo;

	public String getInApplyNo() {
		return this.inApplyNo;
	}
	public void setInApplyNo(String inApplyNo) {
		this.inApplyNo = inApplyNo;
	}

}
