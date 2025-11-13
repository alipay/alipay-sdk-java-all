package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 绑定方案配套线圈URL接口
 *
 * @author auto create
 * @since 1.0, 2025-11-12 15:37:41
 */
public class AlipayOfflineProviderExpoCoilBindModel extends AlipayObject {

	private static final long serialVersionUID = 1651549878286511345L;

	/**
	 * 活动创建接口的返回值中包含活动id
	 */
	@ApiField("activity_code")
	private String activityCode;

	/**
	 * 需要与活动绑定的线圈编号id
	 */
	@ApiField("coil_no")
	private String coilNo;

	/**
	 * 1. 如小程序或者h5网页
2. 现在只有009可以为空，其他情况不能为空。
	 */
	@ApiField("jump_url")
	private String jumpUrl;

	/**
	 * 业务自定义场景配置
	 */
	@ApiField("scene_name")
	private String sceneName;

	/**
	 * 活动创建接口的返回值中包含活动方案code
	 */
	@ApiField("solution_code")
	private String solutionCode;

	public String getActivityCode() {
		return this.activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getCoilNo() {
		return this.coilNo;
	}
	public void setCoilNo(String coilNo) {
		this.coilNo = coilNo;
	}

	public String getJumpUrl() {
		return this.jumpUrl;
	}
	public void setJumpUrl(String jumpUrl) {
		this.jumpUrl = jumpUrl;
	}

	public String getSceneName() {
		return this.sceneName;
	}
	public void setSceneName(String sceneName) {
		this.sceneName = sceneName;
	}

	public String getSolutionCode() {
		return this.solutionCode;
	}
	public void setSolutionCode(String solutionCode) {
		this.solutionCode = solutionCode;
	}

}
