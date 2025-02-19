package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 清除上云任务
 *
 * @author auto create
 * @since 1.0, 2019-04-30 14:25:22
 */
public class AlipayDataDataserviceAntdataassetsClearnodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7782868661317864859L;

	/**
	 * ODPS表的guid
	 */
	@ApiField("guid")
	private String guid;

	public String getGuid() {
		return this.guid;
	}
	public void setGuid(String guid) {
		this.guid = guid;
	}

}
