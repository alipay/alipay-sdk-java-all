package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 退款资金明细
 *
 * @author auto create
 * @since 1.0, 2018-09-08 00:51:09
 */
public class OpenApiRefundFundDetailPojo extends AlipayObject {

	private static final long serialVersionUID = 5511579879466469456L;

	/**
	 * 退款资金明细
详：
若type为paySerialNo则funds为
[{"paySerialNo":"支付流水1","refundFee":"退款金额1"},{"paySerialNo":"支付流水2","refundFee":"退款金额2"}]
	 */
	@ApiListField("funds")
	@ApiField("string")
	private List<String> funds;

	/**
	 * 收入方账户
为空则原路退回
	 */
	@ApiField("trans_in")
	private String transIn;

	/**
	 * 收入方账户类型
	 */
	@ApiField("trans_in_type")
	private String transInType;

	/**
	 * 描述资金明细类型
详：若type为paySerialNo
则funds参数中体现的都为对应支付流水的退款明细
	 */
	@ApiField("type")
	private String type;

	public List<String> getFunds() {
		return this.funds;
	}
	public void setFunds(List<String> funds) {
		this.funds = funds;
	}

	public String getTransIn() {
		return this.transIn;
	}
	public void setTransIn(String transIn) {
		this.transIn = transIn;
	}

	public String getTransInType() {
		return this.transInType;
	}
	public void setTransInType(String transInType) {
		this.transInType = transInType;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
