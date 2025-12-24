package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 法人证照
 *
 * @author auto create
 * @since 1.0, 2025-10-23 10:09:26
 */
public class ShopCertificateInfo extends AlipayObject {

	private static final long serialVersionUID = 5596189553865452735L;

	/**
	 * 法人证件反面
	 */
	@ApiField("legal_back_pic")
	private String legalBackPic;

	/**
	 * 证件到期时间
	 */
	@ApiField("legal_end_time")
	private String legalEndTime;

	/**
	 * 法人证件正面
	 */
	@ApiField("legal_front_pic")
	private String legalFrontPic;

	/**
	 * 法人证件名称
	 */
	@ApiField("legal_name")
	private String legalName;

	/**
	 * 法人证件号
	 */
	@ApiField("legal_no")
	private String legalNo;

	public String getLegalBackPic() {
		return this.legalBackPic;
	}
	public void setLegalBackPic(String legalBackPic) {
		this.legalBackPic = legalBackPic;
	}

	public String getLegalEndTime() {
		return this.legalEndTime;
	}
	public void setLegalEndTime(String legalEndTime) {
		this.legalEndTime = legalEndTime;
	}

	public String getLegalFrontPic() {
		return this.legalFrontPic;
	}
	public void setLegalFrontPic(String legalFrontPic) {
		this.legalFrontPic = legalFrontPic;
	}

	public String getLegalName() {
		return this.legalName;
	}
	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}

	public String getLegalNo() {
		return this.legalNo;
	}
	public void setLegalNo(String legalNo) {
		this.legalNo = legalNo;
	}

}
