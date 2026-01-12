package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 云霄客户导入
 *
 * @author auto create
 * @since 1.0, 2025-10-23 09:44:28
 */
public class AlipayIserviceCcmCrmYxcustomerSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6493199681578861675L;

	/**
	 * 客户联系人信息，至少有1个
	 */
	@ApiListField("contact_info_list")
	@ApiField("yx_contact_info")
	private List<YxContactInfo> contactInfoList;

	/**
	 * 客户ID，非客户信息的ID，同外部系统的关联项
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 客户信息的额外信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 租户ID
	 */
	@ApiField("tenant_id")
	private String tenantId;

	public List<YxContactInfo> getContactInfoList() {
		return this.contactInfoList;
	}
	public void setContactInfoList(List<YxContactInfo> contactInfoList) {
		this.contactInfoList = contactInfoList;
	}

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

}
