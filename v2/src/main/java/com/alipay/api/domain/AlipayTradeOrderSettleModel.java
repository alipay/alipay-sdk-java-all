package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 统一收单交易结算接口
 *
 * @author auto create
 * @since 1.0, 2023-11-20 20:32:49
 */
public class AlipayTradeOrderSettleModel extends AlipayObject {

	private static final long serialVersionUID = 5492489598917392482L;

	/**
	 * 分账结算业务扩展参数
	 */
	@ApiField("extend_params")
	private SettleExtendParams extendParams;

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
	 * 分账模式，目前有两种分账同步执行sync，分账异步执行async，不传默认同步执行
	 */
	@ApiField("royalty_mode")
	private String royaltyMode;

	/**
	 * 分账明细信息。单独调用分账完结时，可以不传此参数。其他场景必传。
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

	public SettleExtendParams getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(SettleExtendParams extendParams) {
		this.extendParams = extendParams;
	}

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

	public String getRoyaltyMode() {
		return this.royaltyMode;
	}
	public void setRoyaltyMode(String royaltyMode) {
		this.royaltyMode = royaltyMode;
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
