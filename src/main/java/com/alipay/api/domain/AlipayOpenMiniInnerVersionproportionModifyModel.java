package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改版本基础库
 *
 * @author auto create
 * @since 1.0, 2022-07-14 11:40:21
 */
public class AlipayOpenMiniInnerVersionproportionModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7165825652249416273L;

	/**
	 * 业务来源
	 */
	@ApiField("app_origin")
	private String appOrigin;

	/**
	 * 端id
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 小程序id
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 操作员id
	 */
	@ApiField("operate_id")
	private String operateId;

	/**
	 * 修改值
	 */
	@ApiField("value")
	private String value;

	public String getAppOrigin() {
		return this.appOrigin;
	}
	public void setAppOrigin(String appOrigin) {
		this.appOrigin = appOrigin;
	}

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
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

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
