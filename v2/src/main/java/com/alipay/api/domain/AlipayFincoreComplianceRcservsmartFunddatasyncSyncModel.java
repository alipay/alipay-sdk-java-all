package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 中欧基金数据同步
 *
 * @author auto create
 * @since 1.0, 2023-03-29 10:55:02
 */
public class AlipayFincoreComplianceRcservsmartFunddatasyncSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8833477933914635753L;

	/**
	 * 调用方系统信息
	 */
	@ApiField("app_info")
	private RcsmartCommonAppInfo appInfo;

	/**
	 * 中欧基金数据同步请求
	 */
	@ApiField("rcsmart_biz_request")
	private CommercializationSyncDataReq rcsmartBizRequest;

	public RcsmartCommonAppInfo getAppInfo() {
		return this.appInfo;
	}
	public void setAppInfo(RcsmartCommonAppInfo appInfo) {
		this.appInfo = appInfo;
	}

	public CommercializationSyncDataReq getRcsmartBizRequest() {
		return this.rcsmartBizRequest;
	}
	public void setRcsmartBizRequest(CommercializationSyncDataReq rcsmartBizRequest) {
		this.rcsmartBizRequest = rcsmartBizRequest;
	}

}
