package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 指数查询接口
 *
 * @author auto create
 * @since 1.0, 2019-09-06 20:54:21
 */
public class AlipayDataDataserviceConsumIndexQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7391283117127888624L;

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
	 * 分类，枚举值：all(无限定)、wd(工作日)、hd(节假日)、医疗教育、商场超市、服饰珠宝、酒店及住宿相关、餐饮、出行服务
	 */
	@ApiField("category")
	private String category;

	/**
	 * 数据类型，枚举值：consum(消费指数)、people(消费满足度指数)、saturation(消费饱和度指数)
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 查询日期，最早为前6个月，例如如当前为201907，则此参数最早可为201901。
	 */
	@ApiField("period")
	private String period;

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

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getPeriod() {
		return this.period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}

}
