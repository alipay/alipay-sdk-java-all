package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 入职体检的待初始化候选人信息
 *
 * @author auto create
 * @since 1.0, 2024-03-19 16:44:24
 */
public class EntryHealthPersonInfo extends AlipayObject {

	private static final long serialVersionUID = 8125548819666382179L;

	/**
	 * 参数代表候选人的表单号，根据数据库id加盐生成，字符串类型，供应商拿到该单号之后需要为该单号初始化信息用于登陆供应商系统，该字段不会为空
	 */
	@ApiField("form_no")
	private String formNo;

	/**
	 * 该参数用于确认候选人人员类型，根据候选人层级来确定是普通员工还是高管，根据层级来决定，字符串类型，供应商拿到该数据后会根据候选人的类型不同做不同的初始化，为高管提供VIP服务
	 */
	@ApiField("user_type")
	private String userType;

	public String getFormNo() {
		return this.formNo;
	}
	public void setFormNo(String formNo) {
		this.formNo = formNo;
	}

	public String getUserType() {
		return this.userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

}
