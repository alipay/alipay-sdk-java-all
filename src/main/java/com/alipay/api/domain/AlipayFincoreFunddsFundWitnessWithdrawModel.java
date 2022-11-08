package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 资金见证提现
 *
 * @author auto create
 * @since 1.0, 2022-08-30 15:11:24
 */
public class AlipayFincoreFunddsFundWitnessWithdrawModel extends AlipayObject {

	private static final long serialVersionUID = 3284147177234918873L;

	/**
	 * 必填，外部流水号，幂等字段
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 分库分表id
	 */
	@ApiField("sharding_id")
	private String shardingId;

	/**
	 * 关联交易明细
	 */
	@ApiListField("trade_detail_info_list")
	@ApiField("trade_detail_info_d_t_o")
	private List<TradeDetailInfoDTO> tradeDetailInfoList;

	/**
	 * 提现条款
	 */
	@ApiField("withdraw_clause_detail")
	private WithdrawClauseDetailDTO withdrawClauseDetail;

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getShardingId() {
		return this.shardingId;
	}
	public void setShardingId(String shardingId) {
		this.shardingId = shardingId;
	}

	public List<TradeDetailInfoDTO> getTradeDetailInfoList() {
		return this.tradeDetailInfoList;
	}
	public void setTradeDetailInfoList(List<TradeDetailInfoDTO> tradeDetailInfoList) {
		this.tradeDetailInfoList = tradeDetailInfoList;
	}

	public WithdrawClauseDetailDTO getWithdrawClauseDetail() {
		return this.withdrawClauseDetail;
	}
	public void setWithdrawClauseDetail(WithdrawClauseDetailDTO withdrawClauseDetail) {
		this.withdrawClauseDetail = withdrawClauseDetail;
	}

}
