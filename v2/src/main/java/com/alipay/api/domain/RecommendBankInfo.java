package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推荐银行信息结构体
 *
 * @author auto create
 * @since 1.0, 2021-01-07 19:51:57
 */
public class RecommendBankInfo extends AlipayObject {

	private static final long serialVersionUID = 5182879365754838914L;

	/**
	 * 银行跳转的安卓的包名
	 */
	@ApiField("android_package_name")
	private String androidPackageName;

	/**
	 * 银行跳转的安卓schema
	 */
	@ApiField("android_schema")
	private String androidSchema;

	/**
	 * 银行编号
	 */
	@ApiField("bank_code")
	private String bankCode;

	/**
	 * 银行渠道图标地址
	 */
	@ApiField("bank_icon_url")
	private String bankIconUrl;

	/**
	 * 银行名称
	 */
	@ApiField("bank_name")
	private String bankName;

	/**
	 * 银行渠道是否可用
	 */
	@ApiField("enable")
	private Boolean enable;

	/**
	 * 银行跳转的iosschema
	 */
	@ApiField("ios_schema")
	private String iosSchema;

	/**
	 * 银行渠道备注说明
	 */
	@ApiField("memo")
	private String memo;

	public String getAndroidPackageName() {
		return this.androidPackageName;
	}
	public void setAndroidPackageName(String androidPackageName) {
		this.androidPackageName = androidPackageName;
	}

	public String getAndroidSchema() {
		return this.androidSchema;
	}
	public void setAndroidSchema(String androidSchema) {
		this.androidSchema = androidSchema;
	}

	public String getBankCode() {
		return this.bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankIconUrl() {
		return this.bankIconUrl;
	}
	public void setBankIconUrl(String bankIconUrl) {
		this.bankIconUrl = bankIconUrl;
	}

	public String getBankName() {
		return this.bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public Boolean getEnable() {
		return this.enable;
	}
	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

	public String getIosSchema() {
		return this.iosSchema;
	}
	public void setIosSchema(String iosSchema) {
		this.iosSchema = iosSchema;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

}
