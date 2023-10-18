package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付工具明细；包含：支付工具标识；支付工具类型；抵扣金额
 *
 * @author auto create
 * @since 1.0, 2018-10-09 13:39:56
 */
public class KbpFundTool extends AlipayObject {

	private static final long serialVersionUID = 7874985137229768776L;

	/**
	 * 非现金类支付明细抵扣金额；单位：分；字符类型必须为正整数格式
	 */
	@ApiField("f_fee")
	private String fFee;

	/**
	 * 资金处理中，第三方支付工具ID；
比如：在支付中使用的红包ID；
	 */
	@ApiField("f_id")
	private String fId;

	/**
	 * 非现金类支付明细类型；标识：红包、代金券：比如：CASH：带资金红包、代金券；NO_CASH：不带资金红包、代金券；
	 */
	@ApiField("f_type")
	private String fType;

	public String getfFee() {
		return this.fFee;
	}
	public void setfFee(String fFee) {
		this.fFee = fFee;
	}

	public String getfId() {
		return this.fId;
	}
	public void setfId(String fId) {
		this.fId = fId;
	}

	public String getfType() {
		return this.fType;
	}
	public void setfType(String fType) {
		this.fType = fType;
	}

}
