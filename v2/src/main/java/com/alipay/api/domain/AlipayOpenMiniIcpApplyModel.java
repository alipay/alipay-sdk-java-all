package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序申请备案
 *
 * @author auto create
 * @since 1.0, 2024-03-26 17:35:50
 */
public class AlipayOpenMiniIcpApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3178552229538276456L;

	/**
	 * 小程序备案小程序信息
	 */
	@ApiField("icp_applets")
	private IcpAppletsInfo icpApplets;

	/**
	 * 小程序备案小程序负责人信息
	 */
	@ApiField("icp_applets_principal_info")
	private IcpAppletsPrincipalInfo icpAppletsPrincipalInfo;

	/**
	 * 小程序备案主体信息
	 */
	@ApiField("icp_subject")
	private IcpSubjectInfo icpSubject;

	public IcpAppletsInfo getIcpApplets() {
		return this.icpApplets;
	}
	public void setIcpApplets(IcpAppletsInfo icpApplets) {
		this.icpApplets = icpApplets;
	}

	public IcpAppletsPrincipalInfo getIcpAppletsPrincipalInfo() {
		return this.icpAppletsPrincipalInfo;
	}
	public void setIcpAppletsPrincipalInfo(IcpAppletsPrincipalInfo icpAppletsPrincipalInfo) {
		this.icpAppletsPrincipalInfo = icpAppletsPrincipalInfo;
	}

	public IcpSubjectInfo getIcpSubject() {
		return this.icpSubject;
	}
	public void setIcpSubject(IcpSubjectInfo icpSubject) {
		this.icpSubject = icpSubject;
	}

}
