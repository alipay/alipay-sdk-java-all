package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TouchUvInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.nordermaterials.touchuv.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-03 17:32:52
 */
public class AlipayOpenSpNordermaterialsTouchuvQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3318419489273118437L;

	/** 
	 * null
	 */
	@ApiListField("touch_uv_infos")
	@ApiField("touch_uv_info")
	private List<TouchUvInfo> touchUvInfos;

	public void setTouchUvInfos(List<TouchUvInfo> touchUvInfos) {
		this.touchUvInfos = touchUvInfos;
	}
	public List<TouchUvInfo> getTouchUvInfos( ) {
		return this.touchUvInfos;
	}

}
