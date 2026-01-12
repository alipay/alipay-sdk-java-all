package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TradeFundBillDetail;
import com.alipay.api.domain.TradeInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.jointaccount.trade.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 15:07:41
 */
public class AlipayFundJointaccountTradeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8856771777594331694L;

	/** 
	 * 买家ID
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/** 
	 * 买家的openId
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/** 
	 * 交易创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/** 
	 * 订单总金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 资金单明细
	 */
	@ApiListField("trade_fund_bill_list")
	@ApiField("trade_fund_bill_detail")
	private List<TradeFundBillDetail> tradeFundBillList;

	/** 
	 * 交易信息集合。查询为批量查询时，使用该结果返回
	 */
	@ApiListField("trade_info_list")
	@ApiField("trade_info_d_t_o")
	private List<TradeInfoDTO> tradeInfoList;

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

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public String getBuyerId( ) {
		return this.buyerId;
	}

	public void setBuyerOpenId(String buyerOpenId) {
		this.buyerOpenId = buyerOpenId;
	}
	public String getBuyerOpenId( ) {
		return this.buyerOpenId;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getCreateTime( ) {
		return this.createTime;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setTradeFundBillList(List<TradeFundBillDetail> tradeFundBillList) {
		this.tradeFundBillList = tradeFundBillList;
	}
	public List<TradeFundBillDetail> getTradeFundBillList( ) {
		return this.tradeFundBillList;
	}

	public void setTradeInfoList(List<TradeInfoDTO> tradeInfoList) {
		this.tradeInfoList = tradeInfoList;
	}
	public List<TradeInfoDTO> getTradeInfoList( ) {
		return this.tradeInfoList;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
	public String getTradeStatus( ) {
		return this.tradeStatus;
	}

}
