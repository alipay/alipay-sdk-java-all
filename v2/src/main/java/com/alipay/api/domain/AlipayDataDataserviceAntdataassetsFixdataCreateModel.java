package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建补数据流程
 *
 * @author auto create
 * @since 1.0, 2019-04-30 14:22:45
 */
public class AlipayDataDataserviceAntdataassetsFixdataCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5493349321583714612L;

	/**
	 * 该字段指定补数据的结束分区
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * ODPS表的guid
	 */
	@ApiField("guid")
	private String guid;

	/**
	 * 该字段指定补数据的开始分区
	 */
	@ApiField("start_date")
	private String startDate;

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getGuid() {
		return this.guid;
	}
	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
