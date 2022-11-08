package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序创建隐私协议
 *
 * @author auto create
 * @since 1.0, 2022-03-04 10:11:44
 */
public class AlipayOpenMiniPrivacyAuditCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7434757148387776669L;

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
	 * 隐私协议对用户公开类型,可选公开(PUBLIC)和不公开(HIDE)
	 */
	@ApiField("public_type")
	private String publicType;

	/**
	 * 咨询回复时间，单位（天）
	 */
	@ApiField("reply_cycle")
	private String replyCycle;

	/**
	 * 数据存储地,境内：inside，境外：outside
	 */
	@ApiField("storage_location")
	private String storageLocation;

	/**
	 * 系统定义的隐私字段
	 */
	@ApiListField("system_privacy_fields")
	@ApiField("system_privacy_field")
	private List<SystemPrivacyField> systemPrivacyFields;

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

	public String getStorageLocation() {
		return this.storageLocation;
	}
	public void setStorageLocation(String storageLocation) {
		this.storageLocation = storageLocation;
	}

	public List<SystemPrivacyField> getSystemPrivacyFields() {
		return this.systemPrivacyFields;
	}
	public void setSystemPrivacyFields(List<SystemPrivacyField> systemPrivacyFields) {
		this.systemPrivacyFields = systemPrivacyFields;
	}

	public List<UserDefinePrivacyPolicyField> getUserDefinePrivacyFields() {
		return this.userDefinePrivacyFields;
	}
	public void setUserDefinePrivacyFields(List<UserDefinePrivacyPolicyField> userDefinePrivacyFields) {
		this.userDefinePrivacyFields = userDefinePrivacyFields;
	}

}
