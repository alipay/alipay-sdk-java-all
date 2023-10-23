package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.xlight.task.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-16 14:31:46
 */
public class AlipayDataDataserviceXlightTaskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2671967581444889238L;

	/** 
	 * 任务完成时间
	 */
	@ApiField("finish_time")
	private Date finishTime;

	/** 
	 * 任务完成状态
	 */
	@ApiField("status")
	private String status;

	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}
	public Date getFinishTime( ) {
		return this.finishTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
