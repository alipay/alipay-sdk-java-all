package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合规服务解语花数据查询接口
 *
 * @author auto create
 * @since 1.0, 2022-08-26 11:07:31
 */
public class AlipayFincoreComplianceRcservcenterRcsmartQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5697566295944596184L;

	/**
	 * 解语花鉴权对象
	 */
	@ApiField("app_info")
	private RcsmartCommonAppInfo appInfo;

	/**
	 * 请求参数，保证业务请求幂等性，同时在请求完毕后，获取业务风险详情信息结果使用
	 */
	@ApiField("approval_query")
	private ApprovalQuery approvalQuery;

	public RcsmartCommonAppInfo getAppInfo() {
		return this.appInfo;
	}
	public void setAppInfo(RcsmartCommonAppInfo appInfo) {
		this.appInfo = appInfo;
	}

	public ApprovalQuery getApprovalQuery() {
		return this.approvalQuery;
	}
	public void setApprovalQuery(ApprovalQuery approvalQuery) {
		this.approvalQuery = approvalQuery;
	}

}
