package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开发者账号绑定关系解绑
 *
 * @author auto create
 * @since 1.0, 2022-05-13 17:20:42
 */
public class AlipayOpenAccountAliyunUnbindModel extends AlipayObject {

	private static final long serialVersionUID = 7422212757165422231L;

	/**
	 * 与阿里云账号绑定的第三方平台的账号ID
	 */
	@ApiField("bind_id")
	private String bindId;

	/**
	 * Havana绑定站点
	 */
	@ApiField("havana_bind_station")
	private String havanaBindStation;

	/**
	 * 阿里云账号pk
	 */
	@ApiField("pk")
	private String pk;

	public String getBindId() {
		return this.bindId;
	}
	public void setBindId(String bindId) {
		this.bindId = bindId;
	}

	public String getHavanaBindStation() {
		return this.havanaBindStation;
	}
	public void setHavanaBindStation(String havanaBindStation) {
		this.havanaBindStation = havanaBindStation;
	}

	public String getPk() {
		return this.pk;
	}
	public void setPk(String pk) {
		this.pk = pk;
	}

}
