package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量核销结果
 *
 * @author auto create
 * @since 1.0, 2024-11-15 15:53:19
 */
public class CertificateSubmitResonse extends AlipayObject {

	private static final long serialVersionUID = 2652996937691413236L;

	/**
	 * 售卖订单id
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 核销订单id
	 */
	@ApiField("deduction_order_id")
	private String deductionOrderId;

	/**
	 * 核销提交失败的原因
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 凭证次序号
	 */
	@ApiField("serial_no")
	private String serialNo;

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

	public String getSerialNo() {
		return this.serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

}
