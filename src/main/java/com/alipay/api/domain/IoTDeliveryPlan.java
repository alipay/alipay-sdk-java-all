package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * IoT投放计划模型
 *
 * @author auto create
 * @since 1.0, 2022-06-24 11:17:25
 */
public class IoTDeliveryPlan extends AlipayObject {

	private static final long serialVersionUID = 6123167751334697574L;

	/**
	 * 投放计划基础信息。
	 */
	@ApiField("delivery_base_info")
	private IotDeliveryBaseInfo deliveryBaseInfo;

	/**
	 * 投放的展位编码
	 */
	@ApiField("delivery_booth_code")
	private String deliveryBoothCode;

	/**
	 * 投放错误信息（如有）
	 */
	@ApiField("delivery_error_msg")
	private String deliveryErrorMsg;

	/**
	 * 投放计划id
	 */
	@ApiField("delivery_id")
	private String deliveryId;

	/**
	 * 投放计划玩法配置
	 */
	@ApiField("delivery_play_config")
	private IotDeliveryPlayConfig deliveryPlayConfig;

	/**
	 * 投放计划状态。 
枚举值： 
ACTIVE：生效中 
OFFLINE：已下线 
PUBLISHING：发布中 。 注意发布中状态可能会停留1~5分钟，然后进入生效中或发布失败状态。
FAIL：发布失败
	 */
	@ApiField("delivery_status")
	private String deliveryStatus;

	/**
	 * 外部业务单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

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

	public String getDeliveryErrorMsg() {
		return this.deliveryErrorMsg;
	}
	public void setDeliveryErrorMsg(String deliveryErrorMsg) {
		this.deliveryErrorMsg = deliveryErrorMsg;
	}

	public String getDeliveryId() {
		return this.deliveryId;
	}
	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId;
	}

	public IotDeliveryPlayConfig getDeliveryPlayConfig() {
		return this.deliveryPlayConfig;
	}
	public void setDeliveryPlayConfig(IotDeliveryPlayConfig deliveryPlayConfig) {
		this.deliveryPlayConfig = deliveryPlayConfig;
	}

	public String getDeliveryStatus() {
		return this.deliveryStatus;
	}
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
