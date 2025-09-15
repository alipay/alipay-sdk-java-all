package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序poi数据同步
 *
 * @author auto create
 * @since 1.0, 2021-08-12 18:49:45
 */
public class AlipayOpenMiniDataPoiSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5218791151812878281L;

	/**
	 * poi回流数据
	 */
	@ApiField("poi_data")
	private PoiSyncData poiData;

	public PoiSyncData getPoiData() {
		return this.poiData;
	}
	public void setPoiData(PoiSyncData poiData) {
		this.poiData = poiData;
	}

}
