package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询设备上的语音
 *
 * @author auto create
 * @since 1.0, 2020-04-30 10:50:11
 */
public class AlipayCommerceIotDeviceAudioQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5426766738161324339L;

	/**
	 * 设备的唯一标识,设备id
	 */
	@ApiField("biz_tid")
	private String bizTid;

	public String getBizTid() {
		return this.bizTid;
	}
	public void setBizTid(String bizTid) {
		this.bizTid = bizTid;
	}

}
