package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部商业平台合作-查询可贷款方案
 *
 * @author auto create
 * @since 1.0, 2023-03-24 11:11:00
 */
public class MybankCreditLoantradeLoanschemeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2313193153821853372L;

	/**
	 * OpenId是某个用户在某个应用下的唯一用户标识， 对于同一个用户，不同应用拿到的OpenId是不同的，而且对于同一个应用，不同用户的OpenId是唯一的
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

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
	 * 外部产品码，外部机构与网商合作的方案产品码，用于标识所属的合作业务，pd_code为空是必传。
	 */
	@ApiField("out_uni_code")
	private String outUniCode;

	/**
	 * 金融云产品码
	 */
	@ApiField("sale_pd_code")
	private String salePdCode;

	/**
	 * 基于哪个场景查询授信方案(FIXED_CREDIT:固化授信；PROD：产品；APPLY：申请；BL:保理；TYZBL：通用自保理；DYNAMIC：动态授信；CREDIT_LIST_FILTER：列表过滤授信方案)
	 */
	@ApiField("scen")
	private String scen;

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

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

	public String getOutUniCode() {
		return this.outUniCode;
	}
	public void setOutUniCode(String outUniCode) {
		this.outUniCode = outUniCode;
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
