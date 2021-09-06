package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 默认扩展区创建接口
 *
 * @author auto create
 * @since 1.0, 2020-08-10 20:12:08
 */
public class AlipayOpenPublicDefaultExtensionCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5817119981921535837L;

	/**
	 * 默认扩展区列表，最多包含3个扩展区
	 */
	@ApiListField("areas")
	@ApiField("extension_area")
	private List<ExtensionArea> areas;

	public List<ExtensionArea> getAreas() {
		return this.areas;
	}
	public void setAreas(List<ExtensionArea> areas) {
		this.areas = areas;
	}

}
