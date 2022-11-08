package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 分账
 *
 * @author auto create
 * @since 1.0, 2022-08-30 15:10:56
 */
public class AlipayFincoreFunddsFundWitnessPayModel extends AlipayObject {

	private static final long serialVersionUID = 2429717545535663877L;

	/**
	 * 必填，外部流水号，幂等字段
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 支付条款(必填,暂时只支持一条)
notice:若为多条明细,需保证出账方相同,每条明细分别执行分账,不保证一致性
notice:若为多条明细,幂等重试时,需保证顺序不变
	 */
	@ApiListField("payment_clause_detail_list")
	@ApiField("payment_clause_detail_d_t_o")
	private List<PaymentClauseDetailDTO> paymentClauseDetailList;

	/**
	 * 签约产品码,唯一,区分资金存管服务产品类型
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 分库分表标
	 */
	@ApiField("sharding_id")
	private String shardingId;

	/**
	 * 关联交易详细信息（转入或转出是监管内部户资产时必填）
	 */
	@ApiListField("trade_detail_info_list")
	@ApiField("trade_detail_info_d_t_o")
	private List<TradeDetailInfoDTO> tradeDetailInfoList;

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public List<PaymentClauseDetailDTO> getPaymentClauseDetailList() {
		return this.paymentClauseDetailList;
	}
	public void setPaymentClauseDetailList(List<PaymentClauseDetailDTO> paymentClauseDetailList) {
		this.paymentClauseDetailList = paymentClauseDetailList;
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

}
