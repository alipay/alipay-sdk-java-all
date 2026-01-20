package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ObjStatus;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: robby.open.object.info.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-05 17:47:43
 */
public class RobbyOpenObjectInfoBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1134912916567485186L;

	/** 
	 * null
	 */
	@ApiListField("object_status_list")
	@ApiField("obj_status")
	private List<ObjStatus> objectStatusList;

	public void setObjectStatusList(List<ObjStatus> objectStatusList) {
		this.objectStatusList = objectStatusList;
	}
	public List<ObjStatus> getObjectStatusList( ) {
		return this.objectStatusList;
	}

}
