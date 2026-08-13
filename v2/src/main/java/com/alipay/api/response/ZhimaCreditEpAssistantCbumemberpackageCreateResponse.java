package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AssistantLicenseInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.assistant.cbumemberpackage.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-29 11:27:48
 */
public class ZhimaCreditEpAssistantCbumemberpackageCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2621227464277898424L;

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
	 * 许可证详情信息
	 */
	@ApiField("license_detail_list")
	private AssistantLicenseInfo licenseDetailList;

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

	public void setLicenseDetailList(AssistantLicenseInfo licenseDetailList) {
		this.licenseDetailList = licenseDetailList;
	}
	public AssistantLicenseInfo getLicenseDetailList( ) {
		return this.licenseDetailList;
	}

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
