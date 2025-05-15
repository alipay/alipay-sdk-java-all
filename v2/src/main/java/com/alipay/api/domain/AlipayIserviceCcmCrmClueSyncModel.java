package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 线索同步
 *
 * @author auto create
 * @since 1.0, 2025-01-08 15:02:06
 */
public class AlipayIserviceCcmCrmClueSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7268632181981794579L;

	/**
	 * 线索的客户名称，区分为个人线索和企业线索，个人线索传名称，企业线索传公司名称
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 扩展信息字段有以下字段：
1. **用户标签 (user_labels)**: 可以枚举为 "老用户", "新用户"。
2 **电话是否接通 (is_tel_ok)**: 枚举值为 "是", "否"。
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 业务方的客户ID，保证全局唯一(幂等处理)，示例值：1278789a
	 */
	@ApiField("external_contact_id")
	private String externalContactId;

	/**
	 * 客资线索所对应的手机号码，明文
	 */
	@ApiField("mobile_phone")
	private String mobilePhone;

	/**
	 * 是否开启服务群的通知。开启后，使用该接口同步线索时服务群会收到通知
	 */
	@ApiField("open_notify")
	private Boolean openNotify;

	/**
	 * 智能拓客平台租户ID,参数类型为字符串string类型,示例值："VTGhsiqj8791n"
	 */
	@ApiField("tenant_id")
	private String tenantId;

	/**
	 * 是否使用虚拟号码，默认为false。
	 */
	@ApiField("use_virtual_phone")
	private Boolean useVirtualPhone;

	/**
	 * 虚拟号码，当使用虚拟号码的开关user_virtual_phone设置为true并且虚拟号类型Virtual_phone_type设置为MANUAL后生效。
	 */
	@ApiField("virtual_phone")
	private String virtualPhone;

	/**
	 * 虚拟号类型，默认为自动生成。目前有两种方式，一种是系统生成方案，参数为AUTO_GENERATE；另一种是调用方指定的方式，参数为MANUAL
	 */
	@ApiField("virtual_phone_type")
	private String virtualPhoneType;

	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getExternalContactId() {
		return this.externalContactId;
	}
	public void setExternalContactId(String externalContactId) {
		this.externalContactId = externalContactId;
	}

	public String getMobilePhone() {
		return this.mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public Boolean getOpenNotify() {
		return this.openNotify;
	}
	public void setOpenNotify(Boolean openNotify) {
		this.openNotify = openNotify;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public Boolean getUseVirtualPhone() {
		return this.useVirtualPhone;
	}
	public void setUseVirtualPhone(Boolean useVirtualPhone) {
		this.useVirtualPhone = useVirtualPhone;
	}

	public String getVirtualPhone() {
		return this.virtualPhone;
	}
	public void setVirtualPhone(String virtualPhone) {
		this.virtualPhone = virtualPhone;
	}

	public String getVirtualPhoneType() {
		return this.virtualPhoneType;
	}
	public void setVirtualPhoneType(String virtualPhoneType) {
		this.virtualPhoneType = virtualPhoneType;
	}

}
