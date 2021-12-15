package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RpaCrawlerTaskVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.rpacrawler.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-03-08 15:16:23
 */
public class AlipayPcreditHuabeiRpacrawlerQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3852573614799134199L;

	/** 
	 * RPA任务
	 */
	@ApiListField("task_list")
	@ApiField("rpa_crawler_task_v_o")
	private List<RpaCrawlerTaskVO> taskList;

	/** 
	 * 任务统计总数
	 */
	@ApiField("total_count")
	private String totalCount;

	public void setTaskList(List<RpaCrawlerTaskVO> taskList) {
		this.taskList = taskList;
	}
	public List<RpaCrawlerTaskVO> getTaskList( ) {
		return this.taskList;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}
	public String getTotalCount( ) {
		return this.totalCount;
	}

}
