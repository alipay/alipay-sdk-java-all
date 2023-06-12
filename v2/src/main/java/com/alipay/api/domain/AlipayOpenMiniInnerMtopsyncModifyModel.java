package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改appid与MTOP appKey关联关系
 *
 * @author auto create
 * @since 1.0, 2021-09-13 17:21:07
 */
public class AlipayOpenMiniInnerMtopsyncModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6621562638687416446L;

	/**
	 * 支付宝小程序id
	 */
	@ApiField("alipay_app_id")
	private String alipayAppId;

	/**
	 * 业务来源 默认值mtop即可
	 */
	@ApiField("app_origin")
	private String appOrigin;

	/**
	 * MTOP鉴权appKey
	 */
	@ApiField("mtop_app_key")
	private String mtopAppKey;

	/**
	 * 用于表示调用接口的操作类型 可选值(BIND/REBIND/UNBIND)
	 */
	@ApiField("operation_type")
	private String operationType;

	public String getAlipayAppId() {
		return this.alipayAppId;
	}
	public void setAlipayAppId(String alipayAppId) {
		this.alipayAppId = alipayAppId;
	}

	public String getAppOrigin() {
		return this.appOrigin;
	}
	public void setAppOrigin(String appOrigin) {
		this.appOrigin = appOrigin;
	}

	public String getMtopAppKey() {
		return this.mtopAppKey;
	}
	public void setMtopAppKey(String mtopAppKey) {
		this.mtopAppKey = mtopAppKey;
	}

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

}
