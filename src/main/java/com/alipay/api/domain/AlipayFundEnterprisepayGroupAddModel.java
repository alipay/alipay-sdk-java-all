package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 因公付场景群组
 *
 * @author auto create
 * @since 1.0, 2022-06-07 16:31:24
 */
public class AlipayFundEnterprisepayGroupAddModel extends AlipayObject {

	private static final long serialVersionUID = 1518422654363244297L;

	/**
	 * 企业签约账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 平台和企业的三方授权协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 场景码，联系支付宝分配
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 出资信息
	 */
	@ApiField("fund_ext_info")
	private FundExtInfo fundExtInfo;

	/**
	 * 群组名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 外部业务号，外部群组号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 产品码，默认值
ENTERPRISE_PAY
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

	public FundExtInfo getFundExtInfo() {
		return this.fundExtInfo;
	}
	public void setFundExtInfo(FundExtInfo fundExtInfo) {
		this.fundExtInfo = fundExtInfo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
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
