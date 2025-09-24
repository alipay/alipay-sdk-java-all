package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 登记证文件信息
 *
 * @author auto create
 * @since 1.0, 2025-09-18 15:56:07
 */
public class RegistrationCertificateFileInfo extends AlipayObject {

	private static final long serialVersionUID = 2177593272628438955L;

	/**
	 * 文件路径
	 */
	@ApiField("file_path")
	private String filePath;

	/**
	 * 文件标签
VC_1_2:机动车登记证1-2页
VC_3_4:机动车登记证3-4页
VC_5_6:机动车登记证5-6页
VC_7_8:机动车登记证7-8页
VC_9_10:机动车登记证9-10页
VC_11_12:机动车登记证11-12页
	 */
	@ApiField("tag")
	private String tag;

	public String getFilePath() {
		return this.filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getTag() {
		return this.tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}

}
