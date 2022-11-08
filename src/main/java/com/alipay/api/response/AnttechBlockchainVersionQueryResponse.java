package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IterationVersionInfoDeliverObj;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.version.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-08 17:51:47
 */
public class AnttechBlockchainVersionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2856132388468487618L;

	/** 
	 * 橡实平台版本信息对象集合
	 */
	@ApiListField("iteration_version_info_deliver_obj_list")
	@ApiField("iteration_version_info_deliver_obj")
	private List<IterationVersionInfoDeliverObj> iterationVersionInfoDeliverObjList;

	public void setIterationVersionInfoDeliverObjList(List<IterationVersionInfoDeliverObj> iterationVersionInfoDeliverObjList) {
		this.iterationVersionInfoDeliverObjList = iterationVersionInfoDeliverObjList;
	}
	public List<IterationVersionInfoDeliverObj> getIterationVersionInfoDeliverObjList( ) {
		return this.iterationVersionInfoDeliverObjList;
	}

}
