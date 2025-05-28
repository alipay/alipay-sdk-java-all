package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业查询代付账户详情
 *
 * @author auto create
 * @since 1.0, 2022-11-18 16:05:15
 */
public class AlipayFundJointaccountDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1614315724447655659L;

	/**
	 * 合花群ID（查询方式二：通过传入account_id+agreement_no查询）<br>
补充说明：<br>
-该字段可在签约接口alipay.fund.jointaccount.sign调用后，由账户变更结果通知接口alipay.fund.jointaccount.account.completed中返回。<br>
-该字段可在签约接口调用后，由查询账户详情接口alipay.fund.jointaccount.detail.query中返回。
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权协议号（查询方式二：通过传入account_id+agreement_no查询）<br>
补充说明：<br>
-该字段可在签约接口alipay.fund.jointaccount.sign调用后，由账户变更结果通知接口alipay.fund.jointaccount.account.completed中返回。<br>
-该字段可在签约接口调用后，由查询账户详情接口alipay.fund.jointaccount.detail.query中返回。
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 业务场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 业务渠道</br>
补充说明：</br>
需要商户侧必传，支付宝侧不做强校验
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 商户侧单号（查询方式一：通过传入
out_biz_no查询）<br>
补充说明：<br>
-该字段与签约接口alipay.fund.jointaccount.sign请求参数中传入值保持一致
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 销售产品码
	 */
	@ApiField("product_code")
	private String productCode;

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

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
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

}
