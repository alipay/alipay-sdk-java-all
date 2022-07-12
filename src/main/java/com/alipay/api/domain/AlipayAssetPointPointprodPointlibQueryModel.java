package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 集分宝积分库查询
 *
 * @author auto create
 * @since 1.0, 2019-08-29 17:45:49
 */
public class AlipayAssetPointPointprodPointlibQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2282367791484926914L;

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
