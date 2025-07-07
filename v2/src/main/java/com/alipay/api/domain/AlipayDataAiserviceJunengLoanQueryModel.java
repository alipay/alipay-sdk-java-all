package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户的贷款资质
 *
 * @author auto create
 * @since 1.0, 2020-07-23 10:04:57
 */
public class AlipayDataAiserviceJunengLoanQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3575332553988884132L;

	/**
	 * 额外的信息，以 json 字符串的方式组织
	 */
	@ApiField("extension_info")
	private String extensionInfo;

	/**
	 * 借款人身份证号的md5
	 */
	@ApiField("hashed_cert_no")
	private String hashedCertNo;

	/**
	 * 机构代码，区别调用的外部机构
	 */
	@ApiField("institution_uuid")
	private String institutionUuid;

	/**
	 * 单次请求的 uuid
	 */
	@ApiField("request_uuid")
	private String requestUuid;

	/**
	 * 用户属性，包含隐私保护数据和原始数据。
	 */
	@ApiField("user_feature")
	private String userFeature;

	public String getExtensionInfo() {
		return this.extensionInfo;
	}
	public void setExtensionInfo(String extensionInfo) {
		this.extensionInfo = extensionInfo;
	}

	public String getHashedCertNo() {
		return this.hashedCertNo;
	}
	public void setHashedCertNo(String hashedCertNo) {
		this.hashedCertNo = hashedCertNo;
	}

	public String getInstitutionUuid() {
		return this.institutionUuid;
	}
	public void setInstitutionUuid(String institutionUuid) {
		this.institutionUuid = institutionUuid;
	}

	public String getRequestUuid() {
		return this.requestUuid;
	}
	public void setRequestUuid(String requestUuid) {
		this.requestUuid = requestUuid;
	}

	public String getUserFeature() {
		return this.userFeature;
	}
	public void setUserFeature(String userFeature) {
		this.userFeature = userFeature;
	}

}
