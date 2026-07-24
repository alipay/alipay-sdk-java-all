package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 共享出行交易退款受理接口
 *
 * @author auto create
 * @since 1.0, 2026-01-28 21:22:42
 */
public class AlipayCommerceTransportTrafficshareTradeRefundModel extends AlipayObject {

	private static final long serialVersionUID = 4895511172466434163L;

	/**
	 * 金额单位

	 */
	@ApiField("amount_unit")
	private String amountUnit;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 操作人工号或者姓名
	 */
	@ApiField("op_name")
	private String opName;

	/**
	 * 用户openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商户订单号。支付宝交易号和商户订单号 out_biz_no 不能同时为空，两者同时存在时，优先取值trade_no
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 退款金额。需要退款的金额，该金额不能大于订单金额。币种：人民币 注：如果正向交易使用了营销，该退款金额包含营销金额，支付宝会按业务规则分配营销和买家自有资金分别退多少，默认优先退买家的自有资金。如交易总金额100元，用户支付时使用了80元自有资金和20元无资金流的营销券，商家实际收款80元。如果首次请求退款60元，则60元全部从商家收款资金扣除退回给用户自有资产；如果再请求退款40元，则从商家收款资金扣除20元退回用户资产以及把20元的营销券退回给用户（券是否可再使用取决于券的规则配置）。
单位：取自amount_unit
，元或者分
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退款请求号。 标识一次退款请求，需要保证在交易号下唯一。注：针对同一次退款请求，如果调用接口失败或异常了，重试时需要保证退款请求号不能变更，防止该笔交易重复退款。支付宝会保证同样的退款请求号多次请求只会退一次。

	 */
	@ApiField("refund_batch_id")
	private String refundBatchId;

	/**
	 * 退款原因说明。 商家自定义，将在会在商户和用户的pc退款账单详情中展示
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 商户订单号。 订单支付时传入的商户订单号，商家自定义且保证商家系统中唯一。与支付宝交易号 trade_no 不能同时为空。
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getAmountUnit() {
		return this.amountUnit;
	}
	public void setAmountUnit(String amountUnit) {
		this.amountUnit = amountUnit;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getOpName() {
		return this.opName;
	}
	public void setOpName(String opName) {
		this.opName = opName;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getRefundBatchId() {
		return this.refundBatchId;
	}
	public void setRefundBatchId(String refundBatchId) {
		this.refundBatchId = refundBatchId;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
