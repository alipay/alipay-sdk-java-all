package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合规服务解语花规则逻辑删除
 *
 * @author auto create
 * @since 1.0, 2023-02-23 20:31:48
 */
public class AlipayFincoreComplianceRcservsmartCustomizeruleDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4446243564875954115L;

	/**
	 * 调用方系统信息
	 */
	@ApiField("app_info")
	private RcsmartCommonAppInfo appInfo;

	/**
	 * 自定义规则信息
	 */
	@ApiField("rcsmart_biz_request")
	private CommercializationDeleteRuleReq rcsmartBizRequest;

	public RcsmartCommonAppInfo getAppInfo() {
		return this.appInfo;
	}
	public void setAppInfo(RcsmartCommonAppInfo appInfo) {
		this.appInfo = appInfo;
	}

	public CommercializationDeleteRuleReq getRcsmartBizRequest() {
		return this.rcsmartBizRequest;
	}
	public void setRcsmartBizRequest(CommercializationDeleteRuleReq rcsmartBizRequest) {
		this.rcsmartBizRequest = rcsmartBizRequest;
	}

}
