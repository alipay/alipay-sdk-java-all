package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金场景钱包金额查询接口
 *
 * @author auto create
 * @since 1.0, 2024-10-18 18:08:02
 */
public class AlipayFundWalletConsultModel extends AlipayObject {

	private static final long serialVersionUID = 1276195439699849732L;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 用户开通钱包时的外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 用户主体标识
	 */
	@ApiField("principal_id")
	private String principalId;

	/**
	 * 用户主体标识
	 */
	@ApiField("principal_open_id")
	private String principalOpenId;

	/**
	 * alipay_user_id代表支付宝用户id
mechant_user_id代表商户id
	 */
	@ApiField("principal_type")
	private String principalType;

	/**
	 * 销售产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 查询不同场景信息
	 */
	@ApiField("search_type")
	private String searchType;

	/**
	 * 用户钱包id
	 */
	@ApiField("user_wallet_id")
	private String userWalletId;

	/**
	 * 该字段适合用于外部商户不知道用户钱包ID的情况下，通过钱包模板ID+用户user_id反查用户钱包ID。因此，钱包模板ID不为空的情况下，principal_id和principal_type一定不能为空。
	 */
	@ApiField("wallet_template_id")
	private String walletTemplateId;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(String principalId) {
		this.principalId = principalId;
	}

	public String getPrincipalOpenId() {
		return this.principalOpenId;
	}
	public void setPrincipalOpenId(String principalOpenId) {
		this.principalOpenId = principalOpenId;
	}

	public String getPrincipalType() {
		return this.principalType;
	}
	public void setPrincipalType(String principalType) {
		this.principalType = principalType;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSearchType() {
		return this.searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	public String getUserWalletId() {
		return this.userWalletId;
	}
	public void setUserWalletId(String userWalletId) {
		this.userWalletId = userWalletId;
	}

	public String getWalletTemplateId() {
		return this.walletTemplateId;
	}
	public void setWalletTemplateId(String walletTemplateId) {
		this.walletTemplateId = walletTemplateId;
	}

}
