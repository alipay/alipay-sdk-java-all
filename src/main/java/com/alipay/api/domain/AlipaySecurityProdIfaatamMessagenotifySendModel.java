package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISV接入车辆状态变更消息通知接口
 *
 * @author auto create
 * @since 1.0, 2020-12-01 10:57:25
 */
public class AlipaySecurityProdIfaatamMessagenotifySendModel extends AlipayObject {

	private static final long serialVersionUID = 3696663124571365453L;

	/**
	 * 业务操作类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * ISV接入的汽车终端(T-box)唯一标示,表明消息是由该终端发出
	 */
	@ApiField("box_did")
	private String boxDid;

	/**
	 * business_id业务流水号+唯一+用于和ISV厂商服务端唯一确定一笔业务
	 */
	@ApiField("business_id")
	private String businessId;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 汽车终端发起的消息通知内容,包含车辆的模块,当前的状态,和状态描述信息
	 */
	@ApiField("vehicle_message_info")
	private VehicleMessageInfo vehicleMessageInfo;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getBoxDid() {
		return this.boxDid;
	}
	public void setBoxDid(String boxDid) {
		this.boxDid = boxDid;
	}

	public String getBusinessId() {
		return this.businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public VehicleMessageInfo getVehicleMessageInfo() {
		return this.vehicleMessageInfo;
	}
	public void setVehicleMessageInfo(VehicleMessageInfo vehicleMessageInfo) {
		this.vehicleMessageInfo = vehicleMessageInfo;
	}

}
