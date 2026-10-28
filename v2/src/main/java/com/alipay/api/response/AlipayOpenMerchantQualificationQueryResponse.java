package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BrandInfoItem;
import com.alipay.api.domain.CertificateInfoItem;
import com.alipay.api.domain.MerchantContacInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.merchant.qualification.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-10 16:06:23
 */
public class AlipayOpenMerchantQualificationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1561397218545273291L;

	/** 
	 * 1：未认证
3: 已认证
5:清退
6:作废
	 */
	@ApiField("auth_status")
	private String authStatus;

	/** 
	 * null
	 */
	@ApiListField("brand_infos")
	@ApiField("brand_info_item")
	private List<BrandInfoItem> brandInfos;

	/** 
	 * null
	 */
	@ApiListField("certificates")
	@ApiField("certificate_info_item")
	private List<CertificateInfoItem> certificates;

	/** 
	 * null
	 */
	@ApiListField("contact_persons")
	@ApiField("merchant_contac_info")
	private List<MerchantContacInfo> contactPersons;

	/** 
	 * 法定代表人姓名
	 */
	@ApiField("legal_person")
	private String legalPerson;

	/** 
	 * 商户类目编码（叶子级）
	 */
	@ApiField("mcc_code")
	private String mccCode;

	/** 
	 * 类目名称
	 */
	@ApiField("mcc_name")
	private String mccName;

	/** 
	 * 企业全称（法律主体名称）
	 */
	@ApiField("merchant_name")
	private String merchantName;

	public void setAuthStatus(String authStatus) {
		this.authStatus = authStatus;
	}
	public String getAuthStatus( ) {
		return this.authStatus;
	}

	public void setBrandInfos(List<BrandInfoItem> brandInfos) {
		this.brandInfos = brandInfos;
	}
	public List<BrandInfoItem> getBrandInfos( ) {
		return this.brandInfos;
	}

	public void setCertificates(List<CertificateInfoItem> certificates) {
		this.certificates = certificates;
	}
	public List<CertificateInfoItem> getCertificates( ) {
		return this.certificates;
	}

	public void setContactPersons(List<MerchantContacInfo> contactPersons) {
		this.contactPersons = contactPersons;
	}
	public List<MerchantContacInfo> getContactPersons( ) {
		return this.contactPersons;
	}

	public void setLegalPerson(String legalPerson) {
		this.legalPerson = legalPerson;
	}
	public String getLegalPerson( ) {
		return this.legalPerson;
	}

	public void setMccCode(String mccCode) {
		this.mccCode = mccCode;
	}
	public String getMccCode( ) {
		return this.mccCode;
	}

	public void setMccName(String mccName) {
		this.mccName = mccName;
	}
	public String getMccName( ) {
		return this.mccName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getMerchantName( ) {
		return this.merchantName;
	}

}
