package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合规服务解语花规则状态变更
 *
 * @author auto create
 * @since 1.0, 2023-02-23 20:31:38
 */
public class AlipayFincoreComplianceRcservsmartCustomizeruleModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2469576569359357943L;

	/**
	 * 调用方系统信息
	 */
	@ApiField("app_info")
	private RcsmartCommonAppInfo appInfo;

	/**
	 * 规则状态内容
	 */
	@ApiField("rcsmart_biz_request")
	private CustomizeRuleResult rcsmartBizRequest;

	public RcsmartCommonAppInfo getAppInfo() {
		return this.appInfo;
	}
	public void setAppInfo(RcsmartCommonAppInfo appInfo) {
		this.appInfo = appInfo;
	}

	public CustomizeRuleResult getRcsmartBizRequest() {
		return this.rcsmartBizRequest;
	}
	public void setRcsmartBizRequest(CustomizeRuleResult rcsmartBizRequest) {
		this.rcsmartBizRequest = rcsmartBizRequest;
	}

}
