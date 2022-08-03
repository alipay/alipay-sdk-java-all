package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 参与者实体。目前的场景就是贷款各阶段的请求可能会关联一个or多个“人or企业or其他”，这个结构用于描述参与贷款的关联到的实体。比方说一个人来申请贷款，评估的时候会关联他拥有的企业、他的配偶、他的父母等。
 *
 * @author auto create
 * @since 1.0, 2017-08-07 13:55:00
 */
public class InvolvedEntity extends AlipayObject {

	private static final long serialVersionUID = 1729899214946492224L;

	/**
	 * 实体身份编码-个人是身份证号码、企业是工商注册号、会员是会员编号-具体的数字编号
	 */
	@ApiField("code")
	private String code;

	/**
	 * 实体编码的类型。例如若实体为个人，编码可能为身份证，则code_type为“RESIDENT”；可能为户口簿，则code_type为“HOUSEHOLD”；若实体为ALIPAY，编码可能为支付宝ID,则code_type为“USER_ID”
	 */
	@ApiField("code_type")
	private String codeType;

	/**
	 * 实体的标识-个人是姓名、企业是公司名称等，会员是会员名称，如支付宝的手机号或者邮箱号
	 */
	@ApiField("name")
	private String name;

	/**
	 * 对象的类型。
类型说明：值
个人:PERSON
企业:COMPANY
	 */
	@ApiField("type")
	private String type;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getCodeType() {
		return this.codeType;
	}
	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
