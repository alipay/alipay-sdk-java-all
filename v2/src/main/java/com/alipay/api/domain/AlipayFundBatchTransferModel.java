package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量代发统一接口
 *
 * @author auto create
 * @since 1.0, 2019-11-18 15:56:50
 */
public class AlipayFundBatchTransferModel extends AlipayObject {

	private static final long serialVersionUID = 3148814117746196954L;

	/**
	 * 代发到账户明细列。biz_code=BATCH_TRANS_ACC时，该参数必填。biz_code为其他值时忽略该参数。
	 */
	@ApiListField("acc_detail_list")
	@ApiField("acc_trans_detail")
	private List<AccTransDetail> accDetailList;

	/**
	 * test
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 付款方账单地址，用于反洗钱，biz_scene=GLOBAL时必填。格式: 两位国家编码,账单地址.  账单地址至少提供到市. 账单地址中只能包含如下字符: a-zA-Z0-9()/-?:.'+, 和空格。
	 */
	@ApiField("billing_address")
	private String billingAddress;

	/**
	 * 批量代发业务标识。

    批量代发到账户：BATCH_TRANS_ACC
    批量代发到银行卡：BATCH_TRANS_BC
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 批量代发业务场景。

GLOBAL: 全球代发. 除CNY的多币种代发或人民币跨境代发。
LOCAL：中国境内纯人民币代发。
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 扩展参数。使用前需要和支付宝先约定key值。
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 跨境批量代发场景下，描述批量代发请求，是否针对付汇失败场景下商户所做的重试。
T: 代表重试请求，对应的代发文件明细中alipay_order_no不能为空；
F: 代表非重试请求，对应的代发文件明细中alipay_order_no必须为空。
  biz_scene=LOCAL时忽略该参数。
	 */
	@ApiField("pay_retry")
	private String payRetry;

	/**
	 * 付款方账号，来账场景中填写VA账号。
	 */
	@ApiField("payer_account")
	private String payerAccount;

	/**
	 * 付款方账号类型.与payer_account配合使用, 如果payer_account是VA账号, 则填写VA.
	 */
	@ApiField("payer_account_type")
	private String payerAccountType;

	/**
	 * 商户支付给支付宝的币种。
   biz_scene=GLOBAL时必填;
   biz_scene=LOCAL时忽略该参数。
	 */
	@ApiField("payment_currency")
	private String paymentCurrency;

	/**
	 * 批量代发产品签约产品码。
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 对客资金交割时效。
   biz_scene=GLOBAL时, 如果未填写以合约为准。 
   biz_scene=LOCAL时, 忽略该参数。
	 */
	@ApiField("request_value_time")
	private String requestValueTime;

	/**
	 * 签约主体，即签约了批量代发产品的支付宝账号。
	 */
	@ApiField("sign_principal")
	private String signPrincipal;

	/**
	 * 本次代发明细总数据. 正整数，最小1笔，最大支持1000笔，该字段值会和明细总数做比对校验。
	 */
	@ApiField("total_count")
	private String totalCount;

	/**
	 * 总转账金额。
	biz_scene=LOCAL时，该参数必传。
	biz_scene=GLOBAL时，如果明细列中trans_currency只存在一种币种，且值等于payment_currency时，该参数必传，并且total_trans_amount等于明细列中trans_amount累加总和。其他场景下，忽略该参数。
	 */
	@ApiField("total_trans_amount")
	private String totalTransAmount;

	/**
	 * 转账币种三位英文短码, 用于修饰total_trans_amount.
  biz_scene=LOCAL时，该参数选传, 如果传入必须为CNY。
  biz_scene=GLOBAL时，如果明细列中trans_currency只存在一种币种，且值等于payment_currency时，该参数必传，与trans_currency相同。其他场景下，忽略该参数。
	 */
	@ApiField("total_trans_currency")
	private String totalTransCurrency;

	public List<AccTransDetail> getAccDetailList() {
		return this.accDetailList;
	}
	public void setAccDetailList(List<AccTransDetail> accDetailList) {
		this.accDetailList = accDetailList;
	}

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getBillingAddress() {
		return this.billingAddress;
	}
	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	public String getPayRetry() {
		return this.payRetry;
	}
	public void setPayRetry(String payRetry) {
		this.payRetry = payRetry;
	}

	public String getPayerAccount() {
		return this.payerAccount;
	}
	public void setPayerAccount(String payerAccount) {
		this.payerAccount = payerAccount;
	}

	public String getPayerAccountType() {
		return this.payerAccountType;
	}
	public void setPayerAccountType(String payerAccountType) {
		this.payerAccountType = payerAccountType;
	}

	public String getPaymentCurrency() {
		return this.paymentCurrency;
	}
	public void setPaymentCurrency(String paymentCurrency) {
		this.paymentCurrency = paymentCurrency;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRequestValueTime() {
		return this.requestValueTime;
	}
	public void setRequestValueTime(String requestValueTime) {
		this.requestValueTime = requestValueTime;
	}

	public String getSignPrincipal() {
		return this.signPrincipal;
	}
	public void setSignPrincipal(String signPrincipal) {
		this.signPrincipal = signPrincipal;
	}

	public String getTotalCount() {
		return this.totalCount;
	}
	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public String getTotalTransAmount() {
		return this.totalTransAmount;
	}
	public void setTotalTransAmount(String totalTransAmount) {
		this.totalTransAmount = totalTransAmount;
	}

	public String getTotalTransCurrency() {
		return this.totalTransCurrency;
	}
	public void setTotalTransCurrency(String totalTransCurrency) {
		this.totalTransCurrency = totalTransCurrency;
	}

}
