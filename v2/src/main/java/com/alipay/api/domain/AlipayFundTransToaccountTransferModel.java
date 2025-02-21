package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单笔转账到支付宝账户接口
 *
 * @author auto create
 * @since 1.0, 2024-11-25 16:27:11
 */
public class AlipayFundTransToaccountTransferModel extends AlipayObject {

	private static final long serialVersionUID = 2881626134392522638L;

	/**
	 * 转账金额，单位：元。
只支持2位小数，小数点前最大支持13位，金额必须大于等于0.1元。 
最大转账金额以实际签约的限额为准。
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 扩展参数，json字符串格式，目前仅支持的key=order_title，表示收款方的转账账单标题，value可以根据自己的业务定制。
	 */
	@ApiField("ext_param")
	private String extParam;

	/**
	 * 商户转账唯一订单号。发起转账来源方定义的转账单据ID，用于将转账回执通知给来源方。
不同来源方给出的ID可以重复，同一个来源方必须保证其ID的唯一性。
只支持半角英文、数字，及“-”、“_”。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 收款方账户。与payee_type配合使用。付款方和收款方不能是同一个账户。
	 */
	@ApiField("payee_account")
	private String payeeAccount;

	/**
	 * 收款方真实姓名（最长支持100个英文/50个汉字）。
如果本参数不为空，则会校验该账户在支付宝登记的实名是否与收款方真实姓名一致。
	 */
	@ApiField("payee_real_name")
	private String payeeRealName;

	/**
	 * 收款方账户类型。可取值：
1、ALIPAY_USERID：支付宝账号对应的支付宝唯一用户号。以2088开头的16位纯数字组成。
2、ALIPAY_LOGONID：支付宝登录号，支持邮箱和手机号格式。
2、ALIPAY_OPENID：支付宝openid
	 */
	@ApiField("payee_type")
	private String payeeType;

	/**
	 * 付款方真实姓名（最长支持100个英文/50个汉字）。
如果本参数不为空，则会校验该账户在支付宝登记的实名是否与付款方真实姓名一致。
	 */
	@ApiField("payer_real_name")
	private String payerRealName;

	/**
	 * 付款方姓名（最长支持100个英文/50个汉字）。显示在收款方的账单详情页。如果该字段不传，则默认显示付款方的支付宝认证姓名或单位名称。
	 */
	@ApiField("payer_show_name")
	private String payerShowName;

	/**
	 * 转账备注（支持200个英文/100个汉字）。
当付款方为企业账户，且转账金额达到（大于等于）50000元，remark不能为空。收款方可见，会展示在收款用户的收支详情中。
	 */
	@ApiField("remark")
	private String remark;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getExtParam() {
		return this.extParam;
	}
	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPayeeAccount() {
		return this.payeeAccount;
	}
	public void setPayeeAccount(String payeeAccount) {
		this.payeeAccount = payeeAccount;
	}

	public String getPayeeRealName() {
		return this.payeeRealName;
	}
	public void setPayeeRealName(String payeeRealName) {
		this.payeeRealName = payeeRealName;
	}

	public String getPayeeType() {
		return this.payeeType;
	}
	public void setPayeeType(String payeeType) {
		this.payeeType = payeeType;
	}

	public String getPayerRealName() {
		return this.payerRealName;
	}
	public void setPayerRealName(String payerRealName) {
		this.payerRealName = payerRealName;
	}

	public String getPayerShowName() {
		return this.payerShowName;
	}
	public void setPayerShowName(String payerShowName) {
		this.payerShowName = payerShowName;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
