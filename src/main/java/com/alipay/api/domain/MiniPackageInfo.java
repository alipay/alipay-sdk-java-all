package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序功能包模型
 *
 * @author auto create
 * @since 1.0, 2018-12-25 18:05:38
 */
public class MiniPackageInfo extends AlipayObject {

	private static final long serialVersionUID = 6588837524783967531L;

	/**
	 * 功能包文档地址
	 */
	@ApiField("doc_url")
	private String docUrl;

	/**
	 * 功能包描述
	 */
	@ApiField("package_desc")
	private String packageDesc;

	/**
	 * 功能包名称
	 */
	@ApiField("package_name")
	private String packageName;

	/**
	 * 功能包开通方式，"APPLY", "申请开通"；"ORDER", "签约开通"；"DEFAULT", "默认开通"
	 */
	@ApiField("package_open_type")
	private String packageOpenType;

	/**
	 * 功能包签约状态，"valid", "已生效"；"audit", "签约中"；"invalid", "已失效"；"none", "未签约"
	 */
	@ApiField("status")
	private String status;

	public String getDocUrl() {
		return this.docUrl;
	}
	public void setDocUrl(String docUrl) {
		this.docUrl = docUrl;
	}

	public String getPackageDesc() {
		return this.packageDesc;
	}
	public void setPackageDesc(String packageDesc) {
		this.packageDesc = packageDesc;
	}

	public String getPackageName() {
		return this.packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getPackageOpenType() {
		return this.packageOpenType;
	}
	public void setPackageOpenType(String packageOpenType) {
		this.packageOpenType = packageOpenType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
