package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.assistant.membershippackage.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-23 10:17:42
 */
public class ZhimaCreditEpAssistantMembershippackageCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2572428427137449398L;

	/** 
	 * null
	 */
	@ApiListField("licenses")
	@ApiField("string")
	private List<String> licenses;

	/** 
	 * 会员包编码
	 */
	@ApiField("package_id")
	private String packageId;

	public void setLicenses(List<String> licenses) {
		this.licenses = licenses;
	}
	public List<String> getLicenses( ) {
		return this.licenses;
	}

	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}
	public String getPackageId( ) {
		return this.packageId;
	}

}
