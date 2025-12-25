package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 云霄客户更新
 *
 * @author auto create
 * @since 1.0, 2025-10-23 09:45:19
 */
public class AlipayIserviceCcmCrmYxcustomerModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1281239546251849692L;

	/**
	 * 要更新的联系人信息
	 */
	@ApiListField("contact_info_list")
	@ApiField("yx_contact_info")
	private List<YxContactInfo> contactInfoList;

	/**
	 * 客户记录的ID
	 */
	@ApiField("data_id")
	private Long dataId;

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

	public Long getDataId() {
		return this.dataId;
	}
	public void setDataId(Long dataId) {
		this.dataId = dataId;
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
