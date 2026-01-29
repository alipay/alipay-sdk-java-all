package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金专户转账
 *
 * @author auto create
 * @since 1.0, 2024-08-16 19:31:18
 */
public class AlipayCommerceEcTransAccountTransferModel extends AlipayObject {

	private static final long serialVersionUID = 5357793235475953449L;

	/**
	 * 付款资金专户号
	 */
	@ApiField("account_book_id")
	private String accountBookId;

	/**
	 * 转账总金额，单位为元，精确到小数点后两位
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 转账扩展信息，信息会在账单中透出，key支持paymentId:付款事由ruleGroupId:费控规则IDemployeeId:员工ID
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 转账业务的标题，用于在支付宝用户的账单里显示
	 */
	@ApiField("order_title")
	private String orderTitle;

	/**
	 * 商家侧唯一订单号，由商家自定义。对于不同转账请求，商家需保证该订单号在自身系统唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 收款方信息
	 */
	@ApiField("payee_info")
	private TransParticipant payeeInfo;

	/**
	 * 在单笔金额超过 50000 的时候必传；
	 */
	@ApiField("remark")
	private String remark;

	public String getAccountBookId() {
		return this.accountBookId;
	}
	public void setAccountBookId(String accountBookId) {
		this.accountBookId = accountBookId;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getOrderTitle() {
		return this.orderTitle;
	}
	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public TransParticipant getPayeeInfo() {
		return this.payeeInfo;
	}
	public void setPayeeInfo(TransParticipant payeeInfo) {
		this.payeeInfo = payeeInfo;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
