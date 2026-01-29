package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 场景基础信息VO
 *
 * @author auto create
 * @since 1.0, 2023-05-04 11:31:50
 */
public class ServiceSceneBasicVO extends AlipayObject {

	private static final long serialVersionUID = 3111773949132511485L;

	/**
	 * 渠道列表
	 */
	@ApiListField("channels")
	@ApiField("service_scene_channel_v_o")
	private List<ServiceSceneChannelVO> channels;

	/**
	 * 场景版本ID
	 */
	@ApiField("scene_info_id")
	private String sceneInfoId;

	/**
	 * 场景名称
	 */
	@ApiField("scene_name")
	private String sceneName;

	/**
	 * 作业模式
	 */
	@ApiField("service_mode")
	private String serviceMode;

	/**
	 * 场景ID
	 */
	@ApiField("service_scene_id")
	private String serviceSceneId;

	/**
	 * 解决方案编码
	 */
	@ApiField("solution_code")
	private String solutionCode;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 租户ID
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public List<ServiceSceneChannelVO> getChannels() {
		return this.channels;
	}
	public void setChannels(List<ServiceSceneChannelVO> channels) {
		this.channels = channels;
	}

	public String getSceneInfoId() {
		return this.sceneInfoId;
	}
	public void setSceneInfoId(String sceneInfoId) {
		this.sceneInfoId = sceneInfoId;
	}

	public String getSceneName() {
		return this.sceneName;
	}
	public void setSceneName(String sceneName) {
		this.sceneName = sceneName;
	}

	public String getServiceMode() {
		return this.serviceMode;
	}
	public void setServiceMode(String serviceMode) {
		this.serviceMode = serviceMode;
	}

	public String getServiceSceneId() {
		return this.serviceSceneId;
	}
	public void setServiceSceneId(String serviceSceneId) {
		this.serviceSceneId = serviceSceneId;
	}

	public String getSolutionCode() {
		return this.solutionCode;
	}
	public void setSolutionCode(String solutionCode) {
		this.solutionCode = solutionCode;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
