package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 无线转账支付接口
 *
 * @author auto create
 * @since 1.0, 2024-07-31 10:18:37
 */
public class AlipayFundTransAppPayModel extends AlipayObject {

	private static final long serialVersionUID = 8214899389729659317L;

	/**
	 * 描述特定的业务场景，可传值如下：
PERSONAL_PAY: 发红包
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * JSON格式，传递业务扩展参数.
业务扩展字段，JSON格式。支持如下属性：
sub_biz_scene 子场景，必填，传REDPACKET
payer_binded_alipay_uid 创建红包的商户会员绑定的支付宝userId，必填
	 */
	@ApiField("business_params")
	private String businessParams;

	/**
	 * 支付宝订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 支付订单的标题，用于在收银台和消费记录展示
	 */
	@ApiField("order_title")
	private String orderTitle;

	/**
	 * 商户端的唯一订单号，对于同一笔转账请求，商户需保证该订单号唯一。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 公用回传参数，如果请求时传递了该参数，则异步通知商户时会回传该参数。
	 */
	@ApiField("passback_params")
	private String passbackParams;

	/**
	 * 收款方信息
	 */
	@ApiField("payee_info")
	private Participant payeeInfo;

	/**
	 * 付款方信息
	 */
	@ApiField("payer_info")
	private Participant payerInfo;

	/**
	 * 销售产品码，商家和支付宝签约的产品码。
STD_RED_PACKET：现金红包
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 退款超时时间，格式yyyy-MM-dd HH:mm。到指定时间后，系统会自动触发退款，并原路退回到付款账户。如果指定了退款时间，必须早于销售方案里设置的最晚退款时间。
	 */
	@ApiField("refund_time_expire")
	private String refundTimeExpire;

	/**
	 * 支付备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 商户发起请求的系统时间，格式yyyy-MM-dd HH:mm。基于安全的考虑，支付宝会对请求时间间隔进行控制，超过一定时间会拒绝支付请求。
	 */
	@ApiField("request_time")
	private String requestTime;

	/**
	 * 绝对超时时间，格式为yyyy-MM-dd HH:mm
	 */
	@ApiField("time_expire")
	private String timeExpire;

	/**
	 * 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,9999999999999.99]
	 */
	@ApiField("trans_amount")
	private String transAmount;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getBusinessParams() {
		return this.businessParams;
	}
	public void setBusinessParams(String businessParams) {
		this.businessParams = businessParams;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderTitle() {
		return this.orderTitle;
	}
	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPassbackParams() {
		return this.passbackParams;
	}
	public void setPassbackParams(String passbackParams) {
		this.passbackParams = passbackParams;
	}

	public Participant getPayeeInfo() {
		return this.payeeInfo;
	}
	public void setPayeeInfo(Participant payeeInfo) {
		this.payeeInfo = payeeInfo;
	}

	public Participant getPayerInfo() {
		return this.payerInfo;
	}
	public void setPayerInfo(Participant payerInfo) {
		this.payerInfo = payerInfo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRefundTimeExpire() {
		return this.refundTimeExpire;
	}
	public void setRefundTimeExpire(String refundTimeExpire) {
		this.refundTimeExpire = refundTimeExpire;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRequestTime() {
		return this.requestTime;
	}
	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

	public String getTimeExpire() {
		return this.timeExpire;
	}
	public void setTimeExpire(String timeExpire) {
		this.timeExpire = timeExpire;
	}

	public String getTransAmount() {
		return this.transAmount;
	}
	public void setTransAmount(String transAmount) {
		this.transAmount = transAmount;
	}

}
