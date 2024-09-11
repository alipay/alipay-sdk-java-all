package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 财资子户申请结果查询
 *
 * @author auto create
 * @since 1.0, 2023-12-06 15:17:45
 */
public class SubAccountQueryResult extends AlipayObject {

	private static final long serialVersionUID = 2471169366123294744L;

	/**
	 * 我方银行财资主户
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 支付宝虚拟账号，也称2088账号
	 */
	@ApiField("alipay_virtual_id")
	private String alipayVirtualId;

	/**
	 * 全球化语言银行缩写，如：CMB
	 */
	@ApiField("out_fin_inst_abbreviation")
	private String outFinInstAbbreviation;

	/**
	 * 来源uid信息
	 */
	@ApiField("source_uid")
	private String sourceUid;

	/**
	 * INIT("INIT","账户初始化"),
 APPLYING("APPLYING","账户申请中"),
 ENABLE("ENABLE", "正常")
 FROZEN("FROZEN", "冻结")
 CLOSE("CLOSE", "销户")
	 */
	@ApiField("status")
	private String status;

	/**
	 * 子户账号
	 */
	@ApiField("sub_account_no")
	private String subAccountNo;

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAlipayVirtualId() {
		return this.alipayVirtualId;
	}
	public void setAlipayVirtualId(String alipayVirtualId) {
		this.alipayVirtualId = alipayVirtualId;
	}

	public String getOutFinInstAbbreviation() {
		return this.outFinInstAbbreviation;
	}
	public void setOutFinInstAbbreviation(String outFinInstAbbreviation) {
		this.outFinInstAbbreviation = outFinInstAbbreviation;
	}

	public String getSourceUid() {
		return this.sourceUid;
	}
	public void setSourceUid(String sourceUid) {
		this.sourceUid = sourceUid;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubAccountNo() {
		return this.subAccountNo;
	}
	public void setSubAccountNo(String subAccountNo) {
		this.subAccountNo = subAccountNo;
	}

}
