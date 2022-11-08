package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金场景钱包金额查询接口
 *
 * @author auto create
 * @since 1.0, 2022-10-28 13:12:00
 */
public class AlipayFundWalletConsultModel extends AlipayObject {

	private static final long serialVersionUID = 3287542195381628361L;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 用户主体标识
	 */
	@ApiField("principal_id")
	private String principalId;

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
WALLET_INFO：查用户钱包
WITHDRAW_INFO：原路退资金
DESTROY_INFO：销户资金查询
	 */
	@ApiField("search_type")
	private String searchType;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(String principalId) {
		this.principalId = principalId;
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

}
