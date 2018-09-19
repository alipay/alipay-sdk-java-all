package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 联系人信息
 *
 * @author auto create
 * @since 1.0, 2018-06-05 19:28:19
 */
public class ContactInfo extends AlipayObject {

	private static final long serialVersionUID = 1444127152427195226L;

	/**
	 * 电子邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 身份证号
	 */
	@ApiField("id_card_no")
	private String idCardNo;

	/**
	 * 手机号。必填与否参见外层对象描述，无特别说明认为是非必填
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 联系人名字
	 */
	@ApiField("name")
	private String name;

	/**
	 * 电话
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 商户联系人业务标识枚举，表示商户联系人的职责。异议处理接口人:02;商户关键联系人:06;数据反馈接口人:11;服务联动接口人:08
	 */
	@ApiListField("tag")
	@ApiField("string")
	private List<String> tag;

	/**
	 * 联系人类型，取值范围：LEGAL_PERSON：法人；CONTROLLER：实际控制人；AGENT：代理人；OTHER：其他
	 */
	@ApiField("type")
	private String type;

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdCardNo() {
		return this.idCardNo;
	}
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<String> getTag() {
		return this.tag;
	}
	public void setTag(List<String> tag) {
		this.tag = tag;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
