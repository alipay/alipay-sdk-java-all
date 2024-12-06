package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部商业平台合作-查询贷款合约
 *
 * @author auto create
 * @since 1.0, 2023-08-10 10:22:09
 */
public class MybankCreditLoantradeLoanarrangementQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8727321819248585446L;

	/**
	 * 网商银行参与者会员角色ID。客户在网商融资平台页面发起贷款申请或者机构调用代客户申贷接口mybank.credit.loanapply.apply.create后，网商会把申请结果以消息的方式通知机构，该字段包含在返回的消息体中。
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 合约编号，客户签署合约时获取。
	 */
	@ApiField("loan_ar_no")
	private String loanArNo;

	/**
	 * 为满足网商银行数据跨域输出的合规要求，β计划中预付融资、赊呗、采购贷、池融资、网商贷等产品相关场景进行合规确权改造，确权方案中需在业务接口入参中加入auth_scene_code（授权场景码）和auth_token（授权令牌，用于鉴权）两个字段供调用方传入字段值
	 */
	@ApiField("mybk_auth_scene_code")
	private String mybkAuthSceneCode;

	/**
	 * 为满足网商银行数据跨域输出的合规要求，β计划中预付融资、赊呗、采购贷、池融资、网商贷等产品相关场景进行合规确权改造，确权方案中需在业务接口入参中加入auth_scene_code（授权场景码）和auth_token（授权令牌，用于鉴权）两个字段供调用方传入字段值
	 */
	@ApiField("mybk_auth_token")
	private String mybkAuthToken;

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getLoanArNo() {
		return this.loanArNo;
	}
	public void setLoanArNo(String loanArNo) {
		this.loanArNo = loanArNo;
	}

	public String getMybkAuthSceneCode() {
		return this.mybkAuthSceneCode;
	}
	public void setMybkAuthSceneCode(String mybkAuthSceneCode) {
		this.mybkAuthSceneCode = mybkAuthSceneCode;
	}

	public String getMybkAuthToken() {
		return this.mybkAuthToken;
	}
	public void setMybkAuthToken(String mybkAuthToken) {
		this.mybkAuthToken = mybkAuthToken;
	}

}
