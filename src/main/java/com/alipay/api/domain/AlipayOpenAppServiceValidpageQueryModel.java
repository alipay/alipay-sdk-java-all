package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝生效服务分页查询
 *
 * @author auto create
 * @since 1.0, 2020-11-18 16:46:17
 */
public class AlipayOpenAppServiceValidpageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1142658927259136396L;

	/**
	 * 当前页
	 */
	@ApiField("current_page")
	private Long currentPage;

	/**
	 * 每页显示多少条
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 区域编码
	 */
	@ApiListField("region_codes")
	@ApiField("string")
	private List<String> regionCodes;

	/**
	 * 场景编码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 服务名称
	 */
	@ApiField("service_name")
	private String serviceName;

	public Long getCurrentPage() {
		return this.currentPage;
	}
	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<String> getRegionCodes() {
		return this.regionCodes;
	}
	public void setRegionCodes(List<String> regionCodes) {
		this.regionCodes = regionCodes;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getServiceName() {
		return this.serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

}
