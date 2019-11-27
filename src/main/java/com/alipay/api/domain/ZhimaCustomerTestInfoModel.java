package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 测试
 *
 * @author auto create
 * @since 1.0, 2016-09-13 22:53:46
 */
public class ZhimaCustomerTestInfoModel extends AlipayObject {

	private static final long serialVersionUID = 2532883885217161257L;

	/**
	 * 身份证号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 用户姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 还款计划
	 */
	@ApiListField("repayments")
	@ApiField("repayments")
	private List<Repayments> repayments;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<Repayments> getRepayments() {
		return this.repayments;
	}
	public void setRepayments(List<Repayments> repayments) {
		this.repayments = repayments;
	}

}
