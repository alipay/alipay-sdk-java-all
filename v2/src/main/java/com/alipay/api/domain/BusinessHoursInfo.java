package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 门店营业时间
 *
 * @author auto create
 * @since 1.0, 2021-07-08 19:46:00
 */
public class BusinessHoursInfo extends AlipayObject {

	private static final long serialVersionUID = 3193855224894198457L;

	/**
	 * 营业日：周一、周二、周三、周四、周五、周六、周日
	 */
	@ApiListField("business_date")
	@ApiField("string")
	private List<String> businessDate;

	/**
	 * 结束营业时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 其他描述
	 */
	@ApiField("extra_desc")
	private String extraDesc;

	/**
	 * 开始营业时间
	 */
	@ApiField("start_time")
	private String startTime;

	public List<String> getBusinessDate() {
		return this.businessDate;
	}
	public void setBusinessDate(List<String> businessDate) {
		this.businessDate = businessDate;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getExtraDesc() {
		return this.extraDesc;
	}
	public void setExtraDesc(String extraDesc) {
		this.extraDesc = extraDesc;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
