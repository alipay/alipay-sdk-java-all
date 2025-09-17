package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 区域
 *
 * @author auto create
 * @since 1.0, 2023-08-21 18:14:02
 */
public class Area extends AlipayObject {

	private static final long serialVersionUID = 5363517411521347199L;

	/**
	 * 围栏列表
	 */
	@ApiListField("fences")
	@ApiField("fence_dto")
	private List<FenceDto> fences;

	public List<FenceDto> getFences() {
		return this.fences;
	}
	public void setFences(List<FenceDto> fences) {
		this.fences = fences;
	}

}
