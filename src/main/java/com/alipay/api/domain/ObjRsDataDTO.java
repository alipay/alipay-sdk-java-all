package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Nimitz ObjRsDataDTO
 *
 * @author auto create
 * @since 1.0, 2022-06-13 17:00:35
 */
public class ObjRsDataDTO extends AlipayObject {

	private static final long serialVersionUID = 3241585937866437893L;

	/**
	 * obj 维度
	 */
	@ApiField("obj_dim_key")
	private String objDimKey;

	/**
	 * 数据
	 */
	@ApiField("rs_data")
	private RsData rsData;

	public String getObjDimKey() {
		return this.objDimKey;
	}
	public void setObjDimKey(String objDimKey) {
		this.objDimKey = objDimKey;
	}

	public RsData getRsData() {
		return this.rsData;
	}
	public void setRsData(RsData rsData) {
		this.rsData = rsData;
	}

}
