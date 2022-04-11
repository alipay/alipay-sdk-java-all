package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单笔转账
 *
 * @author auto create
 * @since 1.0, 2021-09-07 10:06:44
 */
public class AlipayFundJointaccountFundBtocTransferModel extends AlipayObject {

	private static final long serialVersionUID = 3276876286864222982L;

	/**
	 * 合花群ID<br>
补充说明：<br>
- 该字段可在签约接口调用后，由alipay.fund.jointaccount.account.completed中返回 <br>
- 该字段可在签约接口调用后，由alipay.fund.jointaccount.detail.query中返回
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权协议号<br>
补充说明：<br>
- 该字段可在签约接口调用后，由alipay.fund.jointaccount.account.completed中返回 <br>
- 该字段可在签约接口调用后，
由alipay.fund.jointaccount.detail.query中返回
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 订单标题，长度超长会拒绝交易，可包括数字、字母、空格、汉字，但不能包括特殊字符、emoji等
	 */
	@ApiField("order_title")
	private String orderTitle;

	/**
	 * 商户侧单号（幂等字段）<br/>
补充说明：
幂等逻辑（商户appid+out_biz_no），商户集成时需注意，如换号重复发起，则认为是一笔新的请求
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 销售产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 订单备注，长度超长会拒绝交易，可包括数字、字母、空格、汉字，但不能包括特殊字符、emoji等
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 转入金额（单位为元，必须大于0且最多小数点后两位，最大金额不超过100万）
	 */
	@ApiField("trans_amount")
	private String transAmount;

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

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
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

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getTransAmount() {
		return this.transAmount;
	}
	public void setTransAmount(String transAmount) {
		this.transAmount = transAmount;
	}

}
