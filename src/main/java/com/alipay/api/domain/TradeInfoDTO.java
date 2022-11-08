package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 因公付交易详情
 *
 * @author auto create
 * @since 1.0, 2022-10-31 20:42:50
 */
public class TradeInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 4895583486111314446L;

	/**
	 * 买家ID
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 交易创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 外部平台订单号
	 */
	@ApiField("platform_order_id")
	private String platformOrderId;

	/**
	 * 订单总金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 订单总金额
	 */
	@ApiField("trade_amount")
	private String tradeAmount;

	/**
	 * 资金单明细
	 */
	@ApiListField("trade_fund_bill_list")
	@ApiField("trade_fund_bill_detail")
	private List<TradeFundBillDetail> tradeFundBillList;

	/**
	 * 交易单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 交易状态：WAIT_BUYER_PAY（交易创建，等待买家付款）、TRADE_CLOSED（未付款交易超时关闭，或支付完成后全额退款）、TRADE_SUCCESS（交易支付成功）、TRADE_FINISHED（交易结束，不可退款）
	 */
	@ApiField("trade_status")
	private String tradeStatus;

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getPlatformOrderId() {
		return this.platformOrderId;
	}
	public void setPlatformOrderId(String platformOrderId) {
		this.platformOrderId = platformOrderId;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getTradeAmount() {
		return this.tradeAmount;
	}
	public void setTradeAmount(String tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	public List<TradeFundBillDetail> getTradeFundBillList() {
		return this.tradeFundBillList;
	}
	public void setTradeFundBillList(List<TradeFundBillDetail> tradeFundBillList) {
		this.tradeFundBillList = tradeFundBillList;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getTradeStatus() {
		return this.tradeStatus;
	}
	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}

}
