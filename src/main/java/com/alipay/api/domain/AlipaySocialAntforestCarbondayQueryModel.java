package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询森林碳账户日数据
 *
 * @author auto create
 * @since 1.0, 2021-11-17 17:12:59
 */
public class AlipaySocialAntforestCarbondayQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8846695815778439417L;

	/**
	 * 碳账户绿色场景类型，类型为字符串数组。
	 */
	@ApiListField("carbon_type")
	@ApiField("string")
	private List<String> carbonType;

	/**
	 * 日期（选填），不输入时间，查询最近30天数据， 输入时间，查询指定日期数据
	 */
	@ApiField("day")
	private Date day;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public List<String> getCarbonType() {
		return this.carbonType;
	}
	public void setCarbonType(List<String> carbonType) {
		this.carbonType = carbonType;
	}

	public Date getDay() {
		return this.day;
	}
	public void setDay(Date day) {
		this.day = day;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
