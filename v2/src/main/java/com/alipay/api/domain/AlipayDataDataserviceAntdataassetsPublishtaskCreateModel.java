package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发布D2任务节点
 *
 * @author auto create
 * @since 1.0, 2019-04-30 14:33:25
 */
public class AlipayDataDataserviceAntdataassetsPublishtaskCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5467948546527695631L;

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
