package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 收益分配规则创建
 *
 * @author auto create
 * @since 1.0, 2023-06-29 16:45:27
 */
public class AnttechBlockchainFinanceDistributionRuleCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1755664533267421846L;

	/**
	 * 收益分配产品码, 请咨询业务同学获取
	 */
	@ApiField("distribution_pro_no")
	private String distributionProNo;

	/**
	 * 请求流水, 流水不变重复请求幂等，相同流水的规则参数不能变更。
	 */
	@ApiField("request_no")
	private String requestNo;

	/**
	 * 收益分配转入方信息，可传多个
	 */
	@ApiListField("trans_in_info")
	@ApiField("income_distribution_trans_in_info")
	private List<IncomeDistributionTransInInfo> transInInfo;

	/**
	 * 收益分配分出方账号，证件、账户、户名需一致
	 */
	@ApiField("trans_out_account_no")
	private String transOutAccountNo;

	/**
	 * 分出方账户类型
目前只支持 01-子户/子钱包
	 */
	@ApiField("trans_out_account_type")
	private String transOutAccountType;

	/**
	 * 分出方证件号，证件、账户、户名需一致
	 */
	@ApiField("trans_out_cert_no")
	private String transOutCertNo;

	/**
	 * 分出方证件类型：
01 - 统一社会信用代码
02 - 身份证
	 */
	@ApiField("trans_out_cert_type")
	private String transOutCertType;

	/**
	 * 收益分配分出方的名称，证件、账户、名称需一致
	 */
	@ApiField("trans_out_name")
	private String transOutName;

	public String getDistributionProNo() {
		return this.distributionProNo;
	}
	public void setDistributionProNo(String distributionProNo) {
		this.distributionProNo = distributionProNo;
	}

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public List<IncomeDistributionTransInInfo> getTransInInfo() {
		return this.transInInfo;
	}
	public void setTransInInfo(List<IncomeDistributionTransInInfo> transInInfo) {
		this.transInInfo = transInInfo;
	}

	public String getTransOutAccountNo() {
		return this.transOutAccountNo;
	}
	public void setTransOutAccountNo(String transOutAccountNo) {
		this.transOutAccountNo = transOutAccountNo;
	}

	public String getTransOutAccountType() {
		return this.transOutAccountType;
	}
	public void setTransOutAccountType(String transOutAccountType) {
		this.transOutAccountType = transOutAccountType;
	}

	public String getTransOutCertNo() {
		return this.transOutCertNo;
	}
	public void setTransOutCertNo(String transOutCertNo) {
		this.transOutCertNo = transOutCertNo;
	}

	public String getTransOutCertType() {
		return this.transOutCertType;
	}
	public void setTransOutCertType(String transOutCertType) {
		this.transOutCertType = transOutCertType;
	}

	public String getTransOutName() {
		return this.transOutName;
	}
	public void setTransOutName(String transOutName) {
		this.transOutName = transOutName;
	}

}
