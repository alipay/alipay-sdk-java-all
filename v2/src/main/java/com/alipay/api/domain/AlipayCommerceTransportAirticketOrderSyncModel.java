package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 出行机票订单数据同步
 *
 * @author auto create
 * @since 1.0, 2024-10-15 17:38:19
 */
public class AlipayCommerceTransportAirticketOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6789764125764119398L;

	/**
	 * 订单总金额，币种：人民币，单位：元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 订单业务场景，由支付宝侧定义
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 订单业务类型，由支付宝侧定义
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 支付宝用户openid，如果商户开通了openid，建议传入
如使用open_id，请确认「应用-开发配置-openid配置管理」已启用
	 */
	@ApiField("buyer_openid")
	private String buyerOpenid;

	/**
	 * 下单的支付宝用户uid，2088开头的数字串
	 */
	@ApiField("buyer_uid")
	private String buyerUid;

	/**
	 * 订单抽佣渠道，由支付宝侧定义
	 */
	@ApiField("commission_channel")
	private String commissionChannel;

	/**
	 * 辅营商品信息
	 */
	@ApiListField("commodity_info_list")
	@ApiField("traffic_airticket_order_commodity_info")
	private List<TrafficAirticketOrderCommodityInfo> commodityInfoList;

	/**
	 * 订单创建时间，该笔订单真实的创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 优惠金额，币种：人民币，单位：元
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/**
	 * 优惠项目信息
	 */
	@ApiListField("discount_info_list")
	@ApiField("traffic_airticket_order_discount_info")
	private List<TrafficAirticketOrderDiscountInfo> discountInfoList;

	/**
	 * 订单页面的跳转链接
	 */
	@ApiField("link_page")
	private String linkPage;

	/**
	 * 订单修改时间，订单状态或内容发生变更时需要同步更新该时间
	 */
	@ApiField("modified_time")
	private Date modifiedTime;

	/**
	 * 原始订单号，如果因为某些原因重新生成订单，关联的变化前订单的外部订单号
	 */
	@ApiField("ori_out_biz_no")
	private String oriOutBizNo;

	/**
	 * 外部订单号，由商家自定义
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 乘机人信息
	 */
	@ApiListField("passenger_info_list")
	@ApiField("traffic_airticket_order_passenger_info")
	private List<TrafficAirticketOrderPassengerInfo> passengerInfoList;

	/**
	 * 订单实际支付金额，币种：人民币，单位：元
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 订单来源渠道，请在支付宝给出的枚举中选择使用
	 */
	@ApiField("source_channel")
	private String sourceChannel;

	/**
	 * 来源渠道标识，与source_channel关联，取值逻辑由双方约定
	 */
	@ApiField("source_channel_id")
	private String sourceChannelId;

	/**
	 * 订单状态code
	 */
	@ApiField("status")
	private String status;

	/**
	 * 订单状态描述
	 */
	@ApiField("status_desc")
	private String statusDesc;

	/**
	 * 支付宝交易号，若传递trade_no，则该订单的后续状态更新时都需要传递trade_no
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getBuyerOpenid() {
		return this.buyerOpenid;
	}
	public void setBuyerOpenid(String buyerOpenid) {
		this.buyerOpenid = buyerOpenid;
	}

	public String getBuyerUid() {
		return this.buyerUid;
	}
	public void setBuyerUid(String buyerUid) {
		this.buyerUid = buyerUid;
	}

	public String getCommissionChannel() {
		return this.commissionChannel;
	}
	public void setCommissionChannel(String commissionChannel) {
		this.commissionChannel = commissionChannel;
	}

	public List<TrafficAirticketOrderCommodityInfo> getCommodityInfoList() {
		return this.commodityInfoList;
	}
	public void setCommodityInfoList(List<TrafficAirticketOrderCommodityInfo> commodityInfoList) {
		this.commodityInfoList = commodityInfoList;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDiscountAmount() {
		return this.discountAmount;
	}
	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public List<TrafficAirticketOrderDiscountInfo> getDiscountInfoList() {
		return this.discountInfoList;
	}
	public void setDiscountInfoList(List<TrafficAirticketOrderDiscountInfo> discountInfoList) {
		this.discountInfoList = discountInfoList;
	}

	public String getLinkPage() {
		return this.linkPage;
	}
	public void setLinkPage(String linkPage) {
		this.linkPage = linkPage;
	}

	public Date getModifiedTime() {
		return this.modifiedTime;
	}
	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getOriOutBizNo() {
		return this.oriOutBizNo;
	}
	public void setOriOutBizNo(String oriOutBizNo) {
		this.oriOutBizNo = oriOutBizNo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public List<TrafficAirticketOrderPassengerInfo> getPassengerInfoList() {
		return this.passengerInfoList;
	}
	public void setPassengerInfoList(List<TrafficAirticketOrderPassengerInfo> passengerInfoList) {
		this.passengerInfoList = passengerInfoList;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getSourceChannel() {
		return this.sourceChannel;
	}
	public void setSourceChannel(String sourceChannel) {
		this.sourceChannel = sourceChannel;
	}

	public String getSourceChannelId() {
		return this.sourceChannelId;
	}
	public void setSourceChannelId(String sourceChannelId) {
		this.sourceChannelId = sourceChannelId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusDesc() {
		return this.statusDesc;
	}
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
