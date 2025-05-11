package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 政企团购分期支用外部订单映射同步
 *
 * @author auto create
 * @since 1.0, 2025-03-21 17:37:21
 */
public class XingheLendassistSrcfgestagelendOutordermappingSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7366592957136427142L;

	/**
	 * 政企员工团购分期授信初审的申请单号
	 */
	@ApiField("credit_apply_no")
	private String creditApplyNo;

	/**
	 * 平台为接入客户分配
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 网商支用审批的外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 业务所属产品，平台为业务分配
	 */
	@ApiField("prod_code")
	private String prodCode;

	public String getCreditApplyNo() {
		return this.creditApplyNo;
	}
	public void setCreditApplyNo(String creditApplyNo) {
		this.creditApplyNo = creditApplyNo;
	}

	public String getIpId() {
		return this.ipId;
	}
	public void setIpId(String ipId) {
		this.ipId = ipId;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getProdCode() {
		return this.prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

}
