package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.Addresscomponent;
import com.alipay.api.domain.AOIinfo;
import com.alipay.api.domain.POIinfo;
import com.alipay.api.domain.Roadinter;
import com.alipay.api.domain.Road;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: amap.map.mapservice.regeo.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AmapMapMapserviceRegeoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7336777379418988916L;

	/** 
	 * 地址元素
	 */
	@ApiField("address_component")
	private Addresscomponent addressComponent;

	/** 
	 * AOI信息列表
	 */
	@ApiListField("aois")
	@ApiField("a_o_iinfo")
	private List<AOIinfo> aois;

	/** 
	 * 结构化地址信息包括：省份＋城市＋区县＋城镇＋乡村＋街道＋门牌号码。如果坐标点处于海域范围内，则结构化地址信息为：省份＋城市＋区县＋海域信息
	 */
	@ApiField("formatted_address")
	private String formattedAddress;

	/** 
	 * POI信息列表
	 */
	@ApiListField("pois")
	@ApiField("p_o_iinfo")
	private List<POIinfo> pois;

	/** 
	 * 道路交叉口列表
	 */
	@ApiListField("roadinters")
	@ApiField("roadinter")
	private List<Roadinter> roadinters;

	/** 
	 * 道路信息列表
	 */
	@ApiListField("roads")
	@ApiField("road")
	private List<Road> roads;

	public void setAddressComponent(Addresscomponent addressComponent) {
		this.addressComponent = addressComponent;
	}
	public Addresscomponent getAddressComponent( ) {
		return this.addressComponent;
	}

	public void setAois(List<AOIinfo> aois) {
		this.aois = aois;
	}
	public List<AOIinfo> getAois( ) {
		return this.aois;
	}

	public void setFormattedAddress(String formattedAddress) {
		this.formattedAddress = formattedAddress;
	}
	public String getFormattedAddress( ) {
		return this.formattedAddress;
	}

	public void setPois(List<POIinfo> pois) {
		this.pois = pois;
	}
	public List<POIinfo> getPois( ) {
		return this.pois;
	}

	public void setRoadinters(List<Roadinter> roadinters) {
		this.roadinters = roadinters;
	}
	public List<Roadinter> getRoadinters( ) {
		return this.roadinters;
	}

	public void setRoads(List<Road> roads) {
		this.roads = roads;
	}
	public List<Road> getRoads( ) {
		return this.roads;
	}

}
