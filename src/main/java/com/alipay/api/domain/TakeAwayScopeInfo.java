package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 餐饮服务标准化-外卖服务范围
 *
 * @author auto create
 * @since 1.0, 2022-01-05 14:43:20
 */
public class TakeAwayScopeInfo extends AlipayObject {

	private static final long serialVersionUID = 6239352233255332485L;

	/**
	 * 圆形范围半径（单位公里），type为CIRCULAR时必填，circular_area与polygon_area二选一
	 */
	@ApiField("circular_area")
	private String circularArea;

	/**
	 * 服务商方提供的配送范围id。
如一个门店没有配送范围ID，可以填1。
	 */
	@ApiField("code")
	private String code;

	/**
	 * 该配送区域的起送价
	 */
	@ApiField("min_price")
	private String minPrice;

	/**
	 * 多边形范围，type为POLYGON时必填;["lon1;lat1","lon2;lat2","lon3;lat3"] 3个点<=每个多边形<10
""中是多边形中的点，
 ;分隔经纬度，
	 */
	@ApiListField("polygon_area")
	@ApiField("string")
	private List<String> polygonArea;

	/**
	 * 该配送区域的配送费
	 */
	@ApiField("shipping_area")
	private String shippingArea;

	/**
	 * 配置范围类型，枚举：
POLYGON：表示配送范围由多边形组成
CIRCULAR：表示配送范围由圆形组成
	 */
	@ApiField("type")
	private String type;

	public String getCircularArea() {
		return this.circularArea;
	}
	public void setCircularArea(String circularArea) {
		this.circularArea = circularArea;
	}

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getMinPrice() {
		return this.minPrice;
	}
	public void setMinPrice(String minPrice) {
		this.minPrice = minPrice;
	}

	public List<String> getPolygonArea() {
		return this.polygonArea;
	}
	public void setPolygonArea(List<String> polygonArea) {
		this.polygonArea = polygonArea;
	}

	public String getShippingArea() {
		return this.shippingArea;
	}
	public void setShippingArea(String shippingArea) {
		this.shippingArea = shippingArea;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
