package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用户交易数据
 *
 * @author auto create
 * @since 1.0, 2022-03-18 20:51:52
 */
public class UserTradeInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 8473216343311871144L;

	/**
	 * 商品信息列表
	 */
	@ApiListField("goods_info_list")
	@ApiField("goods_info_d_t_o")
	private List<GoodsInfoDTO> goodsInfoList;

	/**
	 * 门店ISV的PID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 是否是风险交易：NO_RISK-无风险；POTENTIAL_RISK-潜在风险（中等风险）；HIGH_RISK-高风险
	 */
	@ApiField("risk_level")
	private String riskLevel;

	/**
	 * 交易总金额，单位元，精确两位小数点
	 */
	@ApiField("trade_amount")
	private String tradeAmount;

	/**
	 * 交易单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 交易时间
	 */
	@ApiField("trade_time")
	private String tradeTime;

	/**
	 * 商品数据会根据活动商品列表进行过滤，该字段代表未过滤的商品列表大小
	 */
	@ApiField("unfiltered_total_goods_count")
	private Long unfilteredTotalGoodsCount;

	/**
	 * 消费者支付宝ID
	 */
	@ApiField("user_id")
	private String userId;

	public List<GoodsInfoDTO> getGoodsInfoList() {
		return this.goodsInfoList;
	}
	public void setGoodsInfoList(List<GoodsInfoDTO> goodsInfoList) {
		this.goodsInfoList = goodsInfoList;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getRiskLevel() {
		return this.riskLevel;
	}
	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}

	public String getTradeAmount() {
		return this.tradeAmount;
	}
	public void setTradeAmount(String tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTradeTime() {
		return this.tradeTime;
	}
	public void setTradeTime(String tradeTime) {
		this.tradeTime = tradeTime;
	}

	public Long getUnfilteredTotalGoodsCount() {
		return this.unfilteredTotalGoodsCount;
	}
	public void setUnfilteredTotalGoodsCount(Long unfilteredTotalGoodsCount) {
		this.unfilteredTotalGoodsCount = unfilteredTotalGoodsCount;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
