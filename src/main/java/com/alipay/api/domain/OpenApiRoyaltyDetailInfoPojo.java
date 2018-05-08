package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * OpenApiRoyaltyDetailInfoPojo
 *
 * @author auto create
 * @since 1.0, 2018-04-04 18:20:26
 */
public class OpenApiRoyaltyDetailInfoPojo extends AlipayObject {

	private static final long serialVersionUID = 8134929225118287768L;

	/**
	 * 分账的金额，单位为元
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 分账信息中分账百分比。取值范围为大于0，少于或等于100的整数。
	 */
	@ApiField("amount_percentage")
	private Long amountPercentage;

	/**
	 * 分账描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 分账收入方账户，类型为userId，本参数为要分账的支付宝账号对应的支付宝唯一用户号。以2088开头的纯16位数字。
	 */
	@ApiField("trans_in")
	private String transIn;

	/**
	 * 分账支出方账户，类型为userId，本参数为要分账的支付宝账号对应的支付宝唯一用户号。以2088开头的纯16位数字。
	 */
	@ApiField("trans_out")
	private String transOut;

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public Long getAmountPercentage() {
		return this.amountPercentage;
	}
	public void setAmountPercentage(Long amountPercentage) {
		this.amountPercentage = amountPercentage;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getTransIn() {
		return this.transIn;
	}
	public void setTransIn(String transIn) {
		this.transIn = transIn;
	}

	public String getTransOut() {
		return this.transOut;
	}
	public void setTransOut(String transOut) {
		this.transOut = transOut;
	}

}
