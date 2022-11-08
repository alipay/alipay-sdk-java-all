package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易订单回流接口
 *
 * @author auto create
 * @since 1.0, 2022-05-07 16:46:19
 */
public class AlipayEcoCityserviceExtOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1746632637326431636L;

	/**
	 * appid，订单归属的小程序id，当order_type=1时 必填
	 */
	@ApiField("appid")
	private String appid;

	/**
	 * body，商户关于该订单的描述性信息，非必填
	 */
	@ApiField("body")
	private String body;

	/**
	 * buyer_id，订单买家的支付宝uid，当order_type=1时 必填。buyer_id不可以和商户pid一样。
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * category_code，商户通过aboss签约的产品的类目编码，当order_type=1，且签约时有类目编码，则必填。
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * json格式的额外参数配置，扩展需要。未做特殊说明不传
	 */
	@ApiField("ext")
	private String ext;

	/**
	 * gmt_service, 订单发生时间，格式为 yyyy-MM-dd HH:mm:ss, 当order_type=1时填写订单交易时间；当order_type=2时填写订单退单时间。
	 */
	@ApiField("gmt_service")
	private String gmtService;

	/**
	 * order_type，必填字段，枚举可数。枚举值 '1' 代表正向收费订单，'2' 代表逆向退费订单，由调用方根据业务数据填写。
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 退款请求号，当order_type=2时必传。
标识一次退款请求，需要保证在外部交易号下唯一。
注：针对同一次退款请求，如果调用接口失败或异常了，重试时需要保证退款请求号不能变更，防止该笔交易重复退款。支付宝会保证同样的退款请求号多次请求只会退一次。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 商户订单号，最大长度64字符，需保证商户侧不重复。注意：退费时该参数需要和收费时保持一致，否则无法退费
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * product_code，商户通过aboss和支付宝签约的产品码，当order_type=1时 必填
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * refund_amount，当order_type=2时必填，退费金额。单位为元，不能大于订单总金额，支持两位小数
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * refund_reason，退款原因说明，商户自定义，非必填
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * subject，订单标题，非必填
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * total_amount，订单金额，当order_type为1时此参数必填。精确到小数点后2位，单位 元，最大值99999999.99元，最小值为0.01元
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * trade_no，支付宝收单系统生成的订单号，非必填。
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getAppid() {
		return this.appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getBody() {
		return this.body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getCategoryCode() {
		return this.categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getExt() {
		return this.ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}

	public String getGmtService() {
		return this.gmtService;
	}
	public void setGmtService(String gmtService) {
		this.gmtService = gmtService;
	}

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

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
