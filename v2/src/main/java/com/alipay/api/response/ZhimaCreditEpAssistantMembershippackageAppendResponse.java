package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AssistantLicenseInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.assistant.membershippackage.append response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-02 11:52:44
 */
public class ZhimaCreditEpAssistantMembershippackageAppendResponse extends AlipayResponse {

	private static final long serialVersionUID = 5354794669489141846L;

	/** 
	 * null
	 */
	@ApiListField("license_detail_list")
	@ApiField("assistant_license_info")
	private List<AssistantLicenseInfo> licenseDetailList;

	/** 
	 * 会员包编码
	 */
	@ApiField("package_id")
	private String packageId;

	public void setLicenseDetailList(List<AssistantLicenseInfo> licenseDetailList) {
		this.licenseDetailList = licenseDetailList;
	}
	public List<AssistantLicenseInfo> getLicenseDetailList( ) {
		return this.licenseDetailList;
	}

	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}
	public String getPackageId( ) {
		return this.packageId;
	}

}
