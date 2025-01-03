package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 外部权益同步，权益投放信息
 *
 * @author auto create
 * @since 1.0, 2023-07-10 13:35:50
 */
public class BenefitDeliveryInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 7251671839199765123L;

	/**
	 * 券的可用区域
	 */
	@ApiListField("available_areas")
	@ApiField("string")
	private List<String> availableAreas;

	/**
	 * 券的可用店铺
	 */
	@ApiListField("available_shops")
	@ApiField("string")
	private List<String> availableShops;

	/**
	 * 描述是线上还是线下业务
	 */
	@ApiListField("deliver_scene")
	@ApiField("string")
	private List<String> deliverScene;

	/**
	 * 用于描述投放的类型，支持 AREA、SHOP
	 */
	@ApiField("deliver_type")
	private String deliverType;

	public List<String> getAvailableAreas() {
		return this.availableAreas;
	}
	public void setAvailableAreas(List<String> availableAreas) {
		this.availableAreas = availableAreas;
	}

	public List<String> getAvailableShops() {
		return this.availableShops;
	}
	public void setAvailableShops(List<String> availableShops) {
		this.availableShops = availableShops;
	}

	public List<String> getDeliverScene() {
		return this.deliverScene;
	}
	public void setDeliverScene(List<String> deliverScene) {
		this.deliverScene = deliverScene;
	}

	public String getDeliverType() {
		return this.deliverType;
	}
	public void setDeliverType(String deliverType) {
		this.deliverType = deliverType;
	}

}
