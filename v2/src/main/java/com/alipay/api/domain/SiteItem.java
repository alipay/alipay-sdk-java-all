package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结果
 *
 * @author auto create
 * @since 1.0, 2020-04-17 11:30:53
 */
public class SiteItem extends AlipayObject {

	private static final long serialVersionUID = 1721151268942461152L;

	/**
	 * 经维度
	 */
	@ApiField("lat_1")
	private String lat1;

	/**
	 * 经维度
	 */
	@ApiField("lat_2")
	private String lat2;

	/**
	 * 经维度
	 */
	@ApiField("lat_3")
	private String lat3;

	/**
	 * 经维度
	 */
	@ApiField("lat_4")
	private String lat4;

	/**
	 * 经维度
	 */
	@ApiField("lon_1")
	private String lon1;

	/**
	 * 经维度
	 */
	@ApiField("lon_2")
	private String lon2;

	/**
	 * 经维度
	 */
	@ApiField("lon_3")
	private String lon3;

	/**
	 * 经维度
	 */
	@ApiField("lon_4")
	private String lon4;

	/**
	 * 站点名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 中心点经度
	 */
	@ApiField("s_lat")
	private String sLat;

	/**
	 * 中心点维度
	 */
	@ApiField("s_lon")
	private String sLon;

	/**
	 * 推荐打分
	 */
	@ApiField("score")
	private Long score;

	/**
	 * 站点id
	 */
	@ApiField("site_id")
	private String siteId;

	public String getLat1() {
		return this.lat1;
	}
	public void setLat1(String lat1) {
		this.lat1 = lat1;
	}

	public String getLat2() {
		return this.lat2;
	}
	public void setLat2(String lat2) {
		this.lat2 = lat2;
	}

	public String getLat3() {
		return this.lat3;
	}
	public void setLat3(String lat3) {
		this.lat3 = lat3;
	}

	public String getLat4() {
		return this.lat4;
	}
	public void setLat4(String lat4) {
		this.lat4 = lat4;
	}

	public String getLon1() {
		return this.lon1;
	}
	public void setLon1(String lon1) {
		this.lon1 = lon1;
	}

	public String getLon2() {
		return this.lon2;
	}
	public void setLon2(String lon2) {
		this.lon2 = lon2;
	}

	public String getLon3() {
		return this.lon3;
	}
	public void setLon3(String lon3) {
		this.lon3 = lon3;
	}

	public String getLon4() {
		return this.lon4;
	}
	public void setLon4(String lon4) {
		this.lon4 = lon4;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getsLat() {
		return this.sLat;
	}
	public void setsLat(String sLat) {
		this.sLat = sLat;
	}

	public String getsLon() {
		return this.sLon;
	}
	public void setsLon(String sLon) {
		this.sLon = sLon;
	}

	public Long getScore() {
		return this.score;
	}
	public void setScore(Long score) {
		this.score = score;
	}

	public String getSiteId() {
		return this.siteId;
	}
	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}

}
