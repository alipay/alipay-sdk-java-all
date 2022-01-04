package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AntfarmProjectInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.antfarm.projectinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-21 21:48:39
 */
public class AlipaySocialAntfarmProjectinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4463485593255321215L;

	/** 
	 * 正在进行的项目，含当前正在进行的标的物
	 */
	@ApiListField("project_list")
	@ApiField("antfarm_project_info")
	private List<AntfarmProjectInfo> projectList;

	public void setProjectList(List<AntfarmProjectInfo> projectList) {
		this.projectList = projectList;
	}
	public List<AntfarmProjectInfo> getProjectList( ) {
		return this.projectList;
	}

}
