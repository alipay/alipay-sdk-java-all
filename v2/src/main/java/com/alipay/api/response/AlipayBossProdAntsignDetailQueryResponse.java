package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AntSignTaskResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.antsign.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 19:28:51
 */
public class AlipayBossProdAntsignDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4511218573431664819L;

	/** 
	 * 签署任务结果列表
	 */
	@ApiListField("ant_sign_task_result_list")
	@ApiField("ant_sign_task_result")
	private List<AntSignTaskResult> antSignTaskResultList;

	/** 
	 * 应用来源
	 */
	@ApiField("app_name")
	private String appName;

	/** 
	 * 业务流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 签署流程ID
	 */
	@ApiField("sign_flow_id")
	private String signFlowId;

	/** 
	 * 签署流程状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * ANT_GROUP
	 */
	@ApiField("tenant")
	private String tenant;

	public void setAntSignTaskResultList(List<AntSignTaskResult> antSignTaskResultList) {
		this.antSignTaskResultList = antSignTaskResultList;
	}
	public List<AntSignTaskResult> getAntSignTaskResultList( ) {
		return this.antSignTaskResultList;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppName( ) {
		return this.appName;
	}

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setSignFlowId(String signFlowId) {
		this.signFlowId = signFlowId;
	}
	public String getSignFlowId( ) {
		return this.signFlowId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTenant(String tenant) {
		this.tenant = tenant;
	}
	public String getTenant( ) {
		return this.tenant;
	}

}
