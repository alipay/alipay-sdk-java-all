package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EduManagerInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.manager.info.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-09 10:02:29
 */
public class AlipayCommerceEducateManagerInfoBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7289393314967786352L;

	/** 
	 * 管理员列表
	 */
	@ApiListField("manager_list")
	@ApiField("edu_manager_info")
	private List<EduManagerInfo> managerList;

	/** 
	 * 总数量
	 */
	@ApiField("total_num")
	private Long totalNum;

	public void setManagerList(List<EduManagerInfo> managerList) {
		this.managerList = managerList;
	}
	public List<EduManagerInfo> getManagerList( ) {
		return this.managerList;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}
	public Long getTotalNum( ) {
		return this.totalNum;
	}

}
