package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务包标签元数据同步
 *
 * @author auto create
 * @since 1.0, 2026-06-12 15:32:55
 */
public class AlipayCommerceMedicalHealthmanagemServicetagSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2347474143832486343L;

	/**
	 * null
	 */
	@ApiListField("service_tag_list")
	@ApiField("service_tag_param")
	private List<ServiceTagParam> serviceTagList;

	public List<ServiceTagParam> getServiceTagList() {
		return this.serviceTagList;
	}
	public void setServiceTagList(List<ServiceTagParam> serviceTagList) {
		this.serviceTagList = serviceTagList;
	}

}
