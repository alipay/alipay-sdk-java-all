package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 缴费账单查询
 *
 * @author auto create
 * @since 1.0, 2017-11-06 11:47:53
 */
public class AlipayEcoEduKtBillingQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3894732175842791298L;

	/**
	 * Isv pid
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * ISV调用发送账单接口，返回给商户的order_no
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 学校支付宝pid
	 */
	@ApiField("school_pid")
	private String schoolPid;

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getSchoolPid() {
		return this.schoolPid;
	}
	public void setSchoolPid(String schoolPid) {
		this.schoolPid = schoolPid;
	}

}
