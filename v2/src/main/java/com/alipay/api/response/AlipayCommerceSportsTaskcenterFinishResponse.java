package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.UserTaskSimpleDto;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.sports.taskcenter.finish response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 04:26:41
 */
public class AlipayCommerceSportsTaskcenterFinishResponse extends AlipayResponse {

	private static final long serialVersionUID = 8628729213948192144L;

	/** 
	 * 用户任务
	 */
	@ApiField("user_task")
	private UserTaskSimpleDto userTask;

	public void setUserTask(UserTaskSimpleDto userTask) {
		this.userTask = userTask;
	}
	public UserTaskSimpleDto getUserTask( ) {
		return this.userTask;
	}

}
