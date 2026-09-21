package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DistributionMerchantAddressDTO;
import com.alipay.api.domain.DistItemDTO;
import com.alipay.api.domain.DistLogisticsInfoDTO;
import com.alipay.api.domain.DistRentPlanInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.rent.distorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-11 23:27:50
 */
public class AlipayCommerceRentDistorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2691578628184819629L;

	/** 
	 * 是否租三免一订单
	 */
	@ApiField("act_tag")
	private String actTag;

	/** 
	 * 分销订单号
	 */
	@ApiField("biz_order_id")
	private String bizOrderId;

	/** 
	 * 买家收货地址
	 */
	@ApiField("buyer_address")
	private DistributionMerchantAddressDTO buyerAddress;

	/** 
	 * 买家昵称
	 */
	@ApiField("buyer_nick")
	private String buyerNick;

	/** 
	 * 渠道买家ID
	 */
	@ApiField("channel_buyer_id")
	private String channelBuyerId;

	/** 
	 * 渠道订单号
	 */
	@ApiField("channel_order_id")
	private String channelOrderId;

	/** 
	 * 关单原因
	 */
	@ApiField("close_reason")
	private String closeReason;

	/** 
	 * 下单时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/** 
	 * 实际免押金额，单位为元
	 */
	@ApiField("credit_deposit_amount")
	private String creditDepositAmount;

	/** 
	 * 芝麻免押状态
INIT(初始)、AUTHORIZED(已授权)、FINISH(完成)、CLOSED(关闭);
仅INIT状态可改价。
	 */
	@ApiField("credit_deposit_status")
	private String creditDepositStatus;

	/** 
	 * 分销免押通过标:Y,如果不通过，则不返回
	 */
	@ApiField("dist_deposit_free_pass")
	private String distDepositFreePass;

	/** 
	 * 分销渠道
	 */
	@ApiField("distribution_channel")
	private String distributionChannel;

	/** 
	 * 订单完结时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/** 
	 * 运费,单位为元
	 */
	@ApiField("freight")
	private String freight;

	/** 
	 * 已支付押金金额，单位为元
	 */
	@ApiField("fund_deposit_amount")
	private String fundDepositAmount;

	/** 
	 * null
	 */
	@ApiListField("items")
	@ApiField("dist_item_d_t_o")
	private List<DistItemDTO> items;

	/** 
	 * 发货物流信息
	 */
	@ApiField("logistics_info")
	private DistLogisticsInfoDTO logisticsInfo;

	/** 
	 * 首期租金支付时间 
	 */
	@ApiField("pay_time")
	private Date payTime;

	/** 
	 * 租赁计划信息
	 */
	@ApiField("rent_plan_info")
	private DistRentPlanInfoDTO rentPlanInfo;

	/** 
	 * 归还地址
	 */
	@ApiField("return_address")
	private DistributionMerchantAddressDTO returnAddress;

	/** 
	 * 归还物流信息
	 */
	@ApiField("return_logistics_info")
	private DistLogisticsInfoDTO returnLogisticsInfo;

	/** 
	 * 发货时间
	 */
	@ApiField("ship_time")
	private Date shipTime;

	/** 
	 * 分销订单状态
	 */
	@ApiField("status")
	private String status;

	public void setActTag(String actTag) {
		this.actTag = actTag;
	}
	public String getActTag( ) {
		return this.actTag;
	}

	public void setBizOrderId(String bizOrderId) {
		this.bizOrderId = bizOrderId;
	}
	public String getBizOrderId( ) {
		return this.bizOrderId;
	}

	public void setBuyerAddress(DistributionMerchantAddressDTO buyerAddress) {
		this.buyerAddress = buyerAddress;
	}
	public DistributionMerchantAddressDTO getBuyerAddress( ) {
		return this.buyerAddress;
	}

	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}
	public String getBuyerNick( ) {
		return this.buyerNick;
	}

	public void setChannelBuyerId(String channelBuyerId) {
		this.channelBuyerId = channelBuyerId;
	}
	public String getChannelBuyerId( ) {
		return this.channelBuyerId;
	}

	public void setChannelOrderId(String channelOrderId) {
		this.channelOrderId = channelOrderId;
	}
	public String getChannelOrderId( ) {
		return this.channelOrderId;
	}

	public void setCloseReason(String closeReason) {
		this.closeReason = closeReason;
	}
	public String getCloseReason( ) {
		return this.closeReason;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getCreateTime( ) {
		return this.createTime;
	}

	public void setCreditDepositAmount(String creditDepositAmount) {
		this.creditDepositAmount = creditDepositAmount;
	}
	public String getCreditDepositAmount( ) {
		return this.creditDepositAmount;
	}

	public void setCreditDepositStatus(String creditDepositStatus) {
		this.creditDepositStatus = creditDepositStatus;
	}
	public String getCreditDepositStatus( ) {
		return this.creditDepositStatus;
	}

	public void setDistDepositFreePass(String distDepositFreePass) {
		this.distDepositFreePass = distDepositFreePass;
	}
	public String getDistDepositFreePass( ) {
		return this.distDepositFreePass;
	}

	public void setDistributionChannel(String distributionChannel) {
		this.distributionChannel = distributionChannel;
	}
	public String getDistributionChannel( ) {
		return this.distributionChannel;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Date getEndTime( ) {
		return this.endTime;
	}

	public void setFreight(String freight) {
		this.freight = freight;
	}
	public String getFreight( ) {
		return this.freight;
	}

	public void setFundDepositAmount(String fundDepositAmount) {
		this.fundDepositAmount = fundDepositAmount;
	}
	public String getFundDepositAmount( ) {
		return this.fundDepositAmount;
	}

	public void setItems(List<DistItemDTO> items) {
		this.items = items;
	}
	public List<DistItemDTO> getItems( ) {
		return this.items;
	}

	public void setLogisticsInfo(DistLogisticsInfoDTO logisticsInfo) {
		this.logisticsInfo = logisticsInfo;
	}
	public DistLogisticsInfoDTO getLogisticsInfo( ) {
		return this.logisticsInfo;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
	public Date getPayTime( ) {
		return this.payTime;
	}

	public void setRentPlanInfo(DistRentPlanInfoDTO rentPlanInfo) {
		this.rentPlanInfo = rentPlanInfo;
	}
	public DistRentPlanInfoDTO getRentPlanInfo( ) {
		return this.rentPlanInfo;
	}

	public void setReturnAddress(DistributionMerchantAddressDTO returnAddress) {
		this.returnAddress = returnAddress;
	}
	public DistributionMerchantAddressDTO getReturnAddress( ) {
		return this.returnAddress;
	}

	public void setReturnLogisticsInfo(DistLogisticsInfoDTO returnLogisticsInfo) {
		this.returnLogisticsInfo = returnLogisticsInfo;
	}
	public DistLogisticsInfoDTO getReturnLogisticsInfo( ) {
		return this.returnLogisticsInfo;
	}

	public void setShipTime(Date shipTime) {
		this.shipTime = shipTime;
	}
	public Date getShipTime( ) {
		return this.shipTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
