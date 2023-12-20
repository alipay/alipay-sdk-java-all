package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 投放创建
 *
 * @author auto create
 * @since 1.0, 2023-12-15 17:29:54
 */
public class AlipayMarketingActivityDeliveryCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2883923662525877932L;

	/**
	 * 服务商代商户创建投放必选。
bussinessType设置为ISV_FOR_MERCHANT。
	 */
	@ApiField("belong_merchant_info")
	private DeliveryAgencyMerchantInfo belongMerchantInfo;

	/**
	 * 投放计划基础信息。
	 */
	@ApiField("delivery_base_info")
	private DeliveryBaseInfo deliveryBaseInfo;

	/**
	 * 投放的展位编码。
	 */
	@ApiField("delivery_booth_code")
	private String deliveryBoothCode;

	/**
	 * [已废弃]
待创建的投放配置列表。
最大数量限制20个。
	 */
	@ApiListField("delivery_config_list")
	@ApiField("delivery_config")
	private List<DeliveryConfig> deliveryConfigList;

	/**
	 * 投放计划玩法配置。 限制：投放玩法配置有且仅能配置一个。
	 */
	@ApiField("delivery_play_config")
	private DeliveryPlayConfig deliveryPlayConfig;

	/**
	 * 投放计划定向规则。
	 */
	@ApiField("delivery_target_rule")
	private DeliveryTargetRule deliveryTargetRule;

	/**
	 * 商户接入模式
	 */
	@ApiField("merchant_access_mode")
	private String merchantAccessMode;

	/**
	 * 外部业务单号，用作幂等控制。 幂等作用：请求返回与上一次相同的结果。 外部接入方需保证业务单号唯一。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public DeliveryAgencyMerchantInfo getBelongMerchantInfo() {
		return this.belongMerchantInfo;
	}
	public void setBelongMerchantInfo(DeliveryAgencyMerchantInfo belongMerchantInfo) {
		this.belongMerchantInfo = belongMerchantInfo;
	}

	public DeliveryBaseInfo getDeliveryBaseInfo() {
		return this.deliveryBaseInfo;
	}
	public void setDeliveryBaseInfo(DeliveryBaseInfo deliveryBaseInfo) {
		this.deliveryBaseInfo = deliveryBaseInfo;
	}

	public String getDeliveryBoothCode() {
		return this.deliveryBoothCode;
	}
	public void setDeliveryBoothCode(String deliveryBoothCode) {
		this.deliveryBoothCode = deliveryBoothCode;
	}

	public List<DeliveryConfig> getDeliveryConfigList() {
		return this.deliveryConfigList;
	}
	public void setDeliveryConfigList(List<DeliveryConfig> deliveryConfigList) {
		this.deliveryConfigList = deliveryConfigList;
	}

	public DeliveryPlayConfig getDeliveryPlayConfig() {
		return this.deliveryPlayConfig;
	}
	public void setDeliveryPlayConfig(DeliveryPlayConfig deliveryPlayConfig) {
		this.deliveryPlayConfig = deliveryPlayConfig;
	}

	public DeliveryTargetRule getDeliveryTargetRule() {
		return this.deliveryTargetRule;
	}
	public void setDeliveryTargetRule(DeliveryTargetRule deliveryTargetRule) {
		this.deliveryTargetRule = deliveryTargetRule;
	}

	public String getMerchantAccessMode() {
		return this.merchantAccessMode;
	}
	public void setMerchantAccessMode(String merchantAccessMode) {
		this.merchantAccessMode = merchantAccessMode;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
