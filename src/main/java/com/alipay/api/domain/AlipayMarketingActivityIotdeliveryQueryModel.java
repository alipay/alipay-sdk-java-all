package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * IoT投放计划查询
 *
 * @author auto create
 * @since 1.0, 2022-06-27 14:53:05
 */
public class AlipayMarketingActivityIotdeliveryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3781956665972983235L;

	/**
	 * 服务商代商户创建投放必选。
bussinessType设置为ISV_FOR_MERCHANT。
	 */
	@ApiField("belong_merchant_info")
	private IotDeliveryAgencyMerchantInfo belongMerchantInfo;

	/**
	 * 投放计划id。与out_biz_no参数二选一
	 */
	@ApiField("delivery_id")
	private String deliveryId;

	/**
	 * 外部业务单号，与投放计划id一一对应。与delivery_id参数二选一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public IotDeliveryAgencyMerchantInfo getBelongMerchantInfo() {
		return this.belongMerchantInfo;
	}
	public void setBelongMerchantInfo(IotDeliveryAgencyMerchantInfo belongMerchantInfo) {
		this.belongMerchantInfo = belongMerchantInfo;
	}

	public String getDeliveryId() {
		return this.deliveryId;
	}
	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
