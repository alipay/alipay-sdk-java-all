package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通用当面付二阶段接口
 *
 * @author auto create
 * @since 1.0, 2019-04-29 22:59:34
 */
public class AlipayUserTwostageCommonUseModel extends AlipayObject {

	private static final long serialVersionUID = 2176364777235824686L;

	/**
	 * 商户扫描用户的付款码值。
	 */
	@ApiField("dynamic_id")
	private String dynamicId;

	/**
	 * 商家进行二阶段支付的PID信息。
	 */
	@ApiField("pay_pid")
	private String payPid;

	/**
	 * 此项为商户收单时的商户订单号,64个字符以内、可包含字母、数字、下划线；需保证在商户端不重复。（请参考alipay.trade.pay接口的out_trade_no字段）
	 */
	@ApiField("sence_no")
	private String senceNo;

	public String getDynamicId() {
		return this.dynamicId;
	}
	public void setDynamicId(String dynamicId) {
		this.dynamicId = dynamicId;
	}

	public String getPayPid() {
		return this.payPid;
	}
	public void setPayPid(String payPid) {
		this.payPid = payPid;
	}

	public String getSenceNo() {
		return this.senceNo;
	}
	public void setSenceNo(String senceNo) {
		this.senceNo = senceNo;
	}

}
