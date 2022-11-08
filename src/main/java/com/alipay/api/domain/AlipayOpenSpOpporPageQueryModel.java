package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商机作业列表查询
 *
 * @author auto create
 * @since 1.0, 2022-05-16 15:45:02
 */
public class AlipayOpenSpOpporPageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4742856444869287147L;

	/**
	 * 服务商pid
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 页数
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 页大小
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 作业记录状态列表,以,拼接传入
	 */
	@ApiField("status_list")
	private String statusList;

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getStatusList() {
		return this.statusList;
	}
	public void setStatusList(String statusList) {
		this.statusList = statusList;
	}

}
