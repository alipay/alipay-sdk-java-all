package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PluginPrivacyFields;
import com.alipay.api.domain.SdkPrivacyFields;
import com.alipay.api.domain.SystemPermissionPrivacyFields;
import com.alipay.api.domain.SystemPrivacyField;
import com.alipay.api.domain.UserDefinePrivacyPolicyField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.privacy.onlineversion.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-20 10:02:52
 */
public class AlipayOpenMiniPrivacyOnlineversionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5792585497558424638L;

	/** 
	 * 联系人邮箱。
	 */
	@ApiField("contact_email")
	private String contactEmail;

	/** 
	 * 联系人电话。
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
	 * 系统定义的隐私字段
	 */
	@ApiListField("system_privacy_fields")
	@ApiField("system_privacy_field")
	private List<SystemPrivacyField> systemPrivacyFields;

	/** 
	 * 自定义文档链接
	 */
	@ApiField("user_custom_file")
	private String userCustomFile;

	/** 
	 * 用户自定义隐私字段。
	 */
	@ApiListField("user_define_privacy_fields")
	@ApiField("user_define_privacy_policy_field")
	private List<UserDefinePrivacyPolicyField> userDefinePrivacyFields;

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public String getContactEmail( ) {
		return this.contactEmail;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	public String getContactPhone( ) {
		return this.contactPhone;
	}

	public void setPluginPrivacyFields(List<PluginPrivacyFields> pluginPrivacyFields) {
		this.pluginPrivacyFields = pluginPrivacyFields;
	}
	public List<PluginPrivacyFields> getPluginPrivacyFields( ) {
		return this.pluginPrivacyFields;
	}

	public void setReplyCycle(String replyCycle) {
		this.replyCycle = replyCycle;
	}
	public String getReplyCycle( ) {
		return this.replyCycle;
	}

	public void setSdkPrivacyFields(List<SdkPrivacyFields> sdkPrivacyFields) {
		this.sdkPrivacyFields = sdkPrivacyFields;
	}
	public List<SdkPrivacyFields> getSdkPrivacyFields( ) {
		return this.sdkPrivacyFields;
	}

	public void setStorageLocation(String storageLocation) {
		this.storageLocation = storageLocation;
	}
	public String getStorageLocation( ) {
		return this.storageLocation;
	}

	public void setSystemPermissionPrivacyFields(List<SystemPermissionPrivacyFields> systemPermissionPrivacyFields) {
		this.systemPermissionPrivacyFields = systemPermissionPrivacyFields;
	}
	public List<SystemPermissionPrivacyFields> getSystemPermissionPrivacyFields( ) {
		return this.systemPermissionPrivacyFields;
	}

	public void setSystemPrivacyFields(List<SystemPrivacyField> systemPrivacyFields) {
		this.systemPrivacyFields = systemPrivacyFields;
	}
	public List<SystemPrivacyField> getSystemPrivacyFields( ) {
		return this.systemPrivacyFields;
	}

	public void setUserCustomFile(String userCustomFile) {
		this.userCustomFile = userCustomFile;
	}
	public String getUserCustomFile( ) {
		return this.userCustomFile;
	}

	public void setUserDefinePrivacyFields(List<UserDefinePrivacyPolicyField> userDefinePrivacyFields) {
		this.userDefinePrivacyFields = userDefinePrivacyFields;
	}
	public List<UserDefinePrivacyPolicyField> getUserDefinePrivacyFields( ) {
		return this.userDefinePrivacyFields;
	}

}
