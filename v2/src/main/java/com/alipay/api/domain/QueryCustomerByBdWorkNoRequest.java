package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 请求参数
 *
 * @author auto create
 * @since 1.0, 2025-11-13 15:27:41
 */
public class QueryCustomerByBdWorkNoRequest extends AlipayObject {

	private static final long serialVersionUID = 8189815351231776988L;

	/**
	 * bd工号
	 */
	@ApiField("bd_work_no")
	private String bdWorkNo;

	/**
	 * 客户编码
	 */
	@ApiField("cid")
	private String cid;

	/**
	 * 客户名称
	 */
	@ApiField("customer_name")
	private String customerName;

	public String getBdWorkNo() {
		return this.bdWorkNo;
	}
	public void setBdWorkNo(String bdWorkNo) {
		this.bdWorkNo = bdWorkNo;
	}

	public String getCid() {
		return this.cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCustomerName() {
		return this.customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

}
