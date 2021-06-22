package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * icrowd接口请求上下文
 *
 * @author auto create
 * @since 1.0, 2018-10-25 11:00:24
 */
public class IcrowdUseContext extends AlipayObject {

	private static final long serialVersionUID = 3681565458334939633L;

	/**
	 * 是否开启debug模式
	 */
	@ApiField("debug")
	private Boolean debug;

	/**
	 * 创建人工号
	 */
	@ApiField("owner")
	private String owner;

	/**
	 * 场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 是否返回延迟信息
	 */
	@ApiField("show_delay")
	private Boolean showDelay;

	public Boolean getDebug() {
		return this.debug;
	}
	public void setDebug(Boolean debug) {
		this.debug = debug;
	}

	public String getOwner() {
		return this.owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public Boolean getShowDelay() {
		return this.showDelay;
	}
	public void setShowDelay(Boolean showDelay) {
		this.showDelay = showDelay;
	}

}
