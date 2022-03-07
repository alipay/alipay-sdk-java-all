package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户品牌配置模型
 *
 * @author auto create
 * @since 1.0, 2020-09-15 15:06:07
 */
public class MerchantBaseEnterOpenModel extends AlipayObject {

	private static final long serialVersionUID = 7561636331937196399L;

	/**
	 * 商户logo文件流信息，该字段为文件流经base64编码后得到的字符串。
	 */
	@ApiField("logo_info")
	private String logoInfo;

	/**
	 * 商户品牌全称。
	 */
	@ApiField("m_name")
	private String mName;

	/**
	 * 商户品牌简称，只能由大写字母、下划线、数字组成，且必须以大写字母开头。
	 */
	@ApiField("m_short_name")
	private String mShortName;

	public String getLogoInfo() {
		return this.logoInfo;
	}
	public void setLogoInfo(String logoInfo) {
		this.logoInfo = logoInfo;
	}

	public String getmName() {
		return this.mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmShortName() {
		return this.mShortName;
	}
	public void setmShortName(String mShortName) {
		this.mShortName = mShortName;
	}

}
