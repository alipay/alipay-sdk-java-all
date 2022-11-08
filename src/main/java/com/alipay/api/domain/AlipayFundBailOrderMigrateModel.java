package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保证金资金迁移
 *
 * @author auto create
 * @since 1.0, 2022-01-19 10:11:42
 */
public class AlipayFundBailOrderMigrateModel extends AlipayObject {

	private static final long serialVersionUID = 7852498821421269885L;

	/**
	 * 保证金协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 扩展参数
	 */
	@ApiField("extra_param")
	private String extraParam;

	/**
	 * 外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getExtraParam() {
		return this.extraParam;
	}
	public void setExtraParam(String extraParam) {
		this.extraParam = extraParam;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
