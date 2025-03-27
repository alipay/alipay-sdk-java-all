package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务商停止抽佣接口
 *
 * @author auto create
 * @since 1.0, 2025-03-19 14:12:27
 */
public class AlipayOpenSpCommissionCancelModel extends AlipayObject {

	private static final long serialVersionUID = 6563985757158167169L;

	/**
	 * 动作 CANCEL,TERMINAL
	 */
	@ApiField("action")
	private String action;

	/**
	 * null
	 */
	@ApiListField("commission_list")
	@ApiField("cancel_commission_info")
	private List<CancelCommissionInfo> commissionList;

	/**
	 * 抽佣场景
	 */
	@ApiField("commission_scene")
	private String commissionScene;

	/**
	 * 整体撤销/停止或部分撤销停止，整体不需要传commission_list
	 */
	@ApiField("handle_type")
	private String handleType;

	/**
	 * 商户 id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 登录账号
	 */
	@ApiField("merchant_logon_id")
	private String merchantLogonId;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public List<CancelCommissionInfo> getCommissionList() {
		return this.commissionList;
	}
	public void setCommissionList(List<CancelCommissionInfo> commissionList) {
		this.commissionList = commissionList;
	}

	public String getCommissionScene() {
		return this.commissionScene;
	}
	public void setCommissionScene(String commissionScene) {
		this.commissionScene = commissionScene;
	}

	public String getHandleType() {
		return this.handleType;
	}
	public void setHandleType(String handleType) {
		this.handleType = handleType;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantLogonId() {
		return this.merchantLogonId;
	}
	public void setMerchantLogonId(String merchantLogonId) {
		this.merchantLogonId = merchantLogonId;
	}

}
