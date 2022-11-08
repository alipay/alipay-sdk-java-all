package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易订单查询计收费接口
 *
 * @author auto create
 * @since 1.0, 2022-03-30 10:15:29
 */
public class AlipayEcoCityserviceExtOrdercompleteQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8716166719118465394L;

	/**
	 * order_type，必填字段，枚举可数。枚举值 '1' 代表正向收费订单，'2' 代表逆向退费订单，由调用方根据业务数据填写。
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 退款请求号，当order_type=2时必传。 标识一次退款请求，需要保证在外部交易号下唯一。 注：针对同一次退款请求，如果调用接口失败或异常了，重试时需要保证退款请求号不能变更，防止该笔交易重复退款。支付宝会保证同样的退款请求号多次请求只会退一次。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 商户订单号，最大长度64字符，需保证商户侧不重复。注意：退费时该参数需要和收费时保持一致，否则无法退费
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * sync_app_id，调用alipay.eco.cityservice.ext.order.sync回流接口传入的那个appid， 必填
	 */
	@ApiField("sync_app_id")
	private String syncAppId;

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getSyncAppId() {
		return this.syncAppId;
	}
	public void setSyncAppId(String syncAppId) {
		this.syncAppId = syncAppId;
	}

}
