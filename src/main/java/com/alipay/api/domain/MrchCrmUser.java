package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商家CRM用户
 *
 * @author auto create
 * @since 1.0, 2022-10-15 11:00:49
 */
public class MrchCrmUser extends AlipayObject {

	private static final long serialVersionUID = 5827782188262594923L;

	/**
	 * 用户身份信息密文，加密方式如下：
当encrypt_identity_type = 'mobile'时 encrypt_identity_id = sha256(手机号码);
当encrypt_identity_type = 'email'时 encrypt_identity_id = sha256(邮箱)
	 */
	@ApiField("encrypt_identity_id")
	private String encryptIdentityId;

	/**
	 * 用户身份信息类型-手机号、邮箱，枚举如下：
mobile-手机号码，email-邮箱
	 */
	@ApiField("encrypt_identity_type")
	private String encryptIdentityType;

	/**
	 * 用户标签信息
	 */
	@ApiListField("tag_list")
	@ApiField("mrch_crm_user_tag_info")
	private List<MrchCrmUserTagInfo> tagList;

	public String getEncryptIdentityId() {
		return this.encryptIdentityId;
	}
	public void setEncryptIdentityId(String encryptIdentityId) {
		this.encryptIdentityId = encryptIdentityId;
	}

	public String getEncryptIdentityType() {
		return this.encryptIdentityType;
	}
	public void setEncryptIdentityType(String encryptIdentityType) {
		this.encryptIdentityType = encryptIdentityType;
	}

	public List<MrchCrmUserTagInfo> getTagList() {
		return this.tagList;
	}
	public void setTagList(List<MrchCrmUserTagInfo> tagList) {
		this.tagList = tagList;
	}

}
