package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企信AE提前收款服务订单发货通知
 *
 * @author auto create
 * @since 1.0, 2023-08-16 19:14:51
 */
public class ZhimaCreditEpAeprepayOrderSendModel extends AlipayObject {

	private static final long serialVersionUID = 6346676967429275124L;

	/**
	 * 扩展预留字段
	 */
	@ApiField("ext_param")
	private ZmEpAePrepayExtParam extParam;

	/**
	 * 订单金额。币种最小单位，如人民币：分
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 订单币种
	 */
	@ApiField("order_currency")
	private String orderCurrency;

	/**
	 * 审核单创建时间时间戳
	 */
	@ApiField("order_time_millis")
	private String orderTimeMillis;

	/**
	 * 订单id
	 */
	@ApiField("reference_code")
	private String referenceCode;

	/**
	 * AE侧商家登陆id
	 */
	@ApiField("seller_login_id")
	private String sellerLoginId;

	/**
	 * 审核阶段。针对海外本对本订单下游消费该字段 其中1代表发货，2代表确认收货
	 */
	@ApiField("stage")
	private String stage;

	public ZmEpAePrepayExtParam getExtParam() {
		return this.extParam;
	}
	public void setExtParam(ZmEpAePrepayExtParam extParam) {
		this.extParam = extParam;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderCurrency() {
		return this.orderCurrency;
	}
	public void setOrderCurrency(String orderCurrency) {
		this.orderCurrency = orderCurrency;
	}

	public String getOrderTimeMillis() {
		return this.orderTimeMillis;
	}
	public void setOrderTimeMillis(String orderTimeMillis) {
		this.orderTimeMillis = orderTimeMillis;
	}

	public String getReferenceCode() {
		return this.referenceCode;
	}
	public void setReferenceCode(String referenceCode) {
		this.referenceCode = referenceCode;
	}

	public String getSellerLoginId() {
		return this.sellerLoginId;
	}
	public void setSellerLoginId(String sellerLoginId) {
		this.sellerLoginId = sellerLoginId;
	}

	public String getStage() {
		return this.stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}

}
