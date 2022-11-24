package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 餐饮服务标准化-自提、排队服务范围
 *
 * @author auto create
 * @since 1.0, 2021-09-14 14:56:22
 */
public class ScopeInfo extends AlipayObject {

	private static final long serialVersionUID = 4669969376449395453L;

	/**
	 * 圆形范围半径（单位公里），type为CIRCULAR时必填
	 */
	@ApiField("circular_area")
	private String circularArea;

	/**
	 * 多边形范围，type为POLYGON时必填;["lon1;lat1","lon2;lat2","lon3;lat3"] 3个点<=每个多边形<10
""中是多边形中的点，
 ;分隔经纬度，
	 */
	@ApiListField("polygon_area")
	@ApiField("string")
	private List<String> polygonArea;

	/**
	 * 枚举：
NO_RESTRICTIONS：表示没有下单距离限制
POLYGON：表示限制下单范围由多边形组成
CIRCULAR：表示限制下单范围由圆形组成
	 */
	@ApiField("type")
	private String type;

	public String getCircularArea() {
		return this.circularArea;
	}
	public void setCircularArea(String circularArea) {
		this.circularArea = circularArea;
	}

	public List<String> getPolygonArea() {
		return this.polygonArea;
	}
	public void setPolygonArea(List<String> polygonArea) {
		this.polygonArea = polygonArea;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
