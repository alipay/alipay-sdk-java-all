package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商业关系小程序收单账号绑定
 *
 * @author auto create
 * @since 1.0, 2024-10-31 14:50:15
 */
public class AntMerchantExpandBusinessAppidpidBindModel extends AlipayObject {

	private static final long serialVersionUID = 2295295115954317188L;

	/**
	 * 小程序id，用于绑定的收单账号的小程序id
	 */
	@ApiField("app_id_bind")
	private String appIdBind;

	/**
	 * 被绑定的收单账号pid
	 */
	@ApiField("pid_bind")
	private String pidBind;

	public String getAppIdBind() {
		return this.appIdBind;
	}
	public void setAppIdBind(String appIdBind) {
		this.appIdBind = appIdBind;
	}

	public String getPidBind() {
		return this.pidBind;
	}
	public void setPidBind(String pidBind) {
		this.pidBind = pidBind;
	}

}
