package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询地块列表信息
 *
 * @author auto create
 * @since 1.0, 2023-08-10 10:21:11
 */
public class MybankCreditLoanapplyBkruralindustryMassifQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5233977995931314982L;

	/**
	 * 流水id
	 */
	@ApiField("business_no")
	private String businessNo;

	/**
	 * OpenId是某个用户在某个应用下的唯一用户标识， 对于同一个用户，不同应用拿到的OpenId是不同的，而且对于同一个应用，不同用户的OpenId是唯一的
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 请求id
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 用户2088
	 */
	@ApiField("uid")
	private String uid;

	public String getBusinessNo() {
		return this.businessNo;
	}
	public void setBusinessNo(String businessNo) {
		this.businessNo = businessNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
