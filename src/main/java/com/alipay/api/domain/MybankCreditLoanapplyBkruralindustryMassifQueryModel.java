package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询地块列表信息
 *
 * @author auto create
 * @since 1.0, 2021-12-22 10:12:40
 */
public class MybankCreditLoanapplyBkruralindustryMassifQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7452463187835882264L;

	/**
	 * 流水id
	 */
	@ApiField("business_no")
	private String businessNo;

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
