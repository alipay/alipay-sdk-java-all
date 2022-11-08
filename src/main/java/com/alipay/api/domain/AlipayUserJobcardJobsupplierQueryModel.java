package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小蓝卡岗位供应商查询接口
 *
 * @author auto create
 * @since 1.0, 2022-01-26 17:31:52
 */
public class AlipayUserJobcardJobsupplierQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8347187418484217679L;

	/**
	 * 职位供应商code
	 */
	@ApiField("job_supplier_code")
	private String jobSupplierCode;

	/**
	 * 支付宝用户user_id
	 */
	@ApiField("user_id")
	private String userId;

	public String getJobSupplierCode() {
		return this.jobSupplierCode;
	}
	public void setJobSupplierCode(String jobSupplierCode) {
		this.jobSupplierCode = jobSupplierCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
