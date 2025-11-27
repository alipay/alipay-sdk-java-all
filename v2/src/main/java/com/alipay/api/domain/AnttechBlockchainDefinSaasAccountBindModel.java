package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 绑定银行账户
 *
 * @author auto create
 * @since 1.0, 2023-11-22 14:48:28
 */
public class AnttechBlockchainDefinSaasAccountBindModel extends AlipayObject {

	private static final long serialVersionUID = 2719128223984631135L;

	/**
	 * 户名
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 账号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 账户分类
	 */
	@ApiListField("category")
	@ApiField("string")
	private List<String> category;

	/**
	 * 银行代码
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 开户网点名称
	 */
	@ApiField("offical_name")
	private String officalName;

	/**
	 * 联行号
	 */
	@ApiField("offical_number")
	private String officalNumber;

	/**
	 * 外部业务平台会员ID
	 */
	@ApiField("out_member_id")
	private ReferenceId outMemberId;

	/**
	 * 会员所属业务平台在智能科技的会员ID
	 */
	@ApiField("platform_member_id")
	private String platformMemberId;

	/**
	 * 账号主体  I个人；E企业
	 */
	@ApiField("principal")
	private String principal;

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

	public List<String> getCategory() {
		return this.category;
	}
	public void setCategory(List<String> category) {
		this.category = category;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getOfficalName() {
		return this.officalName;
	}
	public void setOfficalName(String officalName) {
		this.officalName = officalName;
	}

	public String getOfficalNumber() {
		return this.officalNumber;
	}
	public void setOfficalNumber(String officalNumber) {
		this.officalNumber = officalNumber;
	}

	public ReferenceId getOutMemberId() {
		return this.outMemberId;
	}
	public void setOutMemberId(ReferenceId outMemberId) {
		this.outMemberId = outMemberId;
	}

	public String getPlatformMemberId() {
		return this.platformMemberId;
	}
	public void setPlatformMemberId(String platformMemberId) {
		this.platformMemberId = platformMemberId;
	}

	public String getPrincipal() {
		return this.principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}

}
