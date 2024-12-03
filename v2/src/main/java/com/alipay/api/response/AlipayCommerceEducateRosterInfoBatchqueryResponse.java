package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EduRosterInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.roster.info.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-08 16:17:18
 */
public class AlipayCommerceEducateRosterInfoBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3524295928193383628L;

	/** 
	 * 花名册列表
	 */
	@ApiListField("roster_list")
	@ApiField("edu_roster_info")
	private List<EduRosterInfo> rosterList;

	/** 
	 * 总数量
	 */
	@ApiField("total_num")
	private Long totalNum;

	public void setRosterList(List<EduRosterInfo> rosterList) {
		this.rosterList = rosterList;
	}
	public List<EduRosterInfo> getRosterList( ) {
		return this.rosterList;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}
	public Long getTotalNum( ) {
		return this.totalNum;
	}

}
