package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EcocheckYzPolicyCheckDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.check.postpolicy.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 04:56:44
 */
public class AlipayCommerceLogisticsCheckPostpolicyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2186443486288793454L;

	/** 
	 * 合法的小程序验收结果
	 */
	@ApiListField("app_check_info_list")
	@ApiField("ecocheck_yz_policy_check_detail")
	private List<EcocheckYzPolicyCheckDetail> appCheckInfoList;

	/** 
	 * 无效或无权限查询的appId列表
	 */
	@ApiListField("invalid_app_id_list")
	@ApiField("string")
	private List<String> invalidAppIdList;

	public void setAppCheckInfoList(List<EcocheckYzPolicyCheckDetail> appCheckInfoList) {
		this.appCheckInfoList = appCheckInfoList;
	}
	public List<EcocheckYzPolicyCheckDetail> getAppCheckInfoList( ) {
		return this.appCheckInfoList;
	}

	public void setInvalidAppIdList(List<String> invalidAppIdList) {
		this.invalidAppIdList = invalidAppIdList;
	}
	public List<String> getInvalidAppIdList( ) {
		return this.invalidAppIdList;
	}

}
