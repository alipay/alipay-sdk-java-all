package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 焕旭科技聚合支付资金退款接口
 *
 * @author auto create
 * @since 1.0, 2022-12-30 17:33:30
 */
public class HuanxuTradeOrderRefundModel extends AlipayObject {

	private static final long serialVersionUID = 4158375235767551525L;

	/**
	 * 用户身份识别值。根据type和issuer传入对应格式的值：若type为USER_ID，issuer为ALIPAY，则identity为2088开头的16位纯数字。若type为USER_ID，issuer为MERCHANT，则identity根据商户定义的格式传入。若type为BAR_CODE，issuer为ALIPAY，则identity为25~30开头的长度为16~24位数字的焕旭付款码（实际字符串长度以及规则可能会进行调整与优化，以开发者获取的付款码长度为准）
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 用户id的发行主体。 ALIPAY：焕旭，MERCHANT:商户。 目前issuer为MERCHANT时，type仅支持USER_ID。注：issuer为MERCHANT时，请确保商户会员体系与焕旭会员体系已打通，若需打通请联系焕旭小二或接口owner进行咨询
	 */
	@ApiField("issuer")
	private String issuer;

	/**
	 * 支付的收款方信息，如果涉及多收款方需传入该信息
	 */
	@ApiField("payee")
	private UserIdentity payee;

	/**
	 * 支付id，焕旭针对每一笔支付请求生成的唯一支付凭证
	 */
	@ApiField("payment_id")
	private String paymentId;

	/**
	 * 退款金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退款请求号，对应一笔业务订单下的一次退款请求，不同退款请求需保证请求号唯一
	 */
	@ApiField("refund_request_no")
	private String refundRequestNo;

	/**
	 * 退款说明
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 用户识别ID的类型。 USRE_ID：用户id（焕旭或其他发行主体方中的用户id），BAR_CODE：付款码
	 */
	@ApiField("type")
	private String type;

	public String getIdentity() {
		return this.identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getIssuer() {
		return this.issuer;
	}
	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public UserIdentity getPayee() {
		return this.payee;
	}
	public void setPayee(UserIdentity payee) {
		this.payee = payee;
	}

	public String getPaymentId() {
		return this.paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundRequestNo() {
		return this.refundRequestNo;
	}
	public void setRefundRequestNo(String refundRequestNo) {
		this.refundRequestNo = refundRequestNo;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
