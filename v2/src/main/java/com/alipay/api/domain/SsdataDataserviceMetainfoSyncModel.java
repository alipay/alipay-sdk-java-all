package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 上数元数据信息同步服务
 *
 * @author auto create
 * @since 1.0, 2020-12-31 13:50:44
 */
public class SsdataDataserviceMetainfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2339138768712863585L;

	/**
	 * 元数据信息
	 */
	@ApiField("meta_info")
	private String metaInfo;

	public String getMetaInfo() {
		return this.metaInfo;
	}
	public void setMetaInfo(String metaInfo) {
		this.metaInfo = metaInfo;
	}

}
