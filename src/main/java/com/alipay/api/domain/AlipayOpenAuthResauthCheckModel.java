package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 代运营关系检查
 *
 * @author auto create
 * @since 1.0, 2022-05-13 17:15:39
 */
public class AlipayOpenAuthResauthCheckModel extends AlipayObject {

	private static final long serialVersionUID = 5617818355998738141L;

	/**
	 * 授权场景
	 */
	@ApiField("auth_scene")
	private String authScene;

	/**
	 * 授权方pid
	 */
	@ApiField("authorize_pid")
	private String authorizePid;

	/**
	 * 被授权方pid
	 */
	@ApiField("pid")
	private String pid;

	public String getAuthScene() {
		return this.authScene;
	}
	public void setAuthScene(String authScene) {
		this.authScene = authScene;
	}

	public String getAuthorizePid() {
		return this.authorizePid;
	}
	public void setAuthorizePid(String authorizePid) {
		this.authorizePid = authorizePid;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

}
