package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 钱包外部账户信息咨询
 *
 * @author auto create
 * @since 1.0, 2026-01-22 15:10:42
 */
public class AlipayFundWalletExternalaccountConsultModel extends AlipayObject {

	private static final long serialVersionUID = 1347229611254683945L;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 当前页
	 */
	@ApiField("current_page")
	private String currentPage;

	/**
	 * 外部账户类型
	 */
	@ApiField("external_account_type")
	private String externalAccountType;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 分页大小
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

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

	public String getCurrentPage() {
		return this.currentPage;
	}
	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
	}

	public String getExternalAccountType() {
		return this.externalAccountType;
	}
	public void setExternalAccountType(String externalAccountType) {
		this.externalAccountType = externalAccountType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserWalletId() {
		return this.userWalletId;
	}
	public void setUserWalletId(String userWalletId) {
		this.userWalletId = userWalletId;
	}

}
