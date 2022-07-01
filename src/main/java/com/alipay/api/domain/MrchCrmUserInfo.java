package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商家用户
 *
 * @author auto create
 * @since 1.0, 2022-06-29 13:17:34
 */
public class MrchCrmUserInfo extends AlipayObject {

	private static final long serialVersionUID = 5745929575225252643L;

	/**
	 * 密文邮箱
<p>
加密方式：sha256(邮箱明文)
</p>
<p>
注意：encrypt_mobile 与encrypt_email不会同时为空,encrypt_mobile不为空时优先通过encrypt_mobile匹配；
</p>
	 */
	@ApiField("encrypt_email")
	private String encryptEmail;

	/**
	 * 密文手机号码
<p>
加密方式：sha256(手机号码明文)
</p>
<p>
注意：encrypt_mobile 与encrypt_email不会同时为空,encrypt_mobile不为空时优先通过encrypt_mobile匹配；
</p>
	 */
	@ApiField("encrypt_mobile")
	private String encryptMobile;

	/**
	 * 商家用户标签
	 */
	@ApiListField("tag_list")
	@ApiField("mrch_crm_user_tag_info")
	private List<MrchCrmUserTagInfo> tagList;

	public String getEncryptEmail() {
		return this.encryptEmail;
	}
	public void setEncryptEmail(String encryptEmail) {
		this.encryptEmail = encryptEmail;
	}

	public String getEncryptMobile() {
		return this.encryptMobile;
	}
	public void setEncryptMobile(String encryptMobile) {
		this.encryptMobile = encryptMobile;
	}

	public List<MrchCrmUserTagInfo> getTagList() {
		return this.tagList;
	}
	public void setTagList(List<MrchCrmUserTagInfo> tagList) {
		this.tagList = tagList;
	}

}
