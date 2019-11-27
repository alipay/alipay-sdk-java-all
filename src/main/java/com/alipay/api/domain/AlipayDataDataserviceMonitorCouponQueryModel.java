package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 2016新春红包央视需要查询和展示监控平台数据信息，包括以下6类数据：
1、时间维度多行数据	
2、时间维度单行数据	
3、时间维度单行单值数据
4、无时间维度多行数据
5、无时间维度单行数据
6、无时间维度单行单值数据
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:19
 */
public class AlipayDataDataserviceMonitorCouponQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1885954745576433917L;

	/**
	 * 业务标识，目前包含4种类型：
user_age_data：参与的用户年龄分布
city_top_data：国内参与城市排名
city_light_data：地图城市亮度情况
city_fly_line_data：飞线数据
	 */
	@ApiField("biz_id")
	private String bizId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

}
