package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TicketTransInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.trade.ticket.ticketcode.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-08-29 14:16:18
 */
public class KoubeiTradeTicketTicketcodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8362541834588928866L;

	/** 
	 * 用户购买时商品的现价
	 */
	@ApiField("current_price")
	private String currentPrice;

	/** 
	 * 券生效时间
	 */
	@ApiField("effect_date")
	private String effectDate;

	/** 
	 * 券失效时间
	 */
	@ApiField("expire_date")
	private String expireDate;

	/** 
	 * 口碑商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/** 
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/** 
	 * 凭证对应的订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 用户购买时商品的原价
	 */
	@ApiField("original_price")
	private String originalPrice;

	/** 
	 * 12位的券码，券码为纯数字，且唯一不重复
	 */
	@ApiField("ticket_code")
	private String ticketCode;

	/** 
	 * 券状态
1.  USED:该券已经被消费,无法核销
2.  EFFECTIVE:未核销，且可以在当前门店核销
3.  UN_EFFECTIVE:未核销，但不可以在当前门店核销
4.  REFUNDED:该券已经退款,无法核销
5.  USING:核销处理中,无法核销
6.  REFUNDING:退款处理中,无法核销
	 */
	@ApiField("ticket_status")
	private String ticketStatus;

	/** 
	 * 券状态描述
1.  该券已经被消费，无法核销
2.  未核销，且可以在当前门店核销
3.  未核销，但不可以在当前门店核销
4.  该券已经退款，无法核销
5.  该券正在核销处理中,无法核销
6.  该券正在退款处理中,无法核销
	 */
	@ApiField("ticket_status_desc")
	private String ticketStatusDesc;

	/** 
	 * 凭证的流水记录
	 */
	@ApiListField("ticket_trans_info_list")
	@ApiField("ticket_trans_info")
	private List<TicketTransInfo> ticketTransInfoList;

	/** 
	 * 券码对应的凭证资产id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public void setCurrentPrice(String currentPrice) {
		this.currentPrice = currentPrice;
	}
	public String getCurrentPrice( ) {
		return this.currentPrice;
	}

	public void setEffectDate(String effectDate) {
		this.effectDate = effectDate;
	}
	public String getEffectDate( ) {
		return this.effectDate;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}
	public String getExpireDate( ) {
		return this.expireDate;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemId( ) {
		return this.itemId;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemName( ) {
		return this.itemName;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}
	public String getOriginalPrice( ) {
		return this.originalPrice;
	}

	public void setTicketCode(String ticketCode) {
		this.ticketCode = ticketCode;
	}
	public String getTicketCode( ) {
		return this.ticketCode;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	public String getTicketStatus( ) {
		return this.ticketStatus;
	}

	public void setTicketStatusDesc(String ticketStatusDesc) {
		this.ticketStatusDesc = ticketStatusDesc;
	}
	public String getTicketStatusDesc( ) {
		return this.ticketStatusDesc;
	}

	public void setTicketTransInfoList(List<TicketTransInfo> ticketTransInfoList) {
		this.ticketTransInfoList = ticketTransInfoList;
	}
	public List<TicketTransInfo> getTicketTransInfoList( ) {
		return this.ticketTransInfoList;
	}

	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}
	public String getVoucherId( ) {
		return this.voucherId;
	}

}
