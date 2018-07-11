package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部商业平台合作-查询可贷款方案
 *
 * @author auto create
 * @since 1.0, 2018-06-13 11:17:26
 */
public class MybankCreditLoantradeLoanschemeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5621283584468277724L;

	/**
	 * 授信编号
	 */
	@ApiField("biz")
	private String biz;

	/**
	 * 业务编号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 客户身份编码-个人是身份证号码、企业是工商注册号、会员是会员编号-具体的数字编号
	 */
	@ApiField("entity_code")
	private String entityCode;

	/**
	 * 客户身份标识-个人是姓名、企业是公司名称、会员是会员名称，如支付宝的手机号或者邮箱号
	 */
	@ApiField("entity_name")
	private String entityName;

	/**
	 * 客户身份类型-个人是PERSON、企业是COMPAY、会员是具体的站点如ALIPAY或者MYBANK
	 */
	@ApiField("entity_type")
	private String entityType;

	/**
	 * 微贷政策码
	 */
	@ApiField("loan_policy_code")
	private String loanPolicyCode;

	/**
	 * 金融云产品码
	 */
	@ApiField("sale_pd_code")
	private String salePdCode;

	/**
	 * 基于哪个场景查询授信方案(FIXED_CREDIT:固化授信；PROD：产品；APPLY：申请；BL:保理；TYZBL：通用自保理；DYNAMIC：动态授信)
	 */
	@ApiField("scen")
	private String scen;

	public String getBiz() {
		return this.biz;
	}
	public void setBiz(String biz) {
		this.biz = biz;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getEntityCode() {
		return this.entityCode;
	}
	public void setEntityCode(String entityCode) {
		this.entityCode = entityCode;
	}

	public String getEntityName() {
		return this.entityName;
	}
	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public String getEntityType() {
		return this.entityType;
	}
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getLoanPolicyCode() {
		return this.loanPolicyCode;
	}
	public void setLoanPolicyCode(String loanPolicyCode) {
		this.loanPolicyCode = loanPolicyCode;
	}

	public String getSalePdCode() {
		return this.salePdCode;
	}
	public void setSalePdCode(String salePdCode) {
		this.salePdCode = salePdCode;
	}

	public String getScen() {
		return this.scen;
	}
	public void setScen(String scen) {
		this.scen = scen;
	}

}
