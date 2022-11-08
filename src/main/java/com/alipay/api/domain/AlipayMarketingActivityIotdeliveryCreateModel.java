package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投放计划创建接口
 *
 * @author auto create
 * @since 1.0, 2022-06-27 19:42:58
 */
public class AlipayMarketingActivityIotdeliveryCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8472267869939557615L;

	/**
	 * 服务商代商户创建投放必选。
bussinessType设置为ISV_FOR_MERCHANT。
	 */
	@ApiField("belong_merchant_info")
	private IotDeliveryAgencyMerchantInfo belongMerchantInfo;

	/**
	 * 投放计划基础信息
	 */
	@ApiField("delivery_base_info")
	private IotDeliveryBaseInfo deliveryBaseInfo;

	/**
	 * 展位码，代表券会投放的展位。服务商可根据此字段判断场景，以决定是否要投放券。
可选枚举：
BC_ALIPAY_FACE_ACTIVITY_RESULT 刷脸支付后
	 */
	@ApiField("delivery_booth_code")
	private String deliveryBoothCode;

	/**
	 * 投放计划玩法配置。 限制：投放玩法配置有且仅能配置一个
	 */
	@ApiField("delivery_play_config")
	private IotDeliveryPlayConfig deliveryPlayConfig;

	/**
	 * 外部业务单号，用作幂等控制。 幂等作用：请求返回与上一次相同的结果。 外部接入方需保证业务单号唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public IotDeliveryAgencyMerchantInfo getBelongMerchantInfo() {
		return this.belongMerchantInfo;
	}
	public void setBelongMerchantInfo(IotDeliveryAgencyMerchantInfo belongMerchantInfo) {
		this.belongMerchantInfo = belongMerchantInfo;
	}

	public IotDeliveryBaseInfo getDeliveryBaseInfo() {
		return this.deliveryBaseInfo;
	}
	public void setDeliveryBaseInfo(IotDeliveryBaseInfo deliveryBaseInfo) {
		this.deliveryBaseInfo = deliveryBaseInfo;
	}

	public String getDeliveryBoothCode() {
		return this.deliveryBoothCode;
	}
	public void setDeliveryBoothCode(String deliveryBoothCode) {
		this.deliveryBoothCode = deliveryBoothCode;
	}

	public IotDeliveryPlayConfig getDeliveryPlayConfig() {
		return this.deliveryPlayConfig;
	}
	public void setDeliveryPlayConfig(IotDeliveryPlayConfig deliveryPlayConfig) {
		this.deliveryPlayConfig = deliveryPlayConfig;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
