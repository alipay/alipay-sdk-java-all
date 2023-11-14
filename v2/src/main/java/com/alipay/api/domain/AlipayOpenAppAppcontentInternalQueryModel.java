package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 应用内容蚂蚁内部查询
 *
 * @author auto create
 * @since 1.0, 2020-07-27 11:22:40
 */
public class AlipayOpenAppAppcontentInternalQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2556795421133433642L;

	/**
	 * 当前页码
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 分页条数，最大20
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 商户PID
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 查询模式
QUERY_MINIAPP_BY_PID: 根据PID查询小程序服务，支持分页

QUERY_FUNCTION_BY_APPID: 根据APPID查询功能服务，不支持分页

QUERY_FUNCTION_BY_SERVICE_CODES: 根据服务编码批量查询功能服务，不支持分页
	 */
	@ApiField("query_mode")
	private String queryMode;

	/**
	 * appid
	 */
	@ApiField("ref_app_id")
	private String refAppId;

	/**
	 * 请求方系统名称
	 */
	@ApiField("request_system")
	private String requestSystem;

	/**
	 * 服务编码列表，单次最多10个
	 */
	@ApiListField("service_code_list")
	@ApiField("string")
	private List<String> serviceCodeList;

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

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getQueryMode() {
		return this.queryMode;
	}
	public void setQueryMode(String queryMode) {
		this.queryMode = queryMode;
	}

	public String getRefAppId() {
		return this.refAppId;
	}
	public void setRefAppId(String refAppId) {
		this.refAppId = refAppId;
	}

	public String getRequestSystem() {
		return this.requestSystem;
	}
	public void setRequestSystem(String requestSystem) {
		this.requestSystem = requestSystem;
	}

	public List<String> getServiceCodeList() {
		return this.serviceCodeList;
	}
	public void setServiceCodeList(List<String> serviceCodeList) {
		this.serviceCodeList = serviceCodeList;
	}

}
