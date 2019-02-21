package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用服务履约同步
 *
 * @author auto create
 * @since 1.0, 2019-01-04 16:46:10
 */
public class ZhimaCreditEpSceneFulfillmentSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5398357784719644255L;

	/**
	 * 业务时间，日期格式为 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 信用订单号
	 */
	@ApiField("credit_order_no")
	private String creditOrderNo;

	/**
	 * 商户请求的唯一标志，64位长度的字母数字下划线组合。该标识作为对账的关键信息，商户要保证其唯一性。
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	public Date getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}

	public String getCreditOrderNo() {
		return this.creditOrderNo;
	}
	public void setCreditOrderNo(String creditOrderNo) {
		this.creditOrderNo = creditOrderNo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

}
