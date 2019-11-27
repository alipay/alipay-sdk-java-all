package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询逆地理编码信息
 *
 * @author auto create
 * @since 1.0, 2018-12-14 17:16:47
 */
public class AmapMapMapserviceRegeoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7671937961139133442L;

	/**
	 * 用于控制返回结果。extensions 参数默认取值是 base，也就是返回基本地址信息；extensions 参数取值为 all 时会返回基本地址信息、附近 POI 内容、道路信息以及道路交叉口信息。
	 */
	@ApiField("extensions")
	private String extensions;

	/**
	 * 经纬度坐标，不唯一。传入内容规则：经度在前，纬度在后，经纬度间以“,”分割，经纬度小数点后不要超过 6 位。
	 */
	@ApiField("location")
	private String location;

	/**
	 * 搜索半径，不唯一。radius取值范围在0~3000，默认是1000。单位：米。
	 */
	@ApiField("radius")
	private String radius;

	public String getExtensions() {
		return this.extensions;
	}
	public void setExtensions(String extensions) {
		this.extensions = extensions;
	}

	public String getLocation() {
		return this.location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	public String getRadius() {
		return this.radius;
	}
	public void setRadius(String radius) {
		this.radius = radius;
	}

}
