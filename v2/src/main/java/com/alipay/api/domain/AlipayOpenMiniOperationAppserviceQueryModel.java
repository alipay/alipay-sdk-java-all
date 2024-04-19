package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询应用子服务信息
 *
 * @author auto create
 * @since 1.0, 2020-12-07 16:35:45
 */
public class AlipayOpenMiniOperationAppserviceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4314732575149672383L;

	/**
	 * 要查询的子服务所属的小程序应用id
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 查询应用子服务页数，默认为1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 查询应用子服务每页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 子服务名称
	 */
	@ApiField("service_name")
	private String serviceName;

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
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

	public String getServiceName() {
		return this.serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

}
