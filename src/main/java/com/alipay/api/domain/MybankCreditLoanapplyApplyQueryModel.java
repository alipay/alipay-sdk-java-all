package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 客户申贷记录查询
 *
 * @author auto create
 * @since 1.0, 2018-07-12 11:27:07
 */
public class MybankCreditLoanapplyApplyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3219177355726597414L;

	/**
	 * 证件号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 扩展查询参数
	 */
	@ApiField("ext_params")
	private String extParams;

	/**
	 * 客户姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 子申请单编号
	 */
	@ApiField("subapply_no")
	private String subapplyNo;

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

	public String getSubapplyNo() {
		return this.subapplyNo;
	}
	public void setSubapplyNo(String subapplyNo) {
		this.subapplyNo = subapplyNo;
	}

}
