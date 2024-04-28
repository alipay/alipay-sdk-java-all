package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 占比查询接口
 *
 * @author auto create
 * @since 1.0, 2019-09-06 20:54:35
 */
public class AlipayDataDataserviceConsumRatioQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3272974415113515673L;

	/**
	 * 区域编码，多个编码的时候用英文逗号分割，最多不超过20个
	 */
	@ApiField("area_code")
	private String areaCode;

	/**
	 * 区域类型，枚举值：city(城市)、county(区县)、town(街道)、trading(商圈)
	 */
	@ApiField("area_type")
	private String areaType;

	/**
	 * 数据类型，枚举值：dist(来源地占比)、gender(性别占比)、capacity(消费能力占比)、age(年龄占比)
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 查询占比的结束日期，格式为：4位年+2位月，最晚为当前月的上一月
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 查询指数的开始日期，格式为：4位年+2位月，最早为近6个月的开始月
	 */
	@ApiField("start_date")
	private String startDate;

	public String getAreaCode() {
		return this.areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getAreaType() {
		return this.areaType;
	}
	public void setAreaType(String areaType) {
		this.areaType = areaType;
	}

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
