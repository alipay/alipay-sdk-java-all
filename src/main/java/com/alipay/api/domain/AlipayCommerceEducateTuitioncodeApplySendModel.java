package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学费码申请
 *
 * @author auto create
 * @since 1.0, 2020-12-04 20:42:49
 */
public class AlipayCommerceEducateTuitioncodeApplySendModel extends AlipayObject {

	private static final long serialVersionUID = 1864841696521775457L;

	/**
	 * 外部申请单号
	 */
	@ApiField("out_apply_id")
	private String outApplyId;

	/**
	 * 商户账户
	 */
	@ApiField("smid")
	private String smid;

	public String getOutApplyId() {
		return this.outApplyId;
	}
	public void setOutApplyId(String outApplyId) {
		this.outApplyId = outApplyId;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

}
