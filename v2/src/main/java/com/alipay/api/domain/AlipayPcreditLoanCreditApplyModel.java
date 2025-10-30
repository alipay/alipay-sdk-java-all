package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 提交授信申请
 *
 * @author auto create
 * @since 1.0, 2018-11-14 14:24:32
 */
public class AlipayPcreditLoanCreditApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2341192781362389421L;

	/**
	 * 授权授信状态，取值范围{"unAuthorized", "authorized"}, authorized-已授权, unAuthorized-未授权
	 */
	@ApiField("authorized_status")
	private String authorizedStatus;

	/**
	 * 授信申请回跳地址，商户端提供的地址
	 */
	@ApiField("back_url")
	private String backUrl;

	/**
	 * 授信申请业务标准外部订单号，代表商户端自己订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 代表了一次请求，作为业务幂等性控制
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public String getAuthorizedStatus() {
		return this.authorizedStatus;
	}
	public void setAuthorizedStatus(String authorizedStatus) {
		this.authorizedStatus = authorizedStatus;
	}

	public String getBackUrl() {
		return this.backUrl;
	}
	public void setBackUrl(String backUrl) {
		this.backUrl = backUrl;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

}
