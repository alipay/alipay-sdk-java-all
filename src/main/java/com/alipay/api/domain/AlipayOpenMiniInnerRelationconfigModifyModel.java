package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改互跳配置
 *
 * @author auto create
 * @since 1.0, 2022-07-27 12:21:59
 */
public class AlipayOpenMiniInnerRelationconfigModifyModel extends AlipayObject {

	private static final long serialVersionUID = 8661931136674358844L;

	/**
	 * 业务来源
	 */
	@ApiField("app_origin")
	private String appOrigin;

	/**
	 * 业务小程序id
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 操作员id
	 */
	@ApiField("operate_id")
	private String operateId;

	/**
	 * 允许所有小程序跳转
	 */
	@ApiField("un_limited")
	private Boolean unLimited;

	/**
	 * 互跳白名单
	 */
	@ApiField("white_list")
	private String whiteList;

	public String getAppOrigin() {
		return this.appOrigin;
	}
	public void setAppOrigin(String appOrigin) {
		this.appOrigin = appOrigin;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getOperateId() {
		return this.operateId;
	}
	public void setOperateId(String operateId) {
		this.operateId = operateId;
	}

	public Boolean getUnLimited() {
		return this.unLimited;
	}
	public void setUnLimited(Boolean unLimited) {
		this.unLimited = unLimited;
	}

	public String getWhiteList() {
		return this.whiteList;
	}
	public void setWhiteList(String whiteList) {
		this.whiteList = whiteList;
	}

}
