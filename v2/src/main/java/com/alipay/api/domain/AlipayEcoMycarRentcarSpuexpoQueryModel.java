package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租车分城市SPU曝光排名查询
 *
 * @author auto create
 * @since 1.0, 2025-04-07 14:48:58
 */
public class AlipayEcoMycarRentcarSpuexpoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3526414417286495719L;

	/**
	 * 查询某日的曝光数据，最多支持近七天
	 */
	@ApiField("bizdate")
	private Date bizdate;

	/**
	 * 车型类型
	 */
	@ApiField("car_type")
	private String carType;

	/**
	 * 城市名
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 品牌名称
	 */
	@ApiField("veh_name")
	private String vehName;

	public Date getBizdate() {
		return this.bizdate;
	}
	public void setBizdate(Date bizdate) {
		this.bizdate = bizdate;
	}

	public String getCarType() {
		return this.carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getVehName() {
		return this.vehName;
	}
	public void setVehName(String vehName) {
		this.vehName = vehName;
	}

}
