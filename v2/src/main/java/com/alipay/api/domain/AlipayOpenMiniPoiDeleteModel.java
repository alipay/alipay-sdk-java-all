package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序删除POI信息
 *
 * @author auto create
 * @since 1.0, 2023-01-09 11:44:13
 */
public class AlipayOpenMiniPoiDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 5199857723816879527L;

	/**
	 * poi id，地理位置标记信息
	 */
	@ApiField("poi_id")
	private String poiId;

	public String getPoiId() {
		return this.poiId;
	}
	public void setPoiId(String poiId) {
		this.poiId = poiId;
	}

}
