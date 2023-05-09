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
 * @since 1.0, 2023-05-05 05:25:41
 */
public class AlipaySocialAntfarmProjectinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6882391957576217945L;

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
