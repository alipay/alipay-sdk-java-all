package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 精选服务海景房卡片服务内容同步
 *
 * @author auto create
 * @since 1.0, 2019-10-28 20:33:22
 */
public class AntfortuneEquityServiceCardSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1147438677879946816L;

	/**
	 * 服务动态信息列表
	 */
	@ApiListField("contents")
	@ApiField("fs_service_dynamic_info")
	private List<FsServiceDynamicInfo> contents;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 服务id
	 */
	@ApiField("service_id")
	private String serviceId;

	public List<FsServiceDynamicInfo> getContents() {
		return this.contents;
	}
	public void setContents(List<FsServiceDynamicInfo> contents) {
		this.contents = contents;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

}
