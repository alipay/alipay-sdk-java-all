package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 代收付-申请接口
 *
 * @author auto create
 * @since 1.0, 2017-08-25 10:18:52
 */
public class MybankCreditLoantradePartnerPaymentApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2737587295824735394L;

	/**
	 * 业务金额，单位分
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 业务产品编码，64个字符以内
	 */
	@ApiField("biz_product_code")
	private String bizProductCode;

	/**
	 * 业务类型，目前只支持两种：REPAY（还款）,ENCASH（放款）
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 客户支付宝账户，与UID字段不能同时为空
	 */
	@ApiField("login_account")
	private String loginAccount;

	/**
	 * 网商业务订单号,64个字符以内、只能包含字母、数字、下划线；需保证在外部网商端不重复
	 */
	@ApiField("mybk_order_no")
	private String mybkOrderNo;

	/**
	 * 外部平台订单号,64个字符以内、只能包含字母、数字、下划线；需保证在外部平台端不重复
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 扩展参数，JSON格式，100个字符以内，在代收请求时需要附带期数信息在扩展参数中，代付的场景下是没有的,具体参数：tenor:期次
	 */
	@ApiField("out_param")
	private String outParam;

	/**
	 * 外部请求流水号,32个字符以内、只能包含字母、数字、下划线；需保证在外部平台端不重复
	 */
	@ApiField("out_seq_no")
	private String outSeqNo;

	/**
	 * 收款方列表
	 */
	@ApiListField("payee_account_list")
	@ApiField("payment_account_info")
	private List<PaymentAccountInfo> payeeAccountList;

	/**
	 * 付款方列表
	 */
	@ApiListField("payer_account_list")
	@ApiField("payment_account_info")
	private List<PaymentAccountInfo> payerAccountList;

	/**
	 * 代收付产品编码，64个字符以内
	 */
	@ApiField("payment_product_code")
	private String paymentProductCode;

	/**
	 * 客户支付宝账号数字ID，与支付宝账户字段不能同时为空
	 */
	@ApiField("user_id")
	private String userId;

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getBizProductCode() {
		return this.bizProductCode;
	}
	public void setBizProductCode(String bizProductCode) {
		this.bizProductCode = bizProductCode;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getLoginAccount() {
		return this.loginAccount;
	}
	public void setLoginAccount(String loginAccount) {
		this.loginAccount = loginAccount;
	}

	public String getMybkOrderNo() {
		return this.mybkOrderNo;
	}
	public void setMybkOrderNo(String mybkOrderNo) {
		this.mybkOrderNo = mybkOrderNo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getOutParam() {
		return this.outParam;
	}
	public void setOutParam(String outParam) {
		this.outParam = outParam;
	}

	public String getOutSeqNo() {
		return this.outSeqNo;
	}
	public void setOutSeqNo(String outSeqNo) {
		this.outSeqNo = outSeqNo;
	}

	public List<PaymentAccountInfo> getPayeeAccountList() {
		return this.payeeAccountList;
	}
	public void setPayeeAccountList(List<PaymentAccountInfo> payeeAccountList) {
		this.payeeAccountList = payeeAccountList;
	}

	public List<PaymentAccountInfo> getPayerAccountList() {
		return this.payerAccountList;
	}
	public void setPayerAccountList(List<PaymentAccountInfo> payerAccountList) {
		this.payerAccountList = payerAccountList;
	}

	public String getPaymentProductCode() {
		return this.paymentProductCode;
	}
	public void setPaymentProductCode(String paymentProductCode) {
		this.paymentProductCode = paymentProductCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
