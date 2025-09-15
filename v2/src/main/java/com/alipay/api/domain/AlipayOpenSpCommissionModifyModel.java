package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 抽佣修改接口
 *
 * @author auto create
 * @since 1.0, 2025-03-19 14:12:27
 */
public class AlipayOpenSpCommissionModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3178868366633397917L;

	/**
	 * null
	 */
	@ApiListField("commission_list")
	@ApiField("commission_info")
	private List<CommissionInfo> commissionList;

	/**
	 * 抽佣场景
	 */
	@ApiField("commission_scene")
	private String commissionScene;

	/**
	 * 商户id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 商户登录账号
	 */
	@ApiField("merchant_logon_id")
	private String merchantLogonId;

	public List<CommissionInfo> getCommissionList() {
		return this.commissionList;
	}
	public void setCommissionList(List<CommissionInfo> commissionList) {
		this.commissionList = commissionList;
	}

	public String getCommissionScene() {
		return this.commissionScene;
	}
	public void setCommissionScene(String commissionScene) {
		this.commissionScene = commissionScene;
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
