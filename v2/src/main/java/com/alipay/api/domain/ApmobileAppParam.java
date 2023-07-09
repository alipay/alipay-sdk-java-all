package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * app检测参数
 *
 * @author auto create
 * @since 1.0, 2023-06-27 13:52:11
 */
public class ApmobileAppParam extends AlipayObject {

	private static final long serialVersionUID = 6817361573927182511L;

	/**
	 * 文件唯一id
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 隐私政策文本
	 */
	@ApiField("privacy_policy_content")
	private String privacyPolicyContent;

	/**
	 * 隐私政策url
	 */
	@ApiField("privacy_policy_url")
	private String privacyPolicyUrl;

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getPrivacyPolicyContent() {
		return this.privacyPolicyContent;
	}
	public void setPrivacyPolicyContent(String privacyPolicyContent) {
		this.privacyPolicyContent = privacyPolicyContent;
	}

	public String getPrivacyPolicyUrl() {
		return this.privacyPolicyUrl;
	}
	public void setPrivacyPolicyUrl(String privacyPolicyUrl) {
		this.privacyPolicyUrl = privacyPolicyUrl;
	}

}
