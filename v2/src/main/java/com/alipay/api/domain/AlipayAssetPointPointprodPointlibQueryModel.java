package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 集分宝积分库查询
 *
 * @author auto create
 * @since 1.0, 2024-05-27 14:01:11
 */
public class AlipayAssetPointPointprodPointlibQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1623477568172495534L;

	/**
	 * 集分宝积分库ID
	 */
	@ApiField("point_lib_id")
	private String pointLibId;

	public String getPointLibId() {
		return this.pointLibId;
	}
	public void setPointLibId(String pointLibId) {
		this.pointLibId = pointLibId;
	}

}
