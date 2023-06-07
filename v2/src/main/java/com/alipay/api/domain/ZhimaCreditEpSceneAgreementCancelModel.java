package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 取消信用服务
 *
 * @author auto create
 * @since 1.0, 2021-10-27 17:12:43
 */
public class ZhimaCreditEpSceneAgreementCancelModel extends AlipayObject {

	private static final long serialVersionUID = 2583332555199586353L;

	/**
	 * 业务取消时间，日期格式为 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 *  信用订单号，为<a href="https://opendocs.alipay.com/apis/api_8/zhima.credit.ep.scene.agreement.use">zhima.credit.ep.scene.agreement.use</a>接口加入信用服务后获取的credit_order_no（信用订单号）。
	 */
	@ApiField("credit_order_no")
	private String creditOrderNo;

	/**
	 * 商户的信用订单号，64位长度的字母数字下划线组合。该标识作为对账的关键信息，商户要保证其唯一性且必须和加入信用服务时的外部订单号保持一致
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
