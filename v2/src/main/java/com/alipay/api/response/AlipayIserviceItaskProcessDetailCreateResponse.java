package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ExtendFieldInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.itask.process.detail.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:59
 */
public class AlipayIserviceItaskProcessDetailCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7779173228717778776L;

	/** 
	 * 蚂蚁工单编号
	 */
	@ApiField("alipay_process_id")
	private String alipayProcessId;

	/** 
	 * 工单处理状态，枚举值（CREATED，PROCESSING，COMPLETED，CANCELED）
	 */
	@ApiField("alipay_process_status")
	private String alipayProcessStatus;

	/** 
	 * 工单响应扩展信息，业务属性信息都放置在此字段。最多10个字段。
	 */
	@ApiListField("extend_field_infos")
	@ApiField("extend_field_info")
	private List<ExtendFieldInfo> extendFieldInfos;

	/** 
	 * 工单信息唯一标识ID，简写为puid。为app_name、process_no和alipay_process_id共同组合而成，供工单推进接口使用。
	 */
	@ApiField("process_unique_id")
	private String processUniqueId;

	public void setAlipayProcessId(String alipayProcessId) {
		this.alipayProcessId = alipayProcessId;
	}
	public String getAlipayProcessId( ) {
		return this.alipayProcessId;
	}

	public void setAlipayProcessStatus(String alipayProcessStatus) {
		this.alipayProcessStatus = alipayProcessStatus;
	}
	public String getAlipayProcessStatus( ) {
		return this.alipayProcessStatus;
	}

	public void setExtendFieldInfos(List<ExtendFieldInfo> extendFieldInfos) {
		this.extendFieldInfos = extendFieldInfos;
	}
	public List<ExtendFieldInfo> getExtendFieldInfos( ) {
		return this.extendFieldInfos;
	}

	public void setProcessUniqueId(String processUniqueId) {
		this.processUniqueId = processUniqueId;
	}
	public String getProcessUniqueId( ) {
		return this.processUniqueId;
	}

}
