package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险产品准入申请
 *
 * @author auto create
 * @since 1.0, 2019-06-05 17:12:42
 */
public class AlipayInsSceneProductAccessApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2326514486823432865L;

	/**
	 * 投保人
	 */
	@ApiField("applicant")
	private InsPerson applicant;

	/**
	 * 外部业务字段，幂等字段
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 保险产品码
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 业务场景码
	 */
	@ApiField("source")
	private String source;

	public InsPerson getApplicant() {
		return this.applicant;
	}
	public void setApplicant(InsPerson applicant) {
		this.applicant = applicant;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProdCode() {
		return this.prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
