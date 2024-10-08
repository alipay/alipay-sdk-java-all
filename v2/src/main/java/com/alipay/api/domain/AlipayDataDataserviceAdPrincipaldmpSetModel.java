package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户人群设置
 *
 * @author auto create
 * @since 1.0, 2021-05-08 11:46:05
 */
public class AlipayDataDataserviceAdPrincipaldmpSetModel extends AlipayObject {

	private static final long serialVersionUID = 8829997716291947528L;

	/**
	 * 灯火平台提供给外部系统的访问token
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 商户人群id
	 */
	@ApiField("data_id")
	private String dataId;

	/**
	 * 人群状态：
ENABLE:开启
DISABLE:关闭
	 */
	@ApiField("status")
	private String status;

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public String getDataId() {
		return this.dataId;
	}
	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
