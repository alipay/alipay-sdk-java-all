package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 线索修改
 *
 * @author auto create
 * @since 1.0, 2025-01-08 15:02:18
 */
public class AlipayIserviceCcmCrmClueModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6754987127874249664L;

	/**
	 * 线索的客户名称，区分为个人线索和企业线索，个人线索传名称，企业线索传公司名称
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 数据id，为同步客户线索信息（sync）导入后的返回值
	 */
	@ApiField("data_id")
	private String dataId;

	/**
	 * 扩展信息字段有以下字段：
1. **用户标签 (user_labels)**: 枚举值为 "老用户", "新用户"。
2 **电话是否接通 (is_tel_ok)**: 枚举值为 "是", "否"。
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 客资线索所对应的手机号码
	 */
	@ApiField("mobile_phone")
	private String mobilePhone;

	/**
	 * 租户实例id，必填，智能拓客平台分配
	 */
	@ApiField("tenant_id")
	private String tenantId;

	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getDataId() {
		return this.dataId;
	}
	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getMobilePhone() {
		return this.mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

}
