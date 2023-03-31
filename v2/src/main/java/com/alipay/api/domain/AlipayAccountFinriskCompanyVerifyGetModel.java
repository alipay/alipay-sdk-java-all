package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户验真接口
 *
 * @author auto create
 * @since 1.0, 2021-04-12 12:03:47
 */
public class AlipayAccountFinriskCompanyVerifyGetModel extends AlipayObject {

	private static final long serialVersionUID = 2325197964317539416L;

	/**
	 * 请求系统
	 */
	@ApiField("app")
	private String app;

	/**
	 * 业务参数列表
	 */
	@ApiField("param")
	private String param;

	/**
	 * 外部请求唯一标识
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 防伪场景编码
	 */
	@ApiField("scene_id")
	private String sceneId;

	/**
	 * 租户ID
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public String getApp() {
		return this.app;
	}
	public void setApp(String app) {
		this.app = app;
	}

	public String getParam() {
		return this.param;
	}
	public void setParam(String param) {
		this.param = param;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
