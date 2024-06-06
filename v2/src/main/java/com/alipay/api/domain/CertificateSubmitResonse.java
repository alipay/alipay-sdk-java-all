package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 凭证核销提交结果
 *
 * @author auto create
 * @since 1.0, 2024-05-23 11:13:24
 */
public class CertificateSubmitResonse extends AlipayObject {

	private static final long serialVersionUID = 2459155157544733527L;

	/**
	 * 订购单编号
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 订单编号/扣款单号
	 */
	@ApiField("deduction_order_id")
	private String deductionOrderId;

	/**
	 * 核销提交失败的原因
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * true:凭证提交成功
false:凭证提交失败
	 */
	@ApiField("success")
	private Boolean success;

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getDeductionOrderId() {
		return this.deductionOrderId;
	}
	public void setDeductionOrderId(String deductionOrderId) {
		this.deductionOrderId = deductionOrderId;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

}
