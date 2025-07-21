package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票申请单查询
 *
 * @author auto create
 * @since 1.0, 2025-06-20 10:12:09
 */
public class AnttechOceanbaseInvoiceOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4821794311643463483L;

	/**
	 * 发票申请后返回的业务单号
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * 调用方主动传入的业务单号，标识着业务唯一
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 业务类型，标识着业务属性，新的接入需要申请新的业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	public String getApplyId() {
		return this.applyId;
	}
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

}
