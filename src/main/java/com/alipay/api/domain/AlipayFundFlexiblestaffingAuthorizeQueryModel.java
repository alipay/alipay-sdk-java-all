package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 灵工授权结果查询
 *
 * @author auto create
 * @since 1.0, 2022-05-09 13:40:39
 */
public class AlipayFundFlexiblestaffingAuthorizeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7332462442977929237L;

	/**
	 * 灵工授权业务场景码，固定值：DEFAULT
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 灵工授权成功的用户支付宝登录号，与principal_id不能同时为空
	 */
	@ApiField("principal_account_no")
	private String principalAccountNo;

	/**
	 * 授权用户的alipayUserId，如果同时传递principal_account_no和principalId，优先通过principalId查询，与principal_account_no不能同时为空
	 */
	@ApiField("principal_id")
	private String principalId;

	/**
	 * 灵工授权产品码，固定值：FLEXIBLE_STAFFING
	 */
	@ApiField("product_code")
	private String productCode;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getPrincipalAccountNo() {
		return this.principalAccountNo;
	}
	public void setPrincipalAccountNo(String principalAccountNo) {
		this.principalAccountNo = principalAccountNo;
	}

	public String getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(String principalId) {
		this.principalId = principalId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
