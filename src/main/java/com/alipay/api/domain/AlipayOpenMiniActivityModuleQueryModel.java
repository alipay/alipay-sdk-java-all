package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序活动会场查询
 *
 * @author auto create
 * @since 1.0, 2019-10-16 15:51:51
 */
public class AlipayOpenMiniActivityModuleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6118693783667231697L;

	/**
	 * 地区码，比如杭州的城市码是300100
	 */
	@ApiField("lbs_code")
	private String lbsCode;

	/**
	 * 模块编码，模块的唯一标识，可根据该编码查询模块数据信息
	 */
	@ApiField("module_code")
	private String moduleCode;

	/**
	 * 页码，代表请求的是第几页的数据
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 页数量，代表每页请求的数据的数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getLbsCode() {
		return this.lbsCode;
	}
	public void setLbsCode(String lbsCode) {
		this.lbsCode = lbsCode;
	}

	public String getModuleCode() {
		return this.moduleCode;
	}
	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
