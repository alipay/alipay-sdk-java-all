package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OperateFailRes;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.adcampaign.batchcreativestatus.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-06 19:32:27
 */
public class AlipayDataDataserviceAdcampaignBatchcreativestatusModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4476552985139649817L;

	/** 
	 * 操作失败创意id集合
	 */
	@ApiListField("fail_res_list")
	@ApiField("operate_fail_res")
	private List<OperateFailRes> failResList;

	/** 
	 * 操作成功创意id集合
	 */
	@ApiListField("success_id_list")
	@ApiField("number")
	private List<Long> successIdList;

	public void setFailResList(List<OperateFailRes> failResList) {
		this.failResList = failResList;
	}
	public List<OperateFailRes> getFailResList( ) {
		return this.failResList;
	}

	public void setSuccessIdList(List<Long> successIdList) {
		this.successIdList = successIdList;
	}
	public List<Long> getSuccessIdList( ) {
		return this.successIdList;
	}

}
