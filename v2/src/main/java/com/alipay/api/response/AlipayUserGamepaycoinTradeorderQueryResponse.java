package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.gamepaycoin.tradeorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-22 20:07:33
 */
public class AlipayUserGamepaycoinTradeorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8855931968951866963L;

	/** 
	 * 交易订单钻石数量
	 */
	@ApiField("bill_amount")
	private Long billAmount;

	/** 
	 * 开发者备注
	 */
	@ApiField("cp_extra")
	private String cpExtra;

	/** 
	 * 道具名称
	 */
	@ApiField("goods_name")
	private String goodsName;

	/** 
	 * 交易退款钻石数量，未发生退款时为0
	 */
	@ApiField("refund_amount")
	private Long refundAmount;

	/** 
	 * 交易订单支付状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 分区id
	 */
	@ApiField("zone_id")
	private String zoneId;

	public void setBillAmount(Long billAmount) {
		this.billAmount = billAmount;
	}
	public Long getBillAmount( ) {
		return this.billAmount;
	}

	public void setCpExtra(String cpExtra) {
		this.cpExtra = cpExtra;
	}
	public String getCpExtra( ) {
		return this.cpExtra;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsName( ) {
		return this.goodsName;
	}

	public void setRefundAmount(Long refundAmount) {
		this.refundAmount = refundAmount;
	}
	public Long getRefundAmount( ) {
		return this.refundAmount;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}
	public String getZoneId( ) {
		return this.zoneId;
	}

}
