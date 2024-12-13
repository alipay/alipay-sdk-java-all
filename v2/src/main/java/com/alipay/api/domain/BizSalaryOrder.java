package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发薪关联的业务流水
 *
 * @author auto create
 * @since 1.0, 2024-09-14 15:22:04
 */
public class BizSalaryOrder extends AlipayObject {

	private static final long serialVersionUID = 7895333922199312378L;

	/**
	 * 发薪申请关联的业务单据对应的单据号，请求方自行制定。
	 */
	@ApiField("biz_order_no")
	private String bizOrderNo;

	/**
	 * 雇主名称
	 */
	@ApiField("employer_name")
	private String employerName;

	public String getBizOrderNo() {
		return this.bizOrderNo;
	}
	public void setBizOrderNo(String bizOrderNo) {
		this.bizOrderNo = bizOrderNo;
	}

	public String getEmployerName() {
		return this.employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

}
