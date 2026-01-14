package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 自动攒计划调拨执行列表查询
 *
 * @author auto create
 * @since 1.0, 2022-12-16 19:33:50
 */
public class AlipayFundJointaccountFundallocListQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6763552858537444996L;

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
	 * 当前合花群中的自动攒计划唯一标识<br>
补充说明：<br>
- 该字段可新增自动攒计划后，由alipay.fund.jointaccount.depositplan.list.query中返回
	 */
	@ApiField("fund_plan_id")
	private String fundPlanId;

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
	 * 自动攒计划的调拨记录的起始标识（游标分页法）<br>
补充说明：<br>
- 查询第一页时，可传空<br>
- 点击下一页查询时，可传递上一次查询所返回的last_id
	 */
	@ApiField("last_id")
	private String lastId;

	/**
	 * （发起人）用户唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 从起始标识往后查询多少条调拨记录<br>
补充说明：<br>
- 该字段不传时，支付宝侧默认查询20条<br>
- 超过20时按20条查询<br>
- 剩余记录数不足20条则按实际记录数返回
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 销售产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 自动攒计划的调拨记录的执行结果（查询过滤条件）<br>
- SUCCESS：执行成功<br>
- FAIL：执行失败<br>
- NO_PROCESS：未执行（如指定付款方资产的可用金额试算不足以完成扣款）
	 */
	@ApiListField("status_list")
	@ApiField("string")
	private List<String> statusList;

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

	public String getFundPlanId() {
		return this.fundPlanId;
	}
	public void setFundPlanId(String fundPlanId) {
		this.fundPlanId = fundPlanId;
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

	public String getLastId() {
		return this.lastId;
	}
	public void setLastId(String lastId) {
		this.lastId = lastId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public List<String> getStatusList() {
		return this.statusList;
	}
	public void setStatusList(List<String> statusList) {
		this.statusList = statusList;
	}

}
