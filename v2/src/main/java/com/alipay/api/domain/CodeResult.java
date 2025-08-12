package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * S码申请成功的结果
 *
 * @author auto create
 * @since 1.0, 2019-09-18 11:17:08
 */
public class CodeResult extends AlipayObject {

	private static final long serialVersionUID = 4562366875724983791L;

	/**
	 * code，唯一，码值
	 */
	@ApiField("code")
	private String code;

	/**
	 * code_token，唯一，码值中的token
	 */
	@ApiField("code_token")
	private String codeToken;

	/**
	 * code_url，生成的二维码图片url。这个url可通过参数控制图片样式，pigSize：256，512，1546px；添加&d参数，直接下载，默认是302到OSS预览；trans，默认true，底色透明，false底色为白。chrome建议添加trans=false参数。
	 */
	@ApiField("code_url")
	private String codeUrl;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getCodeToken() {
		return this.codeToken;
	}
	public void setCodeToken(String codeToken) {
		this.codeToken = codeToken;
	}

	public String getCodeUrl() {
		return this.codeUrl;
	}
	public void setCodeUrl(String codeUrl) {
		this.codeUrl = codeUrl;
	}

}
