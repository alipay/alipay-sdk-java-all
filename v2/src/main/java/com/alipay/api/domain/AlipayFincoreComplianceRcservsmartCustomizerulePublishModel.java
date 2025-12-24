package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合规服务解语花规则配置发布
 *
 * @author auto create
 * @since 1.0, 2023-02-23 20:31:27
 */
public class AlipayFincoreComplianceRcservsmartCustomizerulePublishModel extends AlipayObject {

	private static final long serialVersionUID = 2243916435953276971L;

	/**
	 * 调用方系统信息
	 */
	@ApiField("app_info")
	private RcsmartCommonAppInfo appInfo;

	/**
	 * 自定义规则请求
	 */
	@ApiField("rcsmart_biz_request")
	private CommercializationCustomizeRuleReq rcsmartBizRequest;

	public RcsmartCommonAppInfo getAppInfo() {
		return this.appInfo;
	}
	public void setAppInfo(RcsmartCommonAppInfo appInfo) {
		this.appInfo = appInfo;
	}

	public CommercializationCustomizeRuleReq getRcsmartBizRequest() {
		return this.rcsmartBizRequest;
	}
	public void setRcsmartBizRequest(CommercializationCustomizeRuleReq rcsmartBizRequest) {
		this.rcsmartBizRequest = rcsmartBizRequest;
	}

}
