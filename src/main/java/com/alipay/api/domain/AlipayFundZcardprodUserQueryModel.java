package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支卡通-用户绑定查询
 *
 * @author auto create
 * @since 1.0, 2022-09-23 11:19:42
 */
public class AlipayFundZcardprodUserQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1339684319196781842L;

	/**
	 * 商户的账户id
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 到店综合行业：GENERAL_STORE
	 */
	@ApiField("biz_scene_code")
	private String bizSceneCode;

	/**
	 * 扩展参数
	 */
	@ApiField("business_params")
	private String businessParams;

	/**
	 * 外部卡号
	 */
	@ApiField("out_card_no")
	private String outCardNo;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getBizSceneCode() {
		return this.bizSceneCode;
	}
	public void setBizSceneCode(String bizSceneCode) {
		this.bizSceneCode = bizSceneCode;
	}

	public String getBusinessParams() {
		return this.businessParams;
	}
	public void setBusinessParams(String businessParams) {
		this.businessParams = businessParams;
	}

	public String getOutCardNo() {
		return this.outCardNo;
	}
	public void setOutCardNo(String outCardNo) {
		this.outCardNo = outCardNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
