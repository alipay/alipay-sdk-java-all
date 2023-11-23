package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 统一境内收单跨境结算接口
 *
 * @author auto create
 * @since 1.0, 2023-09-20 15:56:44
 */
public class AlipayTradeOverseasSettleModel extends AlipayObject {

	private static final long serialVersionUID = 2561632869175118726L;

	/**
	 * 跨境结算的人民币金额，单位为元；等于交易金额 (实际为实收金额)，加上净补差金额，减去已退款金额，减去净收费金额，再减去净分账金额，
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 扩展参数
	 */
	@ApiField("extend_params")
	private OverseasExtendParams extendParams;

	/**
	 * 跨境结算的外币币种
	 */
	@ApiField("foreign_settle_currency")
	private String foreignSettleCurrency;

	/**
	 * 外部请求号，开发者自行生成并保证唯一性，作为业务幂等性控制
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public OverseasExtendParams getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(OverseasExtendParams extendParams) {
		this.extendParams = extendParams;
	}

	public String getForeignSettleCurrency() {
		return this.foreignSettleCurrency;
	}
	public void setForeignSettleCurrency(String foreignSettleCurrency) {
		this.foreignSettleCurrency = foreignSettleCurrency;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
