package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金退款
 *
 * @author auto create
 * @since 1.0, 2025-07-21 11:37:31
 */
public class AlipayFundTransRefundModel extends AlipayObject {

	private static final long serialVersionUID = 1835462762167577515L;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * JSON格式，传递业务扩展参数，使用前请与支付宝工程师联系！
	 */
	@ApiField("business_params")
	private String businessParams;

	/**
	 * 发红包时支付宝返回的支付宝订单号order_id。
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 标识一次资金退回请求，一笔资金退回失败后重新提交，要采用原来的资金退回单号。总退款金额不能超过用户实际支付金额。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 公用回传参数，如果请求时传递了该参数，则异步通知商户时会回传该参数。
	 */
	@ApiField("passback_params")
	private String passbackParams;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 需要退款的金额，该金额不能大于订单金额,单位为元，支持两位小数
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 资金退回备注
	 */
	@ApiField("remark")
	private String remark;

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

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getPassbackParams() {
		return this.passbackParams;
	}
	public void setPassbackParams(String passbackParams) {
		this.passbackParams = passbackParams;
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

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
