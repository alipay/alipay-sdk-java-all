package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ape查询店铺ID
 *
 * @author auto create
 * @since 1.0, 2022-10-12 17:52:45
 */
public class AlipayDigitalopUcdpApeshopidQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2678468521221586698L;

	/**
	 * 商户角色id，同步蚂蚁门店时的pid
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * ape维度的租户ID
	 */
	@ApiField("org_id")
	private String orgId;

	/**
	 * 商家侧门店ID
	 */
	@ApiField("store_id")
	private String storeId;

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getOrgId() {
		return this.orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
