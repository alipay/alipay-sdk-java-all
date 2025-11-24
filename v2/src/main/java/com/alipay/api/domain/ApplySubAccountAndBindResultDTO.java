package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 申请子户并绑定商家信息接口的返回结果
 *
 * @author auto create
 * @since 1.0, 2020-08-28 14:17:37
 */
public class ApplySubAccountAndBindResultDTO extends AlipayObject {

	private static final long serialVersionUID = 8736264559516359134L;

	/**
	 * 受理单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 受理单状态，申请成功后受理单状态为INIT
	 */
	@ApiField("apply_status")
	private String applyStatus;

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public String getApplyStatus() {
		return this.applyStatus;
	}
	public void setApplyStatus(String applyStatus) {
		this.applyStatus = applyStatus;
	}

}
