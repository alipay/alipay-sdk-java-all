package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 确认邀测结果
 *
 * @author auto create
 * @since 1.0, 2024-04-23 10:18:51
 */
public class AlipayOpenMiniInnerversionBetaConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 8651519987894245227L;

	/**
	 * 业务来源
	 */
	@ApiField("app_origin")
	private String appOrigin;

	/**
	 * 拒绝理由
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 小程序ID，仅特殊场景使用，普通业务方无需关注该参数
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 操作：pass/reject。接受或者拒绝
	 */
	@ApiField("operate")
	private String operate;

	/**
	 * 小程序所属PID
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 要确认邀测结果的插件appid
	 */
	@ApiField("plugin_id")
	private String pluginId;

	public String getAppOrigin() {
		return this.appOrigin;
	}
	public void setAppOrigin(String appOrigin) {
		this.appOrigin = appOrigin;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getOperate() {
		return this.operate;
	}
	public void setOperate(String operate) {
		this.operate = operate;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPluginId() {
		return this.pluginId;
	}
	public void setPluginId(String pluginId) {
		this.pluginId = pluginId;
	}

}
