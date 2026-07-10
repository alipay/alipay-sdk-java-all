package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CoordinateInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.medagent.pic.identify response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-10 16:13:52
 */
public class AlipayCommerceMedicalMedagentPicIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8686661963698845984L;

	/** 
	 * 图片内容坐标信息
	 */
	@ApiListField("data")
	@ApiField("coordinate_info")
	private List<CoordinateInfo> data;

	public void setData(List<CoordinateInfo> data) {
		this.data = data;
	}
	public List<CoordinateInfo> getData( ) {
		return this.data;
	}

}
