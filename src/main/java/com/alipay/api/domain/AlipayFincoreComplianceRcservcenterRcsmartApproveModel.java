package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * cic合规服务解语花内容统一审核接口
 *
 * @author auto create
 * @since 1.0, 2022-08-26 11:07:03
 */
public class AlipayFincoreComplianceRcservcenterRcsmartApproveModel extends AlipayObject {

	private static final long serialVersionUID = 6519322848499217599L;

	/**
	 * 调用系统信息
	 */
	@ApiField("app_info")
	private RcsmartCommonAppInfo appInfo;

	/**
	 * 素材内容请求信息
	 */
	@ApiField("commercialization_approval_req")
	private RcsmartCommonApprovalReq commercializationApprovalReq;

	public RcsmartCommonAppInfo getAppInfo() {
		return this.appInfo;
	}
	public void setAppInfo(RcsmartCommonAppInfo appInfo) {
		this.appInfo = appInfo;
	}

	public RcsmartCommonApprovalReq getCommercializationApprovalReq() {
		return this.commercializationApprovalReq;
	}
	public void setCommercializationApprovalReq(RcsmartCommonApprovalReq commercializationApprovalReq) {
		this.commercializationApprovalReq = commercializationApprovalReq;
	}

}
