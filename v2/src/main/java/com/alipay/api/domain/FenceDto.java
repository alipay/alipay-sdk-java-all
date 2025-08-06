package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 区域
 *
 * @author auto create
 * @since 1.0, 2023-08-10 17:46:31
 */
public class FenceDto extends AlipayObject {

	private static final long serialVersionUID = 5375793994698996796L;

	/**
	 * 围栏坐标点列表
	 */
	@ApiListField("coordinates")
	@ApiField("gps_info")
	private List<GpsInfo> coordinates;

	/**
	 * 围栏属性
	 */
	@ApiField("properties")
	private String properties;

	public List<GpsInfo> getCoordinates() {
		return this.coordinates;
	}
	public void setCoordinates(List<GpsInfo> coordinates) {
		this.coordinates = coordinates;
	}

	public String getProperties() {
		return this.properties;
	}
	public void setProperties(String properties) {
		this.properties = properties;
	}

}
