package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 重下即时配送订单
 *
 * @author auto create
 * @since 1.0, 2023-02-27 15:42:16
 */
public class AlipayCommerceLogisticsOrderIstdretryCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7118183136992341652L;

	/**
	 * 消费者id， 如果consumer_source是alipay，则consumer_id必须是支付宝用户uid；如果consumer_source是wx，则consumer_id可以为空
	 */
	@ApiField("consumer_id")
	private String consumerId;

	/**
	 * 消费者通知明细
	 */
	@ApiField("consumer_notify")
	private ConsumerNotifyIstd consumerNotify;

	/**
	 * 消费者来源,  支付宝：alipay, 微信：wx
	 */
	@ApiField("consumer_source")
	private String consumerSource;

	/**
	 * 商品明细
	 */
	@ApiListField("goods_details")
	@ApiField("goods_detail_istd")
	private List<GoodsDetailIstd> goodsDetails;

	/**
	 * 商品汇总信息
	 */
	@ApiField("goods_info")
	private GoodsInfoIstd goodsInfo;

	/**
	 * 即时配送公司编码
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 下即时配送订单token, 配送公司可以返回此字段，当商家下单时候带上这个字段，保证在一段时间内运费不变
	 */
	@ApiField("logistics_token")
	private String logisticsToken;

	/**
	 * 消费者id， 如果consumer_source是alipay，则consumer_id必须是支付宝用户openId；如果consumer_source是wx，则consumer_id可以为空
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 即时配送订单扩展
	 */
	@ApiField("order_ext_istd")
	private OrderExtIstd orderExtIstd;

	/**
	 * 商家订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 收件人
	 */
	@ApiField("receiver")
	private ReceiverIstd receiver;

	/**
	 * 发件人
	 */
	@ApiField("sender")
	private SenderIstd sender;

	/**
	 * 商家门店编号
	 */
	@ApiField("shop_no")
	private String shopNo;

	public String getConsumerId() {
		return this.consumerId;
	}
	public void setConsumerId(String consumerId) {
		this.consumerId = consumerId;
	}

	public ConsumerNotifyIstd getConsumerNotify() {
		return this.consumerNotify;
	}
	public void setConsumerNotify(ConsumerNotifyIstd consumerNotify) {
		this.consumerNotify = consumerNotify;
	}

	public String getConsumerSource() {
		return this.consumerSource;
	}
	public void setConsumerSource(String consumerSource) {
		this.consumerSource = consumerSource;
	}

	public List<GoodsDetailIstd> getGoodsDetails() {
		return this.goodsDetails;
	}
	public void setGoodsDetails(List<GoodsDetailIstd> goodsDetails) {
		this.goodsDetails = goodsDetails;
	}

	public GoodsInfoIstd getGoodsInfo() {
		return this.goodsInfo;
	}
	public void setGoodsInfo(GoodsInfoIstd goodsInfo) {
		this.goodsInfo = goodsInfo;
	}

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getLogisticsToken() {
		return this.logisticsToken;
	}
	public void setLogisticsToken(String logisticsToken) {
		this.logisticsToken = logisticsToken;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public OrderExtIstd getOrderExtIstd() {
		return this.orderExtIstd;
	}
	public void setOrderExtIstd(OrderExtIstd orderExtIstd) {
		this.orderExtIstd = orderExtIstd;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public ReceiverIstd getReceiver() {
		return this.receiver;
	}
	public void setReceiver(ReceiverIstd receiver) {
		this.receiver = receiver;
	}

	public SenderIstd getSender() {
		return this.sender;
	}
	public void setSender(SenderIstd sender) {
		this.sender = sender;
	}

	public String getShopNo() {
		return this.shopNo;
	}
	public void setShopNo(String shopNo) {
		this.shopNo = shopNo;
	}

}
