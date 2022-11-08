package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询企业付账单详情
 *
 * @author auto create
 * @since 1.0, 2022-08-19 19:37:49
 */
public class AlipayCommerceEcConsumeDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8642898599778272678L;

	/**
	 * 共同账户ID，有企业ID可不传
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权签约协议号，有企业ID可不传
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 企业ID，推荐查询方式
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 支付宝账单号
	 */
	@ApiField("pay_no")
	private String payNo;

	/**
	 * 查询选项，只针对消费账单生效
查询关联退款账单：Refund
查询关联订单：Order
查询关联票据：Ticket
查询关联多媒体凭证：Multimedia
	 */
	@ApiListField("query_options")
	@ApiField("string")
	private List<String> queryOptions;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getPayNo() {
		return this.payNo;
	}
	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}

	public List<String> getQueryOptions() {
		return this.queryOptions;
	}
	public void setQueryOptions(List<String> queryOptions) {
		this.queryOptions = queryOptions;
	}

}
