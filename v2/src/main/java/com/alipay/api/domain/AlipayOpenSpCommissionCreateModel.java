package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 抽佣创建接口
 *
 * @author auto create
 * @since 1.0, 2025-03-19 14:12:28
 */
public class AlipayOpenSpCommissionCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7829892592962559638L;

	/**
	 * null
	 */
	@ApiListField("commission_info_list")
	@ApiField("scene_commission_info")
	private List<SceneCommissionInfo> commissionInfoList;

	/**
	 * 商家 id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 商家支付宝账号
	 */
	@ApiField("merchant_logon_id")
	private String merchantLogonId;

	/**
	 * 商户名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	public List<SceneCommissionInfo> getCommissionInfoList() {
		return this.commissionInfoList;
	}
	public void setCommissionInfoList(List<SceneCommissionInfo> commissionInfoList) {
		this.commissionInfoList = commissionInfoList;
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

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

}
