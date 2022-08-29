package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ExtendFieldInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.itask.process.detail.modify response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayIserviceItaskProcessDetailModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2628669899799378639L;

	/** 
	 * 蚂蚁工单编号
	 */
	@ApiField("alipay_process_id")
	private String alipayProcessId;

	/** 
	 * 工单处理状态，枚举（CREATED，PROCESSING，COMPLETED，CANCELED）
	 */
	@ApiField("alipay_process_status")
	private String alipayProcessStatus;

	/** 
	 * 外部工单业务扩展字段，业务属性信息都放置在此字段。最多10个字段。
	 */
	@ApiListField("extend_field_infos")
	@ApiField("extend_field_info")
	private List<ExtendFieldInfo> extendFieldInfos;

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

}
