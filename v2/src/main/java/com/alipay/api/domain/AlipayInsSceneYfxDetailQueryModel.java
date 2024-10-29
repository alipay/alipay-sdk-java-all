package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运费险详情查询
 *
 * @author auto create
 * @since 1.0, 2023-02-24 13:43:59
 */
public class AlipayInsSceneYfxDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3567769276931682715L;

	/**
	 * 开放平台分配的appid
	 */
	@ApiField("app_key")
	private String appKey;

	/**
	 * 交易订单号
	 */
	@ApiField("biz_order_id")
	private String bizOrderId;

	/**
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	public String getAppKey() {
		return this.appKey;
	}
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public String getBizOrderId() {
		return this.bizOrderId;
	}
	public void setBizOrderId(String bizOrderId) {
		this.bizOrderId = bizOrderId;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

}
