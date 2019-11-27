package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 芝麻信用履约状态反馈
 *
 * @author auto create
 * @since 1.0, 2016-09-22 11:36:53
 */
public class ZhimaCustomerPerformanceStatusFeedbackModel extends AlipayObject {

	private static final long serialVersionUID = 8515914245172541462L;

	/**
	 * 用户证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 扩展参数
	 */
	@ApiField("ext_params")
	private String extParams;

	/**
	 * 用户姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 用户在合作伙伴处的还款计划数据
	 */
	@ApiListField("repayments")
	@ApiField("repayment")
	private List<Repayment> repayments;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getExtParams() {
		return this.extParams;
	}
	public void setExtParams(String extParams) {
		this.extParams = extParams;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<Repayment> getRepayments() {
		return this.repayments;
	}
	public void setRepayments(List<Repayment> repayments) {
		this.repayments = repayments;
	}

}
