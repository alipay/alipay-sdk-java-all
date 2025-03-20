package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询数字人民币对公钱包开立进度
 *
 * @author auto create
 * @since 1.0, 2021-12-10 19:20:20
 */
public class MybankEcnyEntwalletCreateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1716946549528581855L;

	/**
	 * 单位证件号, 选择填写外部请求号时，字段必填
	 */
	@ApiField("ent_cert_no")
	private String entCertNo;

	/**
	 * 单位证件类型，选择填写外部请求号时，字段必填
	 */
	@ApiField("ent_cert_type")
	private String entCertType;

	/**
	 * 单位名称，选择填写外部请求号时，字段必填
	 */
	@ApiField("ent_name")
	private String entName;

	/**
	 * 外部请求号，外部请求号和受理流水号两者必填一项
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 受理流水号，外部请求号和受理流水号两者必填一项
	 */
	@ApiField("process_no")
	private String processNo;

	public String getEntCertNo() {
		return this.entCertNo;
	}
	public void setEntCertNo(String entCertNo) {
		this.entCertNo = entCertNo;
	}

	public String getEntCertType() {
		return this.entCertType;
	}
	public void setEntCertType(String entCertType) {
		this.entCertType = entCertType;
	}

	public String getEntName() {
		return this.entName;
	}
	public void setEntName(String entName) {
		this.entName = entName;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getProcessNo() {
		return this.processNo;
	}
	public void setProcessNo(String processNo) {
		this.processNo = processNo;
	}

}
