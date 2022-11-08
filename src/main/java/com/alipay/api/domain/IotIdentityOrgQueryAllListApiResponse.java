package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 机构全部查询响应列表，没有组件信息
 *
 * @author auto create
 * @since 1.0, 2022-01-23 09:14:07
 */
public class IotIdentityOrgQueryAllListApiResponse extends AlipayObject {

	private static final long serialVersionUID = 8863473562388638197L;

	/**
	 * 签约的机构列表
	 */
	@ApiListField("orgs")
	@ApiField("iot_identity_org_query_all_api_response")
	private List<IotIdentityOrgQueryAllApiResponse> orgs;

	public List<IotIdentityOrgQueryAllApiResponse> getOrgs() {
		return this.orgs;
	}
	public void setOrgs(List<IotIdentityOrgQueryAllApiResponse> orgs) {
		this.orgs = orgs;
	}

}
