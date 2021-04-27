package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 统一收单交易结算接口
 *
 * @author auto create
 * @since 1.0, 2021-03-24 11:53:31
 */
public class AlipayTradeOrderSettleModel extends AlipayObject {

	private static final long serialVersionUID = 6535446452817177476L;

	/**
	 * 操作员 ID，商家自定义操作员编号。
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 结算请求流水号，由商家自定义。32个字符以内，仅可包含字母、数字、下划线。需保证在商户端不重复。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 分账明细信息。
注意：商家分账场景下分账收入方 trans_in 只支持支付宝账户，不支持使用 cardAliasNo 卡编号。
	 */
	@ApiListField("royalty_parameters")
	@ApiField("open_api_royalty_detail_info_pojo")
	private List<OpenApiRoyaltyDetailInfoPojo> royaltyParameters;

	/**
	 * 支付宝订单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public List<OpenApiRoyaltyDetailInfoPojo> getRoyaltyParameters() {
		return this.royaltyParameters;
	}
	public void setRoyaltyParameters(List<OpenApiRoyaltyDetailInfoPojo> royaltyParameters) {
		this.royaltyParameters = royaltyParameters;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
