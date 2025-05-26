package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 状态变更模型
 *
 * @author auto create
 * @since 1.0, 2024-06-18 16:13:51
 */
public class ChangeModel extends AlipayObject {

	private static final long serialVersionUID = 4289535722528797627L;

	/**
	 * 支付宝协议支付的协议号。SCHOOL_DEDUCT_OPEN时返回
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 变更状态。可选的字段枚举说明：{SUCCESS:变更成功;FAIL:变更失败}
	 */
	@ApiField("status")
	private String status;

	/**
	 * 变更类型。可选的字段枚举说明：{SCHOOL_DEDUCT_OPEN:校园支付开通;SCHOOL_DEDUCT_CLOSE:校园支付关闭}
	 */
	@ApiField("type")
	private String type;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
