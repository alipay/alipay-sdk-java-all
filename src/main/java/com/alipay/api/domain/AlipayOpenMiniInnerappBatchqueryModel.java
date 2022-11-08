package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序应用列表查询
 *
 * @author auto create
 * @since 1.0, 2022-08-22 17:11:25
 */
public class AlipayOpenMiniInnerappBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8436555749644777167L;

	/**
	 * 小程序类型
TINYAPP_TEMPLATE:模板小程序
TINYAPP_NORMAL：普通小程序
TINYAPP_PLUGIN：插件小程序
TINYAPP_WIDGET：小部件
	 */
	@ApiListField("app_type_list")
	@ApiField("string")
	private List<String> appTypeList;

	/**
	 * 开放平台开发者ID
	 */
	@ApiField("dev_id")
	private String devId;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 页数
	 */
	@ApiField("page_size")
	private Long pageSize;

	public List<String> getAppTypeList() {
		return this.appTypeList;
	}
	public void setAppTypeList(List<String> appTypeList) {
		this.appTypeList = appTypeList;
	}

	public String getDevId() {
		return this.devId;
	}
	public void setDevId(String devId) {
		this.devId = devId;
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

}
