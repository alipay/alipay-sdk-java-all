package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 自动攒计划列表查询
 *
 * @author auto create
 * @since 1.0, 2022-12-16 19:55:16
 */
public class AlipayFundJointaccountDepositplanListQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4183824921295642268L;

	/**
	 * 合花群ID<br>
补充说明：<br>
- 该字段可在签约接口调用后，由alipay.fund.jointaccount.account.completed返回<br>
- 该字段可在签约接口调用后，由alipay.fund.jointaccount.detail.query接口中返回
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 授权协议号<br>
补充说明：<br>
- 该字段可在签约接口调用后，由alipay.fund.jointaccount.account.completed中返回<br>
- 该字段可在签约接口调用后，由alipay.fund.jointaccount.detail.query接口中返回
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 业务场景
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
	 * （发起人）用户唯一标识
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * （发起人）账号类型，参考值如下<br>
- ALIPAY_USER_ID：支付宝侧用户唯一标识
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * （发起人）用户唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部业务号</br>
商户侧单号（幂等字段）
补充说明：</br> - 该字段由签约接口alipay.fund.jointaccount.sign调用后，由自动攒变更通知alipay.fund.jointaccount.fundplan.completed中返回</br>- 自动攒场景幂等逻辑,如换号重复发起，则认为是一笔新的请求
	 */
	@ApiListField("out_biz_no_list")
	@ApiField("string")
	private List<String> outBizNoList;

	/**
	 * 销售产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 查询模式</br>
OUT_BIZ_NO_OWNER：根据accountId+outBizNoList查询
	 */
	@ApiField("query_mode")
	private String queryMode;

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

	public String getIdentity() {
		return this.identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public List<String> getOutBizNoList() {
		return this.outBizNoList;
	}
	public void setOutBizNoList(List<String> outBizNoList) {
		this.outBizNoList = outBizNoList;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getQueryMode() {
		return this.queryMode;
	}
	public void setQueryMode(String queryMode) {
		this.queryMode = queryMode;
	}

}
