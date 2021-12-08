package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 场景金融代收付申请
 *
 * @author auto create
 * @since 1.0, 2019-05-15 14:07:26
 */
public class MybankCreditSceneprodPaymentApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3852769675495157498L;

	/**
	 * 业务金额，单位分
	 */
	@ApiField("amount")
	private String amount;

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
	 * 客户姓名
	 */
	@ApiField("cust_name")
	private String custName;

	/**
	 * 支用号
	 */
	@ApiField("drawdown_no")
	private String drawdownNo;

	/**
	 * 客户的身份证号，尾数是X的请使用大写字母
	 */
	@ApiField("id_card")
	private String idCard;

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
	 * 扩展参数，JSON格式，100个字符以内，在代收请求时需要附带期数信息在扩展参数中，代付的场景下是没有的,具体参数：tenor:期次,
	 */
	@ApiField("out_param")
	private String outParam;

	/**
	 * 外部请求流水号,32个字符以内、只能包含字母、数字、下划线；需保证在外部平台端不重复
	 */
	@ApiField("out_seq_no")
	private String outSeqNo;

	/**
	 * 收款人信息
	 */
	@ApiListField("payee_account_list")
	@ApiField("scene_prod_payment_account_info")
	private List<SceneProdPaymentAccountInfo> payeeAccountList;

	/**
	 * 付款人信息
	 */
	@ApiListField("payer_account_list")
	@ApiField("scene_prod_payment_account_info")
	private List<SceneProdPaymentAccountInfo> payerAccountList;

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

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
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

	public String getCustName() {
		return this.custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getDrawdownNo() {
		return this.drawdownNo;
	}
	public void setDrawdownNo(String drawdownNo) {
		this.drawdownNo = drawdownNo;
	}

	public String getIdCard() {
		return this.idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
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

	public List<SceneProdPaymentAccountInfo> getPayeeAccountList() {
		return this.payeeAccountList;
	}
	public void setPayeeAccountList(List<SceneProdPaymentAccountInfo> payeeAccountList) {
		this.payeeAccountList = payeeAccountList;
	}

	public List<SceneProdPaymentAccountInfo> getPayerAccountList() {
		return this.payerAccountList;
	}
	public void setPayerAccountList(List<SceneProdPaymentAccountInfo> payerAccountList) {
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
