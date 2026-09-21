package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 省局交互接口
 *
 * @author auto create
 * @since 1.0, 2026-09-15 16:42:56
 */
public class AlipayCommerceMedicalInsuranceFesSendModel extends AlipayObject {

	private static final long serialVersionUID = 4291685976984974547L;

	/**
	 * 交易时间
	 */
	@ApiField("cur_company_id")
	private String curCompanyId;

	/**
	 * 交易时间
	 */
	@ApiField("enc_content")
	private String encContent;

	/**
	 * 交易时间
	 */
	@ApiField("enterprise_url")
	private String enterpriseUrl;

	/**
	 * 交易时间
	 */
	@ApiField("trans_date")
	private String transDate;

	/**
	 * 交易时间
	 */
	@ApiField("trans_no")
	private String transNo;

	public String getCurCompanyId() {
		return this.curCompanyId;
	}
	public void setCurCompanyId(String curCompanyId) {
		this.curCompanyId = curCompanyId;
	}

	public String getEncContent() {
		return this.encContent;
	}
	public void setEncContent(String encContent) {
		this.encContent = encContent;
	}

	public String getEnterpriseUrl() {
		return this.enterpriseUrl;
	}
	public void setEnterpriseUrl(String enterpriseUrl) {
		this.enterpriseUrl = enterpriseUrl;
	}

	public String getTransDate() {
		return this.transDate;
	}
	public void setTransDate(String transDate) {
		this.transDate = transDate;
	}

	public String getTransNo() {
		return this.transNo;
	}
	public void setTransNo(String transNo) {
		this.transNo = transNo;
	}

}
