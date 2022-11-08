package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业批量查询员工信息（分页）
 *
 * @author auto create
 * @since 1.0, 2022-04-06 11:28:01
 */
public class AlipayFundJointaccountMemberBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4562217172245391393L;

	/**
	 * 共同账户ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 三方授权协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 企业账号：identity_type是ALIPAY_USER_ID填支付宝会员ID（2088开头）；
是ALIPAY_LOGON_ID 填支付宝登录号
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 账号类型，目前支持如下类型： 1、ALIPAY_USER_ID 支付宝的会员ID 2、ALIPAY_LOGON_ID：支付宝登录号，支持邮箱和手机号格式
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 按游标查询，传入上次查询最后一个用户ID，适用于逐页查询。优先级大于page_num
	 */
	@ApiField("last_user_id")
	private String lastUserId;

	/**
	 * 采用分页查询，本参数为空或0默认显示第一页。如果输入的值大于总页数，则支付宝返回最后一页数据。
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 每页大小，不传的情况下默认20条，上限100；不足20条则按实际记录数返回
	 */
	@ApiField("page_size")
	private String pageSize;

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

	public String getLastUserId() {
		return this.lastUserId;
	}
	public void setLastUserId(String lastUserId) {
		this.lastUserId = lastUserId;
	}

	public String getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
