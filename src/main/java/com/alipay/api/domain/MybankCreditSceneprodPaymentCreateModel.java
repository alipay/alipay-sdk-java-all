package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 场景金融代收付申请(新)
 *
 * @author auto create
 * @since 1.0, 2018-06-15 16:58:36
 */
public class MybankCreditSceneprodPaymentCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6522717644984384162L;

	/**
	 * 交易金额，单位分
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 业务产品编码，64个字符以内
	 */
	@ApiField("biz_product_code")
	private String bizProductCode;

	/**
	 * 扩展参数
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 通过mybank.credit.sceneprod.loan.apply接口返回的网商业务订单号, 64个字符以内、只能包含字母、数字、下划线；
	 */
	@ApiField("mybk_order_no")
	private String mybkOrderNo;

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
	 * 期数
	 */
	@ApiField("period_no")
	private String periodNo;

	/**
	 * 外部站点，比如：ALIPAY：支付宝站点，MYBANK：银行会员，B2B_CN：B2B中文站，B2B_EN：B2B国际站，TAOBAO：淘宝
	 */
	@ApiField("site")
	private String site;

	/**
	 * 外部站点的userid，与site的值有关，ALIPAY时为支付宝userid，MYBANK时是网商ipRoleId，PERSON时为身份证号
	 */
	@ApiField("site_user_id")
	private String siteUserId;

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

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

	public String getMybkOrderNo() {
		return this.mybkOrderNo;
	}
	public void setMybkOrderNo(String mybkOrderNo) {
		this.mybkOrderNo = mybkOrderNo;
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

	public String getPeriodNo() {
		return this.periodNo;
	}
	public void setPeriodNo(String periodNo) {
		this.periodNo = periodNo;
	}

	public String getSite() {
		return this.site;
	}
	public void setSite(String site) {
		this.site = site;
	}

	public String getSiteUserId() {
		return this.siteUserId;
	}
	public void setSiteUserId(String siteUserId) {
		this.siteUserId = siteUserId;
	}

}
