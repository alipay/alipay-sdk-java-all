package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 预下即时配送订单
 *
 * @author auto create
 * @since 1.0, 2023-02-27 16:30:15
 */
public class AlipayCommerceLogisticsOrderInstantdeliveryPrecreateModel extends AlipayObject {

	private static final long serialVersionUID = 8258226728588395521L;

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
	 * 消费者来源, 支付宝：alipay, 微信：wx
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
	 * 即时配送公司配置列表
	 */
	@ApiListField("logistics_companies")
	@ApiField("logistics_company_istd")
	private List<LogisticsCompanyIstd> logisticsCompanies;

	/**
	 * 消费者id， 如果consumer_source是alipay，则consumer_id必须是支付宝的openId；如果consumer_source是wx，则consumer_id可以为空
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 即时配送订单扩展
	 */
	@ApiField("order_ext_istd")
	private OrderExtIstdForPreOrder orderExtIstd;

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

	public List<LogisticsCompanyIstd> getLogisticsCompanies() {
		return this.logisticsCompanies;
	}
	public void setLogisticsCompanies(List<LogisticsCompanyIstd> logisticsCompanies) {
		this.logisticsCompanies = logisticsCompanies;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public OrderExtIstdForPreOrder getOrderExtIstd() {
		return this.orderExtIstd;
	}
	public void setOrderExtIstd(OrderExtIstdForPreOrder orderExtIstd) {
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
