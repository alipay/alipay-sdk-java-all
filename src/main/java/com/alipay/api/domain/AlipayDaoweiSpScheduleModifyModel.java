package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 更新服务者可用时间接口
 *
 * @author auto create
 * @since 1.0, 2017-03-10 16:05:46
 */
public class AlipayDaoweiSpScheduleModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3791767163264675749L;

	/**
	 * 服务者的可用时间表。其中Duration和Unit配合使用，例如duration=30，unit=MIN表示将一天分为以30分钟一小段的时间片段。Unit：目前支持MIN（分钟）。Date：YYYY-MM-DD格式。Bitmap：根据定义的间隔长度跟单位，将date的时间切分，例如将2016-11-29整天按30分钟为一段切分为48段： 111111111111111111111111111111111110000011111111 ， 其中0表示不可用，1表示可用，如果工作日全天可用则每个分段都为1
	 */
	@ApiField("calendar_schedule")
	private CalendarScheduleInfo calendarSchedule;

	/**
	 * 商家服务者id，由商家维护的该商家下某个服务者的唯一标识，仅支持数字、字母和下划线的组合
	 */
	@ApiField("out_sp_id")
	private String outSpId;

	public CalendarScheduleInfo getCalendarSchedule() {
		return this.calendarSchedule;
	}
	public void setCalendarSchedule(CalendarScheduleInfo calendarSchedule) {
		this.calendarSchedule = calendarSchedule;
	}

	public String getOutSpId() {
		return this.outSpId;
	}
	public void setOutSpId(String outSpId) {
		this.outSpId = outSpId;
	}

}
