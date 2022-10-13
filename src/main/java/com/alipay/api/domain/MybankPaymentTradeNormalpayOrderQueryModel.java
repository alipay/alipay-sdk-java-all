package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 普通支付订单查询
 *
 * @author auto create
 * @since 1.0, 2021-04-13 20:30:40
 */
public class MybankPaymentTradeNormalpayOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4776927877352212634L;

	/**
	 * 渠道类型，表示请求的来源，ANT_OPEN=蚂蚁开放平台，使用request_no查询时，该字段必传
	 */
	@ApiField("biz_channel")
	private String bizChannel;

	/**
	 * 买家信息，user_info_type表示账户类型，ALIPAY_UID=支付宝UID，BANK_UID=网商会员角色ID，MYBANK_CARD_NO=网商卡号，样例内容是{"user_info_type":"ALIPAY_UID","user_info_id":"2088102146225135"}，在进行urlencode，使用request_no查询时，该字段必传
	 */
	@ApiField("buyer_info")
	private String buyerInfo;

	/**
	 * 网商订单号，order_no和request_no传一个即可，优先取order_no
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 创单时的请求流水号，order_no和request_no传一个即可，优先取order_no
	 */
	@ApiField("request_no")
	private String requestNo;

	/**
	 * 卖家信息，user_info_type表示账户类型，ALIPAY_UID=支付宝UID，BANK_UID=网商会员角色ID，MYBANK_CARD_NO=网商卡号，样例内容是{"user_info_type":"ALIPAY_UID","user_info_id":"2088102146225135"}，再进行urlencode，使用request_no查询时，该字段必传
	 */
	@ApiField("seller_info")
	private String sellerInfo;

	public String getBizChannel() {
		return this.bizChannel;
	}
	public void setBizChannel(String bizChannel) {
		this.bizChannel = bizChannel;
	}

	public String getBuyerInfo() {
		return this.buyerInfo;
	}
	public void setBuyerInfo(String buyerInfo) {
		this.buyerInfo = buyerInfo;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getSellerInfo() {
		return this.sellerInfo;
	}
	public void setSellerInfo(String sellerInfo) {
		this.sellerInfo = sellerInfo;
	}

}
