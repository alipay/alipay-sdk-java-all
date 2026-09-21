package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云陪诊通用详情卡扩展字段
 *
 * @author auto create
 * @since 1.0, 2026-09-17 14:24:29
 */
public class YpzServiceDetailCardExt extends AlipayObject {

	private static final long serialVersionUID = 7179694374373494557L;

	/**
	 * 陪诊师名称
	 */
	@ApiField("attendant_name")
	private String attendantName;

	public String getAttendantName() {
		return this.attendantName;
	}
	public void setAttendantName(String attendantName) {
		this.attendantName = attendantName;
	}

}
