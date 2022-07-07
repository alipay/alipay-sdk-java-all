package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改用户关联的场景列表
 *
 * @author auto create
 * @since 1.0, 2021-09-22 16:49:45
 */
public class AlipayOpenMiniAmpeUsersceneModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2555559477213245467L;

	/**
	 * 设备标识
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 用户不支持的场景列表
	 */
	@ApiListField("disable_scene_id_list")
	@ApiField("number")
	private List<Long> disableSceneIdList;

	/**
	 * 用户选择的场景id列表
	 */
	@ApiListField("enable_scene_id_list")
	@ApiField("number")
	private List<Long> enableSceneIdList;

	/**
	 * 产品id
	 */
	@ApiField("product_id")
	private Long productId;

	/**
	 * 通过ampe获取的用户标识
	 */
	@ApiField("user_key")
	private String userKey;

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public List<Long> getDisableSceneIdList() {
		return this.disableSceneIdList;
	}
	public void setDisableSceneIdList(List<Long> disableSceneIdList) {
		this.disableSceneIdList = disableSceneIdList;
	}

	public List<Long> getEnableSceneIdList() {
		return this.enableSceneIdList;
	}
	public void setEnableSceneIdList(List<Long> enableSceneIdList) {
		this.enableSceneIdList = enableSceneIdList;
	}

	public Long getProductId() {
		return this.productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getUserKey() {
		return this.userKey;
	}
	public void setUserKey(String userKey) {
		this.userKey = userKey;
	}

}
