package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AssistantLicenseInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.assistant.membershippackage.order response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-02 11:48:34
 */
public class ZhimaCreditEpAssistantMembershippackageOrderResponse extends AlipayResponse {

	private static final long serialVersionUID = 6553945944312356594L;

	/** 
	 * 会员包生效时间
	 */
	@ApiField("begin_time")
	private Date beginTime;

	/** 
	 * 会员包失效时间
	 */
	@ApiField("end_time")
	private Date endTime;

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

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}
	public Date getBeginTime( ) {
		return this.beginTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Date getEndTime( ) {
		return this.endTime;
	}

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
