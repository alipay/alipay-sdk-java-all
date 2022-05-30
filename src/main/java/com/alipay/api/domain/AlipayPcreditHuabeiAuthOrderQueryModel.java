package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花呗先享订单查询接口
 *
 * @author auto create
 * @since 1.0, 2020-04-28 19:55:44
 */
public class AlipayPcreditHuabeiAuthOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4161653814992148782L;

	/**
	 * 买家在支付宝的用户id。通过userid+请求流水号组合查询时，此字段不可为空。
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 支付宝侧花呗冻结、解冻操作单据id。在原先的冻结或者解冻接口调用中同步返回给商户，或者通过商户通知返回给商户。按订单号查询时，此字段不可为空。
	 */
	@ApiField("auth_opt_id")
	private String authOptId;

	/**
	 * 商户原先调用冻结、解冻接口传入的请求流水号。按照流水号查询订单时，此字段不能为空。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getAuthOptId() {
		return this.authOptId;
	}
	public void setAuthOptId(String authOptId) {
		this.authOptId = authOptId;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

}
