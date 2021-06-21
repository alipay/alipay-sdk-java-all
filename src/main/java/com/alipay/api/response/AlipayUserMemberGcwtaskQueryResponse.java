package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SquareDanceTaskInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.member.gcwtask.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-10-18 17:30:26
 */
public class AlipayUserMemberGcwtaskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7876928944495946858L;

	/** 
	 * 结果码，如果失败会返回失败的结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 广场舞大赛任务（做任务领票数）
	 */
	@ApiListField("square_dance_task_info_list")
	@ApiField("square_dance_task_info")
	private List<SquareDanceTaskInfo> squareDanceTaskInfoList;

	/** 
	 * true推进任务成功，false推进任务失败
	 */
	@ApiField("success")
	private Boolean success;

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setSquareDanceTaskInfoList(List<SquareDanceTaskInfo> squareDanceTaskInfoList) {
		this.squareDanceTaskInfoList = squareDanceTaskInfoList;
	}
	public List<SquareDanceTaskInfo> getSquareDanceTaskInfoList( ) {
		return this.squareDanceTaskInfoList;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
