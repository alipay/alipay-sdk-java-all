package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务营业时间格式类型
 *
 * @author auto create
 * @since 1.0, 2021-12-26 16:50:09
 */
public class ServiceBusinessHours extends AlipayObject {

	private static final long serialVersionUID = 5638899851951995174L;

	/**
	 * business_time对应的营业周期
	 */
	@ApiListField("business_date")
	@ApiField("string")
	private List<String> businessDate;

	/**
	 * 营业时间段,示例：[
            {
                "start_time":"10:00",
                "end_time":"14:00"
            },
            {
                "start_time":"16:00",
                "end_time":"20:00"
            }
        ]
	 */
	@ApiListField("business_time")
	@ApiField("business_time")
	private List<BusinessTime> businessTime;

	public List<String> getBusinessDate() {
		return this.businessDate;
	}
	public void setBusinessDate(List<String> businessDate) {
		this.businessDate = businessDate;
	}

	public List<BusinessTime> getBusinessTime() {
		return this.businessTime;
	}
	public void setBusinessTime(List<BusinessTime> businessTime) {
		this.businessTime = businessTime;
	}

}
