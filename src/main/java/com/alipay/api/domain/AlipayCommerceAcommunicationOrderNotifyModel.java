package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 充值订单业务办理结果通知
 *
 * @author auto create
 * @since 1.0, 2022-07-26 10:22:18
 */
public class AlipayCommerceAcommunicationOrderNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 8657118553743988333L;

	/**
	 * 支付宝侧订单号
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/**
	 * 结果码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 充值结果描述
	 */
	@ApiField("msg")
	private String msg;

	/**
	 * 商家订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * SUCCESS 业务办理成功
FAILED 业务办理失败
在回调接口中只有终态
	 */
	@ApiField("out_order_status")
	private String outOrderStatus;

	public String getAlipayOrderNo() {
		return this.alipayOrderNo;
	}
	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return this.msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getOutOrderStatus() {
		return this.outOrderStatus;
	}
	public void setOutOrderStatus(String outOrderStatus) {
		this.outOrderStatus = outOrderStatus;
	}

}
