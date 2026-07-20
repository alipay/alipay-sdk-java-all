package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序创建隐私协议
 *
 * @author auto create
 * @since 1.0, 2026-07-20 10:07:06
 */
public class AlipayOpenMiniPrivacyAuditCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2849833158929458113L;

	/**
	 * 联系人邮箱。邮箱和联系电话不可都为空
	 */
	@ApiField("contact_email")
	private String contactEmail;

	/**
	 * 联系人电话。邮箱和联系电话不可都为空
	 */
	@ApiField("contact_phone")
	private String contactPhone;

	/**
	 * 第三方插件信息
	 */
	@ApiListField("plugin_privacy_fields")
	@ApiField("plugin_privacy_fields")
	private List<PluginPrivacyFields> pluginPrivacyFields;

	/**
	 * 隐私协议对用户公开类型,可选公开(PUBLIC)和不公开(HIDE) 当前字段已废弃(该字段值固定位PUBLIC，无需传入。)
	 */
	@ApiField("public_type")
	@Deprecated
	private String publicType;

	/**
	 * 咨询回复时间，单位（天）
	 */
	@ApiField("reply_cycle")
	private String replyCycle;

	/**
	 * 第三方SDK信息
	 */
	@ApiListField("sdk_privacy_fields")
	@ApiField("sdk_privacy_fields")
	private List<SdkPrivacyFields> sdkPrivacyFields;

	/**
	 * 数据存储地,境内：inside，境外：outside
	 */
	@ApiField("storage_location")
	private String storageLocation;

	/**
	 * 端权限隐私字段
	 */
	@ApiListField("system_permission_privacy_fields")
	@ApiField("system_permission_privacy_fields")
	private List<SystemPermissionPrivacyFields> systemPermissionPrivacyFields;

	/**
	 * 用户信息隐私字段
	 */
	@ApiListField("system_privacy_fields")
	@ApiField("system_privacy_field")
	private List<SystemPrivacyField> systemPrivacyFields;

	/**
	 * 如果需要上传自定义文档，可通过alipay.open.mini.privacy.customfile.upload接口上传文件，并将该接口的返回中，user_custom_file字段的值填入这里。
	 */
	@ApiField("user_custom_file")
	private String userCustomFile;

	/**
	 * 用户自定义隐私字段。最多支持20个
	 */
	@ApiListField("user_define_privacy_fields")
	@ApiField("user_define_privacy_policy_field")
	private List<UserDefinePrivacyPolicyField> userDefinePrivacyFields;

	public String getContactEmail() {
		return this.contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactPhone() {
		return this.contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public List<PluginPrivacyFields> getPluginPrivacyFields() {
		return this.pluginPrivacyFields;
	}
	public void setPluginPrivacyFields(List<PluginPrivacyFields> pluginPrivacyFields) {
		this.pluginPrivacyFields = pluginPrivacyFields;
	}

	public String getPublicType() {
		return this.publicType;
	}
	public void setPublicType(String publicType) {
		this.publicType = publicType;
	}

	public String getReplyCycle() {
		return this.replyCycle;
	}
	public void setReplyCycle(String replyCycle) {
		this.replyCycle = replyCycle;
	}

	public List<SdkPrivacyFields> getSdkPrivacyFields() {
		return this.sdkPrivacyFields;
	}
	public void setSdkPrivacyFields(List<SdkPrivacyFields> sdkPrivacyFields) {
		this.sdkPrivacyFields = sdkPrivacyFields;
	}

	public String getStorageLocation() {
		return this.storageLocation;
	}
	public void setStorageLocation(String storageLocation) {
		this.storageLocation = storageLocation;
	}

	public List<SystemPermissionPrivacyFields> getSystemPermissionPrivacyFields() {
		return this.systemPermissionPrivacyFields;
	}
	public void setSystemPermissionPrivacyFields(List<SystemPermissionPrivacyFields> systemPermissionPrivacyFields) {
		this.systemPermissionPrivacyFields = systemPermissionPrivacyFields;
	}

	public List<SystemPrivacyField> getSystemPrivacyFields() {
		return this.systemPrivacyFields;
	}
	public void setSystemPrivacyFields(List<SystemPrivacyField> systemPrivacyFields) {
		this.systemPrivacyFields = systemPrivacyFields;
	}

	public String getUserCustomFile() {
		return this.userCustomFile;
	}
	public void setUserCustomFile(String userCustomFile) {
		this.userCustomFile = userCustomFile;
	}

	public List<UserDefinePrivacyPolicyField> getUserDefinePrivacyFields() {
		return this.userDefinePrivacyFields;
	}
	public void setUserDefinePrivacyFields(List<UserDefinePrivacyPolicyField> userDefinePrivacyFields) {
		this.userDefinePrivacyFields = userDefinePrivacyFields;
	}

}
