package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 景区语音讲解服务补充景点信息
 *
 * @author auto create
 * @since 1.0, 2022-02-08 10:58:17
 */
public class AlipayCommerceDataScenicExplanationSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6588274881866729949L;

	/**
	 * 该景区的小程序appid。
	 */
	@ApiField("scenic_app_id")
	private String scenicAppId;

	/**
	 * 商户（或ISV）系统内的景区id。
	 */
	@ApiField("scenic_outer_id")
	private String scenicOuterId;

	/**
	 * 商户（或ISV）系统内的讲解点。
	 */
	@ApiListField("scenic_points")
	@ApiField("scenic_explanation_point")
	private List<ScenicExplanationPoint> scenicPoints;

	/**
	 * 该景区订购的语音讲解的插件Appid。
	 */
	@ApiField("service_plugin_id")
	private String servicePluginId;

	public String getScenicAppId() {
		return this.scenicAppId;
	}
	public void setScenicAppId(String scenicAppId) {
		this.scenicAppId = scenicAppId;
	}

	public String getScenicOuterId() {
		return this.scenicOuterId;
	}
	public void setScenicOuterId(String scenicOuterId) {
		this.scenicOuterId = scenicOuterId;
	}

	public List<ScenicExplanationPoint> getScenicPoints() {
		return this.scenicPoints;
	}
	public void setScenicPoints(List<ScenicExplanationPoint> scenicPoints) {
		this.scenicPoints = scenicPoints;
	}

	public String getServicePluginId() {
		return this.servicePluginId;
	}
	public void setServicePluginId(String servicePluginId) {
		this.servicePluginId = servicePluginId;
	}

}
