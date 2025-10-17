package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 钱包动账明细
 *
 * @author auto create
 * @since 1.0, 2024-07-15 17:57:44
 */
public class AlipayCloudFundWalletOperationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4874696385278821931L;

	/**
	 * 钱包场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 业务类型
【枚举值】
核销: PAYMENT
核销退: REFUND
充值: DEPOSIT
提现: WITHDRAW
充退: RETURN
	 */
	@ApiListField("biz_types")
	@ApiField("string")
	private List<String> bizTypes;

	/**
	 * 当前页
	 */
	@ApiField("current_page")
	private String currentPage;

	/**
	 * 业务结束时间
	 */
	@ApiField("end_biz_dt")
	private String endBizDt;

	/**
	 * 待邀请用户的支付宝账号： identity_type是ALIPAY_USER_ID填支付宝会员账号； 是ALIPAY_LOGON_ID 填支付宝登录号（支持邮箱和手机号格式）
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 待邀请用户的支付宝账号： identity_type是ALIPAY_USER_ID填支付宝会员账号； 是ALIPAY_LOGON_ID 填支付宝登录号（支持邮箱和手机号格式）
	 */
	@ApiField("identity_open_id")
	private String identityOpenId;

	/**
	 * 待邀请的用户支付宝账号类型，目前支持如下类型： 1、ALIPAY_USER_ID 支付宝的会员ID 2、ALIPAY_LOGON_ID 支付宝登录号，支持邮箱和手机号格式
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 分页大小，单位是条数
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 钱包产品code一般为FUND_TRUSTSHIP
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 业务开始时间
	 */
	@ApiField("start_biz_dt")
	private String startBizDt;

	/**
	 * 钱包id
	 */
	@ApiField("user_wallet_id")
	private String userWalletId;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public List<String> getBizTypes() {
		return this.bizTypes;
	}
	public void setBizTypes(List<String> bizTypes) {
		this.bizTypes = bizTypes;
	}

	public String getCurrentPage() {
		return this.currentPage;
	}
	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
	}

	public String getEndBizDt() {
		return this.endBizDt;
	}
	public void setEndBizDt(String endBizDt) {
		this.endBizDt = endBizDt;
	}

	public String getIdentity() {
		return this.identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getIdentityOpenId() {
		return this.identityOpenId;
	}
	public void setIdentityOpenId(String identityOpenId) {
		this.identityOpenId = identityOpenId;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
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

	public String getStartBizDt() {
		return this.startBizDt;
	}
	public void setStartBizDt(String startBizDt) {
		this.startBizDt = startBizDt;
	}

	public String getUserWalletId() {
		return this.userWalletId;
	}
	public void setUserWalletId(String userWalletId) {
		this.userWalletId = userWalletId;
	}

}
