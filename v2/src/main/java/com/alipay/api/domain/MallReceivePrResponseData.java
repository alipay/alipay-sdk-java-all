package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 下pr单返回数据
 *
 * @author auto create
 * @since 1.0, 2023-07-11 10:38:04
 */
public class MallReceivePrResponseData extends AlipayObject {

	private static final long serialVersionUID = 8875232291239582711L;

	/**
	 * 采购商城申请单id
	 */
	@ApiField("pur_req_id")
	private String purReqId;

	/**
	 * 下单成功后跳转地址
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

	public String getPurReqId() {
		return this.purReqId;
	}
	public void setPurReqId(String purReqId) {
		this.purReqId = purReqId;
	}

	public String getRedirectUrl() {
		return this.redirectUrl;
	}
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

}
