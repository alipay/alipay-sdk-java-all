package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户身份的额外信息
 *
 * @author auto create
 * @since 1.0, 2020-12-30 16:45:13
 */
public class UserIdentityExt extends AlipayObject {

	private static final long serialVersionUID = 2158295841482517352L;

	/**
	 * 用户交易账号的发卡机构id
	 */
	@ApiField("account_issue_entity_id")
	private String accountIssueEntityId;

	/**
	 * 用户交易账号的发卡机构名称
	 */
	@ApiField("account_issue_entity_name")
	private String accountIssueEntityName;

	/**
	 * 用户在支付机构的开户名称
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 用户在支付机构的账号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 扩展参数。JSON格式，使用前需要和支付宝先约定key值。
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * isv传给机构（如银行）的唯一uuid，可能是手机号，也可能是身份证号（盒马对接isv一网通）
	 */
	@ApiField("inst_uuid")
	private String instUuid;

	/**
	 * inst_uuid的类型，可能是手机号，也可能是身份证等
	 */
	@ApiField("inst_uuid_type")
	private String instUuidType;

	/**
	 * 用户在商家平台的会员id
	 */
	@ApiField("member_id")
	private String memberId;

	/**
	 * 用户在商家平台的会员名称
	 */
	@ApiField("member_name")
	private String memberName;

	public String getAccountIssueEntityId() {
		return this.accountIssueEntityId;
	}
	public void setAccountIssueEntityId(String accountIssueEntityId) {
		this.accountIssueEntityId = accountIssueEntityId;
	}

	public String getAccountIssueEntityName() {
		return this.accountIssueEntityName;
	}
	public void setAccountIssueEntityName(String accountIssueEntityName) {
		this.accountIssueEntityName = accountIssueEntityName;
	}

	public String getAccountName() {
		return this.accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getInstUuid() {
		return this.instUuid;
	}
	public void setInstUuid(String instUuid) {
		this.instUuid = instUuid;
	}

	public String getInstUuidType() {
		return this.instUuidType;
	}
	public void setInstUuidType(String instUuidType) {
		this.instUuidType = instUuidType;
	}

	public String getMemberId() {
		return this.memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return this.memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

}
