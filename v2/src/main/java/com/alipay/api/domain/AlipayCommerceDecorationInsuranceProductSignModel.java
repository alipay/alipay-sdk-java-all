package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 开通家装保险产品接口
 *
 * @author auto create
 * @since 1.0, 2025-12-17 10:37:42
 */
public class AlipayCommerceDecorationInsuranceProductSignModel extends AlipayObject {

	private static final long serialVersionUID = 3775232185373656867L;

	/**
	 * 联系方式
	 */
	@ApiField("contact_info")
	private String contactInfo;

	/**
	 * 联系人名称
	 */
	@ApiField("contact_user")
	private String contactUser;

	/**
	 * 付款企业信用代码
	 */
	@ApiField("credit_code")
	private String creditCode;

	/**
	 * 付款企业名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 付款企业pid
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * null
	 */
	@ApiListField("product_type_list")
	@ApiField("string")
	private List<String> productTypeList;

	public String getContactInfo() {
		return this.contactInfo;
	}
	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}

	public String getContactUser() {
		return this.contactUser;
	}
	public void setContactUser(String contactUser) {
		this.contactUser = contactUser;
	}

	public String getCreditCode() {
		return this.creditCode;
	}
	public void setCreditCode(String creditCode) {
		this.creditCode = creditCode;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public List<String> getProductTypeList() {
		return this.productTypeList;
	}
	public void setProductTypeList(List<String> productTypeList) {
		this.productTypeList = productTypeList;
	}

}
