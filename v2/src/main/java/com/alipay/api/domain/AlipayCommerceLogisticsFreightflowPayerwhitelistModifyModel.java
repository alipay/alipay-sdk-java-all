package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 运企付_入金通知付方白名单更新
 *
 * @author auto create
 * @since 1.0, 2026-01-06 11:42:42
 */
public class AlipayCommerceLogisticsFreightflowPayerwhitelistModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8252846995147256691L;

	/**
	 * null
	 */
	@ApiListField("allowed_account_white_list")
	@ApiField("freight_flow_allowed_account")
	private List<FreightFlowAllowedAccount> allowedAccountWhiteList;

	/**
	 * 物流公司编码
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 银行管理模式。
ANT_MYBANK(网商银行模式);
SPDB(浦发银行)
	 */
	@ApiField("mode")
	private String mode;

	/**
	 * 归属人唯一标识:
当归属人类型为子户时代表子户卡号
	 */
	@ApiField("owner_account_no")
	private String ownerAccountNo;

	/**
	 * 归属人类型：
SUB_ACCOUNT(子户)
	 */
	@ApiField("owner_account_type")
	private String ownerAccountType;

	/**
	 * 业务场景:
DEPOSIT_NOTIFY(入金通知)
	 */
	@ApiField("scene")
	private String scene;

	public List<FreightFlowAllowedAccount> getAllowedAccountWhiteList() {
		return this.allowedAccountWhiteList;
	}
	public void setAllowedAccountWhiteList(List<FreightFlowAllowedAccount> allowedAccountWhiteList) {
		this.allowedAccountWhiteList = allowedAccountWhiteList;
	}

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getMode() {
		return this.mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getOwnerAccountNo() {
		return this.ownerAccountNo;
	}
	public void setOwnerAccountNo(String ownerAccountNo) {
		this.ownerAccountNo = ownerAccountNo;
	}

	public String getOwnerAccountType() {
		return this.ownerAccountType;
	}
	public void setOwnerAccountType(String ownerAccountType) {
		this.ownerAccountType = ownerAccountType;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
