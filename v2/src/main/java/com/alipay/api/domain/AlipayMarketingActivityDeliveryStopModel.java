package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 停止投放
 *
 * @author auto create
 * @since 1.0, 2023-10-25 15:49:52
 */
public class AlipayMarketingActivityDeliveryStopModel extends AlipayObject {

	private static final long serialVersionUID = 7263686391538217737L;

	/**
	 * "服务商代运营商户信息。 限制: 服务商代运营模式必选"
	 */
	@ApiField("belong_merchant_info")
	private DeliveryAgencyMerchantInfo belongMerchantInfo;

	/**
	 * "[已废弃] 待停止的投放配置列表。 最大数量限制20个。"
	 */
	@ApiListField("delivery_config_list")
	@ApiField("delivery_config")
	private List<DeliveryConfig> deliveryConfigList;

	/**
	 * 推广计划id
	 */
	@ApiField("delivery_id")
	private String deliveryId;

	/**
	 * 商户接入模式
	 */
	@ApiField("merchant_access_mode")
	private String merchantAccessMode;

	/**
	 * 外部业务单号，用作幂等控制。 幂等作用： 再次请求返回与上一次相同的结果。 外部接入方需保证业务单号唯一。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public DeliveryAgencyMerchantInfo getBelongMerchantInfo() {
		return this.belongMerchantInfo;
	}
	public void setBelongMerchantInfo(DeliveryAgencyMerchantInfo belongMerchantInfo) {
		this.belongMerchantInfo = belongMerchantInfo;
	}

	public List<DeliveryConfig> getDeliveryConfigList() {
		return this.deliveryConfigList;
	}
	public void setDeliveryConfigList(List<DeliveryConfig> deliveryConfigList) {
		this.deliveryConfigList = deliveryConfigList;
	}

	public String getDeliveryId() {
		return this.deliveryId;
	}
	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId;
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
